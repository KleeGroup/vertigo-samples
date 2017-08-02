package io.vertigo.pandora.domain.persons;

import io.vertigo.dynamo.domain.model.KeyConcept;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class Person implements KeyConcept {
	private static final long serialVersionUID = 1L;

	private Long perId;
	private String fullName;
	private String firstName;
	private String lastName;
	private String biography;
	private String shortBiography;
	private String sex;
	private String photoHref;
	private String birthDate;
	private String birthPlace;
	private String activity;
	private io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.ActorRole> roles;

	/** {@inheritDoc} */
	@Override
	public URI<Person> getURI() {
		return DtObjectUtil.createURI(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'PER ID'.
	 * @return Long perId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTITY", type = "ID", required = true, label = "PER ID")
	public Long getPerId() {
		return perId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'PER ID'.
	 * @param perId Long <b>Obligatoire</b>
	 */
	public void setPerId(final Long perId) {
		this.perId = perId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'FULL NAME'.
	 * @return String fullName
	 */
	@Field(domain = "DO_LABEL", label = "FULL NAME")
	public String getFullName() {
		return fullName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'FULL NAME'.
	 * @param fullName String
	 */
	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'FIRST NAME'.
	 * @return String firstName
	 */
	@Field(domain = "DO_LABEL", label = "FIRST NAME")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'FIRST NAME'.
	 * @param firstName String
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'LAST NAME'.
	 * @return String lastName
	 */
	@Field(domain = "DO_LABEL", label = "LAST NAME")
	public String getLastName() {
		return lastName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'LAST NAME'.
	 * @param lastName String
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'BIOGRAPHY'.
	 * @return String biography
	 */
	@Field(domain = "DO_TEXT", label = "BIOGRAPHY")
	public String getBiography() {
		return biography;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'BIOGRAPHY'.
	 * @param biography String
	 */
	public void setBiography(final String biography) {
		this.biography = biography;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'SHORT BIOGRAPHY'.
	 * @return String shortBiography
	 */
	@Field(domain = "DO_TEXT", label = "SHORT BIOGRAPHY")
	public String getShortBiography() {
		return shortBiography;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'SHORT BIOGRAPHY'.
	 * @param shortBiography String
	 */
	public void setShortBiography(final String shortBiography) {
		this.shortBiography = shortBiography;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'SEX'.
	 * @return String sex
	 */
	@Field(domain = "DO_CODE", label = "SEX")
	public String getSex() {
		return sex;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'SEX'.
	 * @param sex String
	 */
	public void setSex(final String sex) {
		this.sex = sex;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'PHOTO HREF'.
	 * @return String photoHref
	 */
	@Field(domain = "DO_HREF", label = "PHOTO HREF")
	public String getPhotoHref() {
		return photoHref;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'PHOTO HREF'.
	 * @param photoHref String
	 */
	public void setPhotoHref(final String photoHref) {
		this.photoHref = photoHref;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'BIRTH DATE'.
	 * @return String birthDate
	 */
	@Field(domain = "DO_DATE", label = "BIRTH DATE")
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'BIRTH DATE'.
	 * @param birthDate String
	 */
	public void setBirthDate(final String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'BIRTH PLACE'.
	 * @return String birthPlace
	 */
	@Field(domain = "DO_LABEL", label = "BIRTH PLACE")
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'BIRTH PLACE'.
	 * @param birthPlace String
	 */
	public void setBirthPlace(final String birthPlace) {
		this.birthPlace = birthPlace;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'ACTIVITY'.
	 * @return String activity
	 */
	@Field(domain = "DO_MULTI_VALUES", label = "ACTIVITY")
	public String getActivity() {
		return activity;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'ACTIVITY'.
	 * @param activity String
	 */
	public void setActivity(final String activity) {
		this.activity = activity;
	}

	/**
	 * Association : Roles.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.ActorRole>
	 */
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.ActorRole> getRolesList() {
		// On doit avoir une clé primaire renseignée. Si ce n'est pas le cas, on renvoie une liste vide
		if (io.vertigo.dynamo.domain.util.DtObjectUtil.getId(this) == null) {
			return new io.vertigo.dynamo.domain.model.DtList<>(io.vertigo.pandora.domain.persons.ActorRole.class);
		}
		final io.vertigo.dynamo.domain.model.DtListURI fkDtListURI = getRolesDtListURI();
		io.vertigo.lang.Assertion.checkNotNull(fkDtListURI);
		//---------------------------------------------------------------------
		//On est toujours dans un mode lazy.
		if (roles == null) {
			roles = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().findAll(fkDtListURI);
		}
		return roles;
	}

	/**
	 * Association URI: Roles.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_MRO_PER",
			fkFieldName = "PER_ID",
			primaryDtDefinitionName = "DT_PERSON",
			primaryIsNavigable = true,
			primaryRole = "Actor",
			primaryLabel = "Actor",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_ACTOR_ROLE",
			foreignIsNavigable = true,
			foreignRole = "Roles",
			foreignLabel = "Roles",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForSimpleAssociation getRolesDtListURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createDtListURIForSimpleAssociation(this, "A_MRO_PER", "Roles");
	}


	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
