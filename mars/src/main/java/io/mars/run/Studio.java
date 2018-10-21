package io.mars.run;

import javax.inject.Inject;

import io.vertigo.app.AutoCloseableApp;
import io.vertigo.app.config.AppConfig;
import io.vertigo.app.config.DefinitionProviderConfig;
import io.vertigo.app.config.ModuleConfig;
import io.vertigo.commons.impl.CommonsFeatures;
import io.vertigo.commons.plugins.cache.memory.MemoryCachePlugin;
import io.vertigo.core.component.di.injector.DIInjector;
import io.vertigo.core.param.Param;
import io.vertigo.core.plugins.resource.classpath.ClassPathResourceResolverPlugin;
import io.vertigo.dynamo.impl.DynamoFeatures;
import io.vertigo.dynamo.plugins.environment.DynamoDefinitionProvider;
import io.vertigo.studio.impl.mda.MdaManagerImpl;
import io.vertigo.studio.mda.MdaManager;
import io.vertigo.studio.plugins.mda.domain.java.DomainGeneratorPlugin;
import io.vertigo.studio.plugins.mda.domain.sql.SqlGeneratorPlugin;
import io.vertigo.studio.plugins.mda.file.FileInfoGeneratorPlugin;
import io.vertigo.studio.plugins.mda.task.TaskGeneratorPlugin;

public class Studio {

	private static AppConfig buildAppConfig() {
		// @formatter:off
		return  AppConfig.builder()
				.beginBoot()
				.withLocales("fr_FR")
				.addPlugin(ClassPathResourceResolverPlugin.class)
				.endBoot()
				.addModule(new CommonsFeatures()
						.withCache(MemoryCachePlugin.class)
						.withScript()
						.build())
				.addModule(new DynamoFeatures().build())
				//----Definitions
				.addModule(ModuleConfig.builder("ressources")
						.addDefinitionProvider(DefinitionProviderConfig.builder(DynamoDefinitionProvider.class)
								.addDefinitionResource("kpr", "mda/generation.kpr")
								.build())
						.build())
				// ---StudioFeature
				.addModule( ModuleConfig.builder("studio")
					.addComponent(MdaManager.class, MdaManagerImpl.class,
							Param.of("targetGenDir", "src/main/javagen/"),
							Param.of("encoding", "UTF-8"),
							Param.of("projectPackageName", "io.mars"))

					.addPlugin(DomainGeneratorPlugin.class,
							Param.of("targetSubDir", "."),
							Param.of("generateDtResources", "false"),
							Param.of("generateDtDefinitions", "true"),
							Param.of("generateDtObject", "true"),
							Param.of("generateJpaAnnotations", "false"))
					.addPlugin(TaskGeneratorPlugin.class,
						Param.of("targetSubDir", "."))

					.addPlugin(FileInfoGeneratorPlugin.class,
							Param.of("targetSubDir", "."))
					.addPlugin(SqlGeneratorPlugin.class,
							Param.of("targetSubDir", "sqlgen"),
							Param.of("baseCible", "H2"),
							Param.of("generateDrop", "false"))
					.build())
				.build();
		// @formatter:on

	}

	@Inject
	private MdaManager mdaManager;

	public static void main(final String[] args) {
		try (final AutoCloseableApp app = new AutoCloseableApp(buildAppConfig())) {
			final Studio sample = new Studio();
			DIInjector.injectMembers(sample, app.getComponentSpace());
			//-----
			sample.cleanGenerate();
		}
	}

	void cleanGenerate() {
		mdaManager.clean();
		mdaManager.generate().displayResultMessage(System.out);
	}
}
