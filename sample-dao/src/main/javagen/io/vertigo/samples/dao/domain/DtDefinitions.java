package io.vertigo.samples.dao.domain;

import java.util.Arrays;
import java.util.Iterator;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.definitions.DtFieldName;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class DtDefinitions implements Iterable<Class<?>> {

	/**
	 * Enumération des DtDefinitions.
	 */
	public enum Definitions {
		/** Objet de données Actor. */
		Actor(io.vertigo.samples.dao.domain.Actor.class),
		/** Objet de données Country. */
		Country(io.vertigo.samples.dao.domain.Country.class),
		/** Objet de données Movie. */
		Movie(io.vertigo.samples.dao.domain.Movie.class),
		/** Objet de données Role. */
		Role(io.vertigo.samples.dao.domain.Role.class)		;

		private final Class<?> clazz;

		private Definitions(final Class<?> clazz) {
			this.clazz = clazz;
		}

		/** 
		 * Classe associée.
		 * @return Class d'implémentation de l'objet 
		 */
		public Class<?> getDtClass() {
			return clazz;
		}
	}

	/**
	 * Enumération des champs de Actor.
	 */
	public enum ActorFields implements DtFieldName<io.vertigo.samples.dao.domain.Actor> {
		/** Propriété 'Id'. */
		actId,
		/** Propriété 'Nom'. */
		name,
		/** Propriété 'Sexe'. */
		sexe	}

	/**
	 * Enumération des champs de Country.
	 */
	public enum CountryFields implements DtFieldName<io.vertigo.samples.dao.domain.Country> {
		/** Propriété 'Id'. */
		couId,
		/** Propriété 'Code du pays'. */
		name	}

	/**
	 * Enumération des champs de Movie.
	 */
	public enum MovieFields implements DtFieldName<io.vertigo.samples.dao.domain.Movie> {
		/** Propriété 'Id'. */
		movId,
		/** Propriété 'Code du pays'. */
		name,
		/** Propriété 'Année'. */
		year,
		/** Propriété 'Id Imdb'. */
		imdbid,
		/** Propriété 'Country'. */
		couId	}

	/**
	 * Enumération des champs de Role.
	 */
	public enum RoleFields implements DtFieldName<io.vertigo.samples.dao.domain.Role> {
		/** Propriété 'Id'. */
		rolId,
		/** Propriété 'Dans le role de'. */
		asCharacter,
		/** Propriété 'Movie'. */
		movId,
		/** Propriété 'Actor'. */
		actId	}

	/** {@inheritDoc} */
	@Override
	public Iterator<Class<?>> iterator() {
		return new Iterator<>() {
			private Iterator<Definitions> it = Arrays.asList(Definitions.values()).iterator();

			/** {@inheritDoc} */
			@Override
			public boolean hasNext() {
				return it.hasNext();
			}

			/** {@inheritDoc} */
			@Override
			public Class<?> next() {
				return it.next().getDtClass();
			}
		};
	}
}
