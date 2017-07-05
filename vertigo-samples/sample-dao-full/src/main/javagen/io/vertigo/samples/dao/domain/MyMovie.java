package io.vertigo.samples.dao.domain;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * Attention cette classe est générée automatiquement !
 * Objet de données MyMovie
 */
@io.vertigo.dynamo.domain.stereotype.DataSpace("mine")
public final class MyMovie implements Entity {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private Long movId;
	private String name;
	private Integer year;
	private String imdbid;
	private Long couId;
	private io.vertigo.samples.dao.domain.MyCountry country;
	private io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.MyRole> role;

	/** {@inheritDoc} */
	@Override
	public URI<MyMovie> getURI() {
		return DtObjectUtil.createURI(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long movId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "Id")
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
	 * Récupère la valeur de la propriété 'Code du pays'.
	 * @return String name
	 */
	@Field(domain = "DO_LABEL_LONG", label = "Code du pays")
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

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'AnnÃ©e'.
	 * @return Integer year
	 */
	@Field(domain = "DO_YEAR", label = "AnnÃ©e")
	public Integer getYear() {
		return year;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'AnnÃ©e'.
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
	@Field(domain = "DO_LABEL", label = "Id Imdb")
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
	@Field(domain = "DO_ID", type = "FOREIGN_KEY", label = "Country")
	public Long getCouId() {
		return couId;
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Country'.
	 * @param couId Long
	 */
	public void setCouId(final Long couId) {
		this.couId = couId;
	}

	/**
	 * Association : Country.
	 * @return io.vertigo.samples.dao.domain.MyCountry
	 */
	public io.vertigo.samples.dao.domain.MyCountry getCountry() {
		final io.vertigo.dynamo.domain.model.URI<io.vertigo.samples.dao.domain.MyCountry> fkURI = getCountryURI();
		if (fkURI == null) {
			return null;
		}
		//On est toujours dans un mode lazy. On s'assure cependant que l'objet associé n'a pas changé
		if (country == null || !fkURI.equals(country.getURI())) {
			country = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().readOne(fkURI);
		}
		return country;
	}

	/**
	 * Retourne l'URI: Country.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_MMOV_MCOU",
			fkFieldName = "COU_ID",
			primaryDtDefinitionName = "DT_MY_COUNTRY",
			primaryIsNavigable = true,
			primaryRole = "Country",
			primaryLabel = "Country",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_MY_MOVIE",
			foreignIsNavigable = false,
			foreignRole = "Movie",
			foreignLabel = "Movie",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.model.URI<io.vertigo.samples.dao.domain.MyCountry> getCountryURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createURI(this, "A_MMOV_MCOU", io.vertigo.samples.dao.domain.MyCountry.class);
	}

	/**
	 * Association : Role.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.MyRole>
	 */
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.MyRole> getRoleList() {
//		return this.<io.vertigo.samples.dao.domain.MyRole> getList(getRoleListURI());
		// On doit avoir une clé primaire renseignée. Si ce n'est pas le cas, on renvoie une liste vide
		if (io.vertigo.dynamo.domain.util.DtObjectUtil.getId(this) == null) {
			return new io.vertigo.dynamo.domain.model.DtList<>(io.vertigo.samples.dao.domain.MyRole.class);
		}
		final io.vertigo.dynamo.domain.model.DtListURI fkDtListURI = getRoleDtListURI();
		io.vertigo.lang.Assertion.checkNotNull(fkDtListURI);
		//---------------------------------------------------------------------
		//On est toujours dans un mode lazy.
		if (role == null) {
			role = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().findAll(fkDtListURI);
		}
		return role;
	}

	/**
	 * Association URI: Role.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_MROL_MMOV",
			fkFieldName = "MOV_ID",
			primaryDtDefinitionName = "DT_MY_MOVIE",
			primaryIsNavigable = false,
			primaryRole = "Movie",
			primaryLabel = "Movie",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_MY_ROLE",
			foreignIsNavigable = true,
			foreignRole = "Role",
			foreignLabel = "Role",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForSimpleAssociation getRoleDtListURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createDtListURIForSimpleAssociation(this, "A_MROL_MMOV", "Role");
	}


	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}