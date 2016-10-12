package io.vertigo.ifttt;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import org.apache.log4j.Logger;
import org.glassfish.jersey.client.JerseyClientBuilder;

import io.vertigo.lang.WrappedException;

/**
 *
 * @author xdurand
 *
 */
public class IftttSample {

	private static final Logger LOGGER = Logger.getLogger(IftttSample.class);

	private static final String IFTTT = "ifttt.properties";

	public static void main(final String[] args) {

		final String message = "message";

		final MakerEvent postMessage = new MakerEvent();
		postMessage.setValue1("My message");
		postMessage.setValue2(message);

		System.setProperty("https.proxyHost", "172.20.0.9");
		System.setProperty("https.proxyPort", "3128");

		final Properties prop = new Properties();

		String url = null;
		try (InputStream input = IftttSample.class.getClassLoader().getResourceAsStream(IFTTT)) {
			prop.load(input);
			url = prop.getProperty("url");
		} catch (final IOException e) {
			LOGGER.error("Error while loading " + IFTTT, e);
			throw new WrappedException(e);
		}

		final Client client = JerseyClientBuilder.newClient();
		final WebTarget resource = client.target(url);

		final Builder request = resource.request();
		request.accept(MediaType.APPLICATION_JSON);

		final Response response = request.post(Entity.<MakerEvent> entity(postMessage, MediaType.APPLICATION_JSON));

		if (response.getStatusInfo().getFamily() == Family.SUCCESSFUL) {
			LOGGER.info("Success! " + response.getStatus());
		} else {
			LOGGER.error("Error! " + response.getStatus());
		}

	}

}