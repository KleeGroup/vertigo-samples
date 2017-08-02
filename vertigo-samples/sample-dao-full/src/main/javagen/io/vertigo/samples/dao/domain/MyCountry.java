package io.vertigo.samples.dao.domain;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
@io.vertigo.dynamo.domain.stereotype.DataSpace("mine")
public final class MyCountry implements Entity {
	private static final long serialVersionUID = 1L;

	private Long couId;
	private String name;

	/** {@inheritDoc} */
	@Override
	public URI<MyCountry> getURI() {
		return DtObjectUtil.createURI(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long couId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "Id")
	public Long getCouId() {
		return couId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param couId Long <b>Obligatoire</b>
	 */
	public void setCouId(final Long couId) {
		this.couId = couId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Code du pays'.
	 * @return String name
	 */
	@Field(domain = "DO_LABEL", label = "Code du pays")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Code du pays'.
	 * @param name String
	 */
	public void setName(final String name) {
		this.name = name;
	}


	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
