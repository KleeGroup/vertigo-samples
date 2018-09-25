package io.vertigo.mars.domain.users;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.model.VAccessor;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class ApplicationUser implements Entity {
	private static final long serialVersionUID = 1L;

	private Long usrId;
	private String lastName;
	private String firstName;
	private String email;

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_USR_PRO",
			fkFieldName = "PRO_ID",
			primaryDtDefinitionName = "DT_PROFIL",
			primaryIsNavigable = true,
			primaryRole = "Profil",
			primaryLabel = "Profil",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_APPLICATION_USER",
			foreignIsNavigable = false,
			foreignRole = "ApplicationUser",
			foreignLabel = "Application user",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.vertigo.mars.domain.users.Profil> proIdAccessor = new VAccessor<>(io.vertigo.mars.domain.users.Profil.class, "Profil");

	/** {@inheritDoc} */
	@Override
	public URI<ApplicationUser> getURI() {
		return DtObjectUtil.createURI(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'USR_ID'.
	 * @return Long usrId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "USR_ID")
	public Long getUsrId() {
		return usrId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'USR_ID'.
	 * @param usrId Long <b>Obligatoire</b>
	 */
	public void setUsrId(final Long usrId) {
		this.usrId = usrId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Last Name'.
	 * @return String lastName
	 */
	@Field(domain = "DO_NAME", label = "Last Name")
	public String getLastName() {
		return lastName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Last Name'.
	 * @param lastName String
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'First Name'.
	 * @return String firstName
	 */
	@Field(domain = "DO_FIRSTNAME", label = "First Name")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'First Name'.
	 * @param firstName String
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'email'.
	 * @return String email
	 */
	@Field(domain = "DO_EMAIL", label = "email")
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
	 * Récupère la valeur de la propriété 'Profil'.
	 * @return Long proId
	 */
	@Field(domain = "DO_ID", type = "FOREIGN_KEY", label = "Profil")
	public Long getProId() {
		return (Long)  proIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Profil'.
	 * @param proId Long
	 */
	public void setProId(final Long proId) {
		proIdAccessor.setId(proId);
	}

 	/**
	 * Association : Profil.
	 * @return l'accesseur vers la propriété 'Profil'
	 */
	public VAccessor<io.vertigo.mars.domain.users.Profil> profil() {
		return proIdAccessor;
	}
	
	@Deprecated
	public io.vertigo.mars.domain.users.Profil getProfil() {
		// we keep the lazyness
		if (!proIdAccessor.isLoaded()) {
			proIdAccessor.load();
		}
		return proIdAccessor.get();
	}

	/**
	 * Retourne l'URI: Profil.
	 * @return URI de l'association
	 */
	@Deprecated
	public io.vertigo.dynamo.domain.model.URI<io.vertigo.mars.domain.users.Profil> getProfilURI() {
		return proIdAccessor.getURI();
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
