package io.vertigo.samples.account.domain;

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
public final class User implements Entity {
	private static final long serialVersionUID = 1L;

	private Long usrId;
	private String login;
	private String name;
	private String email;

	@io.vertigo.datamodel.structure.stereotype.Association(
			name = "AUsrCou",
			fkFieldName = "couId",
			primaryDtDefinitionName = "DtCountry",
			primaryIsNavigable = true,
			primaryRole = "Country",
			primaryLabel = "Country",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtUser",
			foreignIsNavigable = false,
			foreignRole = "User",
			foreignLabel = "User",
			foreignMultiplicity = "0..*")
	private final StoreVAccessor<io.vertigo.samples.account.domain.Country> couIdAccessor = new StoreVAccessor<>(io.vertigo.samples.account.domain.Country.class, "Country");

	@io.vertigo.datamodel.structure.stereotype.Association(
			name = "AUsrGrp",
			fkFieldName = "grpId",
			primaryDtDefinitionName = "DtUserGroup",
			primaryIsNavigable = true,
			primaryRole = "Group",
			primaryLabel = "Group",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtUser",
			foreignIsNavigable = false,
			foreignRole = "User",
			foreignLabel = "User",
			foreignMultiplicity = "0..*")
	private final StoreVAccessor<io.vertigo.samples.account.domain.UserGroup> grpIdAccessor = new StoreVAccessor<>(io.vertigo.samples.account.domain.UserGroup.class, "Group");

	/** {@inheritDoc} */
	@Override
	public UID<User> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long usrId <b>Obligatoire</b>
	 */
	@Field(smartType = "DoId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
	public Long getUsrId() {
		return usrId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param usrId Long <b>Obligatoire</b>
	 */
	public void setUsrId(final Long usrId) {
		this.usrId = usrId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Login'.
	 * @return String login
	 */
	@Field(smartType = "DoLabel", label = "Login")
	public String getLogin() {
		return login;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Login'.
	 * @param login String
	 */
	public void setLogin(final String login) {
		this.login = login;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nom'.
	 * @return String name
	 */
	@Field(smartType = "DoLabel", label = "Nom")
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
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'email'.
	 * @return String email
	 */
	@Field(smartType = "DoLabel", label = "email")
	public String getEmail() {
		return email;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'email'.
	 * @param email String
	 */
	public void setEmail(final String email) {
		this.email = email;
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Country'.
	 * @return Long couId
	 */
	@Field(smartType = "DoId", type = "FOREIGN_KEY", label = "Country")
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
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Group'.
	 * @return Long grpId
	 */
	@Field(smartType = "DoId", type = "FOREIGN_KEY", label = "Group")
	public Long getGrpId() {
		return (Long) grpIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Group'.
	 * @param grpId Long
	 */
	public void setGrpId(final Long grpId) {
		grpIdAccessor.setId(grpId);
	}

 	/**
	 * Association : Country.
	 * @return l'accesseur vers la propriété 'Country'
	 */
	public StoreVAccessor<io.vertigo.samples.account.domain.Country> country() {
		return couIdAccessor;
	}

 	/**
	 * Association : Group.
	 * @return l'accesseur vers la propriété 'Group'
	 */
	public StoreVAccessor<io.vertigo.samples.account.domain.UserGroup> group() {
		return grpIdAccessor;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
