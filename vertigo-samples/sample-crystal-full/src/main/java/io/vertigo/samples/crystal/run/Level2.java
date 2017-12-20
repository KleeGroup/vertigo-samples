package io.vertigo.samples.crystal.run;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;

import io.vertigo.app.AutoCloseableApp;
import io.vertigo.app.config.AppConfigBuilder;
import io.vertigo.app.config.ModuleConfig;
import io.vertigo.core.component.di.injector.DIInjector;
import io.vertigo.samples.SamplesPAO;
import io.vertigo.samples.crystal.CrystalPAO;
import io.vertigo.samples.crystal.config.SampleConfigBuilder;
import io.vertigo.samples.crystal.dao.ActorDAO;
import io.vertigo.samples.crystal.dao.MovieDAO;
import io.vertigo.samples.crystal.dao.RoleDAO;
import io.vertigo.samples.crystal.domain.Movie;
import io.vertigo.samples.crystal.services.MovieSearchLoader;
import io.vertigo.samples.crystal.services.MovieServices;
import io.vertigo.samples.crystal.services.MovieServicesImpl;
import io.vertigo.samples.crystal.webservices.MovieWebServices;

public class Level2 {

	@Inject
	private MovieServices movieServices;

	public static void main(final String[] args) {
		final AppConfigBuilder appConfigBuilder = SampleConfigBuilder.createAppConfigBuilder();
		appConfigBuilder
				.addModule(ModuleConfig.builder("stepDao")
						.addComponent(ActorDAO.class)
						.addComponent(RoleDAO.class)
						.addComponent(SamplesPAO.class)
						.build())
				.addModule(defaultSampleModule());
		try (final AutoCloseableApp app = new AutoCloseableApp(appConfigBuilder.build())) {
			final Level2 sample = new Level2();
			DIInjector.injectMembers(sample, app.getComponentSpace());
			//-----
			sample.step1();
			sample.step2();
			sample.step3();
		}
	}

	private static ModuleConfig defaultSampleModule() {
		return ModuleConfig.builder("Sample")
				.addComponent(MovieDAO.class)
				.addComponent(CrystalPAO.class)
				.addComponent(MovieServices.class, MovieServicesImpl.class)
				.addComponent(MovieSearchLoader.class)
				.addComponent(MovieWebServices.class)
				.build();
	}

	void step1() {
		movieServices.manipulateAccessors(3678598L);
	}

	void step2() {
		final Movie movie = movieServices.loadMovieWithRoles(3678598L);
		LogManager.getLogger(this.getClass()).info("movie roles : ", movie.role().get());

		final Movie movieReset = movieServices.loadMovieWithRolesAndReset(3678598L);
		LogManager.getLogger(this.getClass()).info("movie roles reset: ", movieReset.role());
	}

	void step3() {
		LogManager.getLogger(this.getClass()).info(movieServices.getRolesByMovie(3678598L));
	}

}