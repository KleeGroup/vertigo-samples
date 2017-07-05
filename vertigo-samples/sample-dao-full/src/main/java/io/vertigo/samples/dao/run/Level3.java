package io.vertigo.samples.dao.run;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import io.vertigo.app.AutoCloseableApp;
import io.vertigo.app.config.AppConfigBuilder;
import io.vertigo.app.config.ModuleConfigBuilder;
import io.vertigo.core.component.di.injector.DIInjector;
import io.vertigo.samples.dao.config.SampleConfigBuilder;
import io.vertigo.samples.dao.dao.ActorDAO;
import io.vertigo.samples.dao.dao.CountryDAO;
import io.vertigo.samples.dao.dao.MovieDAO;
import io.vertigo.samples.dao.dao.MyActorDAO;
import io.vertigo.samples.dao.dao.MyCountryDAO;
import io.vertigo.samples.dao.dao.MyMovieDAO;
import io.vertigo.samples.dao.dao.MyRoleDAO;
import io.vertigo.samples.dao.dao.RoleDAO;
import io.vertigo.samples.dao.domain.Actor;
import io.vertigo.samples.dao.services.ActorServices;
import io.vertigo.samples.dao.services.ActorServicesImpl;
import io.vertigo.samples.dao.services.MovieServices;
import io.vertigo.samples.dao.services.MovieServicesImpl;
import io.vertigo.samples.dao.services.RepriseServices;
import io.vertigo.samples.dao.services.RepriseServicesImpl;
import io.vertigo.samples.reprise.ReprisePAO;

public class Level3 {

	private final Logger LOGGER = Logger.getLogger(this.getClass());
	private static final Long STARWARS_ID = 3678598L;

	@Inject
	private MovieServices movieServices;
	@Inject
	private ActorServices actorServices;

	public static void main(final String[] args) {
		final AppConfigBuilder appConfigBuilder = SampleConfigBuilder.createAppConfigBuilderWithoutCrebase();
		appConfigBuilder.addModule(new ModuleConfigBuilder("mineDAO")
				.withNoAPI()
				.addComponent(MyMovieDAO.class)
				.addComponent(MyActorDAO.class)
				.addComponent(MyRoleDAO.class)
				.addComponent(MyCountryDAO.class)
				.addComponent(MovieDAO.class)
				.addComponent(ActorDAO.class)
				.addComponent(RoleDAO.class)
				.addComponent(CountryDAO.class)
				.addComponent(ReprisePAO.class)
				.build())
				.addModule(new ModuleConfigBuilder("mineServices")
						.addComponent(MovieServices.class, MovieServicesImpl.class)
						.addComponent(ActorServices.class, ActorServicesImpl.class)
						.addComponent(RepriseServices.class, RepriseServicesImpl.class)
						.build());
		try (final AutoCloseableApp app = new AutoCloseableApp(appConfigBuilder.build())) {
			final Level3 level3 = new Level3();
			DIInjector.injectMembers(level3, app.getComponentSpace());
			//-----
			level3.step1();
			level3.step2();
			level3.step3();
		}
	}

	void step1() {
		LOGGER.info(movieServices.findMoviesByCriteria("Star Wars", 1977));
	}

	void step2() {
		LOGGER.info(movieServices.getActorsByMovie1(STARWARS_ID));
	}

	void step3() {
		final Actor actor = new Actor();
		actor.setName("Direction Technique");
		actor.setSexe("M");
		// ---
		actorServices.saveActor(actor);
		movieServices.addActorToMovie(actor.getActId(), STARWARS_ID, "Snoopy");
	}

}