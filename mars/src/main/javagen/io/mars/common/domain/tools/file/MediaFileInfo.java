package io.mars.common.domain.tools.file;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class MediaFileInfo implements Entity {
	private static final long serialVersionUID = 1L;

	private Long filId;
	private String fileName;
	private String mimeType;
	private Long length;
	private java.time.Instant lastModified;
	private String filePath;

	/** {@inheritDoc} */
	@Override
	public URI<MediaFileInfo> getURI() {
		return URI.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long filId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "Id")
	public Long getFilId() {
		return filId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param filId Long <b>Obligatoire</b>
	 */
	public void setFilId(final Long filId) {
		this.filId = filId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Name'.
	 * @return String fileName <b>Obligatoire</b>
	 */
	@Field(domain = "DO_LABEL", required = true, label = "Name")
	public String getFileName() {
		return fileName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Name'.
	 * @param fileName String <b>Obligatoire</b>
	 */
	public void setFileName(final String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'MimeType'.
	 * @return String mimeType <b>Obligatoire</b>
	 */
	@Field(domain = "DO_LABEL", required = true, label = "MimeType")
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'MimeType'.
	 * @param mimeType String <b>Obligatoire</b>
	 */
	public void setMimeType(final String mimeType) {
		this.mimeType = mimeType;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Size'.
	 * @return Long length <b>Obligatoire</b>
	 */
	@Field(domain = "DO_SIZE", required = true, label = "Size")
	public Long getLength() {
		return length;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Size'.
	 * @param length Long <b>Obligatoire</b>
	 */
	public void setLength(final Long length) {
		this.length = length;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Modification Date'.
	 * @return Instant lastModified <b>Obligatoire</b>
	 */
	@Field(domain = "DO_INSTANT", required = true, label = "Modification Date")
	public java.time.Instant getLastModified() {
		return lastModified;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Modification Date'.
	 * @param lastModified Instant <b>Obligatoire</b>
	 */
	public void setLastModified(final java.time.Instant lastModified) {
		this.lastModified = lastModified;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'path'.
	 * @return String filePath <b>Obligatoire</b>
	 */
	@Field(domain = "DO_FILE_PATH", required = true, label = "path")
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'path'.
	 * @param filePath String <b>Obligatoire</b>
	 */
	public void setFilePath(final String filePath) {
		this.filePath = filePath;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
