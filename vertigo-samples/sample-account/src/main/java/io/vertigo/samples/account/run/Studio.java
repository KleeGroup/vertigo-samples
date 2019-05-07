package io.vertigo.samples.account.run;

import javax.inject.Inject;

import io.vertigo.app.AutoCloseableApp;
import io.vertigo.core.component.ComponentSpace;
import io.vertigo.samples.account.config.SampleStudioConfigBuilder;
import io.vertigo.studio.mda.MdaManager;

public class Studio {
	@Inject
	private MdaManager mdaManager;

	public static void main(final String[] args) {
		try (final AutoCloseableApp app = new AutoCloseableApp(new SampleStudioConfigBuilder().build())) {
			final Studio sample = new Studio();
			ComponentSpace.injectMembers(sample);
			//-----
			sample.cleanGenerate();
		}
	}

	void cleanGenerate() {
		mdaManager.clean();
		mdaManager.generate().displayResultMessage(System.out);
	}
}
