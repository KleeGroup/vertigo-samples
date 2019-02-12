package io.vertigo.samples.crystal.domain;

import io.vertigo.dynamo.domain.model.DtObject;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class MovieIndex implements DtObject {
	private static final long serialVersionUID = 1L;

	private Long movId;
	private String name;
	private Integer year;
	private String country;
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'id'.
	 * @return Long movId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", required = true, label = "id")
	public Long getMovId() {
		return movId;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'id'.
	 * @param movId Long <b>Obligatoire</b>
	 */
	public void setMovId(final Long movId) {
		this.movId = movId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Titre'.
	 * @return String name
	 */
	@Field(domain = "DO_LABEL_LONG", label = "Titre")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Titre'.
	 * @param name String
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Année'.
	 * @return Integer year
	 */
	@Field(domain = "DO_YEAR", label = "Année")
	public Integer getYear() {
		return year;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Année'.
	 * @param year Integer
	 */
	public void setYear(final Integer year) {
		this.year = year;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Pays'.
	 * @return String country
	 */
	@Field(domain = "DO_LABEL", label = "Pays")
	public String getCountry() {
		return country;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Pays'.
	 * @param country String
	 */
	public void setCountry(final String country) {
		this.country = country;
	}
	
	/**
	 * Champ : COMPUTED.
	 * Récupère la valeur de la propriété calculée 'Titre'.
	 * @return String nameSortOnly
	 */
	@Field(domain = "DO_LABEL_LONG_SORT", type = "COMPUTED", persistent = false, label = "Titre")
	public String getNameSortOnly() {
		return getName();
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
