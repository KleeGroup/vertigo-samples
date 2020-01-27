package io.vertigo.samples.dao.domain;

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
@io.vertigo.datamodel.smarttype.annotations.Mapper(clazz = io.vertigo.datamodel.structure.util.JsonMapper.class, dataType = io.vertigo.datamodel.structure.metamodel.DataType.String)
public final class Country implements Entity {
	private static final long serialVersionUID = 1L;

	private Long couId;
	private String name;

	/** {@inheritDoc} */
	@Override
	public UID<Country> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long couId <b>Obligatoire</b>
	 */
	@Field(domain = "STyId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
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
	@Field(domain = "STyLabel", label = "Code du pays")
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
