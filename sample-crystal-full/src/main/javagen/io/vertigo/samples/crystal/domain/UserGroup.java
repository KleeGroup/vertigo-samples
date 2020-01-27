package io.vertigo.samples.crystal.domain;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.model.Entity;
import io.vertigo.datamodel.structure.model.UID;
import io.vertigo.datamodel.structure.stereotype.Field;
import io.vertigo.datamodel.structure.util.DtObjectUtil;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class UserGroup implements Entity {
	private static final long serialVersionUID = 1L;

	private Long grpId;
	private String name;

	/** {@inheritDoc} */
	@Override
	public UID<UserGroup> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long grpId <b>Obligatoire</b>
	 */
	@Field(domain = "DoId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
	public Long getGrpId() {
		return grpId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param grpId Long <b>Obligatoire</b>
	 */
	public void setGrpId(final Long grpId) {
		this.grpId = grpId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nom'.
	 * @return String name
	 */
	@Field(domain = "DoLabel", label = "Nom")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Nom'.
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
