package io.vertigo.samples.crystal.domain;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.model.KeyConcept;
import io.vertigo.datamodel.structure.model.UID;
import io.vertigo.datamodel.structure.stereotype.Field;
import io.vertigo.datamodel.structure.util.DtObjectUtil;
import io.vertigo.datastore.impl.entitystore.StoreListVAccessor;
import io.vertigo.datastore.impl.entitystore.StoreVAccessor;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class Movie implements KeyConcept {
	private static final long serialVersionUID = 1L;

	private Long movId;
	private String name;
	private Integer year;
	private String imdbid;

	@io.vertigo.datamodel.structure.stereotype.Association(
			name = "AMovCou",
			fkFieldName = "couId",
			primaryDtDefinitionName = "DtCountry",
			primaryIsNavigable = true,
			primaryRole = "Country",
			primaryLabel = "Country",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtMovie",
			foreignIsNavigable = false,
			foreignRole = "Movie",
			foreignLabel = "Movie",
			foreignMultiplicity = "0..*")
	private final StoreVAccessor<io.vertigo.samples.crystal.domain.Country> couIdAccessor = new StoreVAccessor<>(io.vertigo.samples.crystal.domain.Country.class, "Country");

	@io.vertigo.datamodel.structure.stereotype.Association(
			name = "ARolMov",
			fkFieldName = "movId",
			primaryDtDefinitionName = "DtMovie",
			primaryIsNavigable = false,
			primaryRole = "Movie",
			primaryLabel = "Movie",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtRole",
			foreignIsNavigable = true,
			foreignRole = "Role",
			foreignLabel = "Role",
			foreignMultiplicity = "0..*")
	private final StoreListVAccessor<io.vertigo.samples.crystal.domain.Role> roleAccessor = new StoreListVAccessor<>(this, "ARolMov", "Role");

	/** {@inheritDoc} */
	@Override
	public UID<Movie> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long movId <b>Obligatoire</b>
	 */
	@Field(domain = "DoId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
	public Long getMovId() {
		return movId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param movId Long <b>Obligatoire</b>
	 */
	public void setMovId(final Long movId) {
		this.movId = movId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Titre du film'.
	 * @return String name <b>Obligatoire</b>
	 */
	@Field(domain = "DoLabelLong", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Titre du film")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Titre du film'.
	 * @param name String <b>Obligatoire</b>
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Année'.
	 * @return Integer year
	 */
	@Field(domain = "DoYear", label = "Année")
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
	 * Récupère la valeur de la propriété 'Id Imdb'.
	 * @return String imdbid
	 */
	@Field(domain = "DoLabel", label = "Id Imdb")
	public String getImdbid() {
		return imdbid;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Id Imdb'.
	 * @param imdbid String
	 */
	public void setImdbid(final String imdbid) {
		this.imdbid = imdbid;
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Country'.
	 * @return Long couId
	 */
	@Field(domain = "DoId", type = "FOREIGN_KEY", label = "Country")
	public Long getCouId() {
		return (Long) couIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Country'.
	 * @param couId Long
	 */
	public void setCouId(final Long couId) {
		couIdAccessor.setId(couId);
	}

 	/**
	 * Association : Country.
	 * @return l'accesseur vers la propriété 'Country'
	 */
	public StoreVAccessor<io.vertigo.samples.crystal.domain.Country> country() {
		return couIdAccessor;
	}

	/**
	 * Association : Role.
	 * @return l'accesseur vers la propriété 'Role'
	 */
	public StoreListVAccessor<io.vertigo.samples.crystal.domain.Role> role() {
		return roleAccessor;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
