package io.vertigo.samples.hello.config;

import io.vertigo.app.config.AppConfig;
import io.vertigo.app.config.ModuleConfig;
import io.vertigo.commons.impl.CommonsFeatures;
import io.vertigo.samples.hello.webservices.HelloWebServices;
import io.vertigo.vega.VegaFeatures;

public final class HelloConfigurator {
	public static AppConfig config(final int port) {
		return AppConfig.builder()
				.addModule(new CommonsFeatures().build())
				.addModule(new VegaFeatures().withEmbeddedServer(port).build())
				//-----Declaration of a module named 'Hello' which contains a webservice component.
				.addModule(ModuleConfig.builder("Hello")
						.addComponent(HelloWebServices.class)
						.build())
				.build();
	}
}
