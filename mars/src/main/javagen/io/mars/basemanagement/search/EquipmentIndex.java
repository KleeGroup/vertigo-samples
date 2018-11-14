package io.mars.basemanagement.search;

import io.vertigo.dynamo.domain.model.DtObject;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class EquipmentIndex implements DtObject {
	private static final long serialVersionUID = 1L;

	private Long equipmentId;
	private String name;
	private String code;
	private java.time.LocalDate purchaseDate;
	private String description;
	private String tags;
	private String equipmentTypeName;
	private String equipmentCategoryName;
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long equipmentId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", required = true, label = "Id")
	public Long getEquipmentId() {
		return equipmentId;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Id'.
	 * @param equipmentId Long <b>Obligatoire</b>
	 */
	public void setEquipmentId(final Long equipmentId) {
		this.equipmentId = equipmentId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Name'.
	 * @return String name
	 */
	@Field(domain = "DO_LABEL", label = "Name")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Name'.
	 * @param name String
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Base Code'.
	 * @return String code
	 */
	@Field(domain = "DO_CODE", label = "Base Code")
	public String getCode() {
		return code;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Base Code'.
	 * @param code String
	 */
	public void setCode(final String code) {
		this.code = code;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Date of purchase'.
	 * @return LocalDate purchaseDate
	 */
	@Field(domain = "DO_LOCALDATE", label = "Date of purchase")
	public java.time.LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Date of purchase'.
	 * @param purchaseDate LocalDate
	 */
	public void setPurchaseDate(final java.time.LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Description'.
	 * @return String description
	 */
	@Field(domain = "DO_DESCRIPTION", label = "Description")
	public String getDescription() {
		return description;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Description'.
	 * @param description String
	 */
	public void setDescription(final String description) {
		this.description = description;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Tags'.
	 * @return String tags
	 */
	@Field(domain = "DO_TAGS", label = "Tags")
	public String getTags() {
		return tags;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Tags'.
	 * @param tags String
	 */
	public void setTags(final String tags) {
		this.tags = tags;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Equipment Type'.
	 * @return String equipmentTypeName
	 */
	@Field(domain = "DO_LABEL", label = "Equipment Type")
	public String getEquipmentTypeName() {
		return equipmentTypeName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Equipment Type'.
	 * @param equipmentTypeName String
	 */
	public void setEquipmentTypeName(final String equipmentTypeName) {
		this.equipmentTypeName = equipmentTypeName;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Equipment Category'.
	 * @return String equipmentCategoryName
	 */
	@Field(domain = "DO_LABEL", label = "Equipment Category")
	public String getEquipmentCategoryName() {
		return equipmentCategoryName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Equipment Category'.
	 * @param equipmentCategoryName String
	 */
	public void setEquipmentCategoryName(final String equipmentCategoryName) {
		this.equipmentCategoryName = equipmentCategoryName;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
