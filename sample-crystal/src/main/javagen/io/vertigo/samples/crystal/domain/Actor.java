package io.vertigo.samples.crystal.domain;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.model.Entity;
import io.vertigo.datamodel.structure.model.UID;
import io.vertigo.datamodel.structure.stereotype.Field;
import io.vertigo.datamodel.structure.util.DtObjectUtil;
import io.vertigo.datastore.impl.entitystore.StoreVAccessor;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class Actor implements Entity {
	private static final long serialVersionUID = 1L;

	private Long actId;
	private String name;

	@io.vertigo.datamodel.structure.stereotype.Association(
			name = "AActSex",
			fkFieldName = "sexCd",
			primaryDtDefinitionName = "DtSexe",
			primaryIsNavigable = true,
			primaryRole = "Sexe",
			primaryLabel = "Sexe",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtActor",
			foreignIsNavigable = false,
			foreignRole = "Actor",
			foreignLabel = "Actor",
			foreignMultiplicity = "0..*")
	private final StoreVAccessor<io.vertigo.samples.crystal.domain.Sexe> sexCdAccessor = new StoreVAccessor<>(io.vertigo.samples.crystal.domain.Sexe.class, "Sexe");

	/** {@inheritDoc} */
	@Override
	public UID<Actor> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long actId <b>Obligatoire</b>
	 */
	@Field(domain = "DoId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
	public Long getActId() {
		return actId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param actId Long <b>Obligatoire</b>
	 */
	public void setActId(final Long actId) {
		this.actId = actId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nom'.
	 * @return String name <b>Obligatoire</b>
	 */
	@Field(domain = "DoLabelLong", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Nom")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Nom'.
	 * @param name String <b>Obligatoire</b>
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Sexe'.
	 * @return String sexCd
	 */
	@Field(domain = "DoCode", type = "FOREIGN_KEY", label = "Sexe")
	public String getSexCd() {
		return (String) sexCdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Sexe'.
	 * @param sexCd String
	 */
	public void setSexCd(final String sexCd) {
		sexCdAccessor.setId(sexCd);
	}

 	/**
	 * Association : Sexe.
	 * @return l'accesseur vers la propriété 'Sexe'
	 */
	public StoreVAccessor<io.vertigo.samples.crystal.domain.Sexe> sexe() {
		return sexCdAccessor;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
