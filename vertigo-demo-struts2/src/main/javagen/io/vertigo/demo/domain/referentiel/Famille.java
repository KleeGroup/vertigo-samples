package io.vertigo.demo.domain.referentiel;

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
public final class Famille implements Entity {
	private static final long serialVersionUID = 1L;

	private Long famId;
	private String libelle;

	/** {@inheritDoc} */
	@Override
	public URI<Famille> getURI() {
		return URI.of(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'FAM_ID'.
	 * @return Long famId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTIFIANT", type = "ID", required = true, label = "FAM_ID")
	public Long getFamId() {
		return famId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'FAM_ID'.
	 * @param famId Long <b>Obligatoire</b>
	 */
	public void setFamId(final Long famId) {
		this.famId = famId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'LIBELLE'.
	 * @return String libelle <b>Obligatoire</b>
	 */
	@Field(domain = "DO_LIBELLE", required = true, label = "LIBELLE")
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'LIBELLE'.
	 * @param libelle String <b>Obligatoire</b>
	 */
	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}


	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
