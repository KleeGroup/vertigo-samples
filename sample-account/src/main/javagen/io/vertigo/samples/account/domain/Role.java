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
public final class Role implements Entity {
	private static final long serialVersionUID = 1L;

	private Long rolId;
	private String asCharacter;

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
	private final StoreVAccessor<io.vertigo.samples.account.domain.Movie> movIdAccessor = new StoreVAccessor<>(io.vertigo.samples.account.domain.Movie.class, "Movie");

	@io.vertigo.datamodel.structure.stereotype.Association(
			name = "ARolAct",
			fkFieldName = "actId",
			primaryDtDefinitionName = "DtActor",
			primaryIsNavigable = true,
			primaryRole = "Actor",
			primaryLabel = "Actor",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtRole",
			foreignIsNavigable = false,
			foreignRole = "Role",
			foreignLabel = "Role",
			foreignMultiplicity = "0..*")
	private final StoreVAccessor<io.vertigo.samples.account.domain.Actor> actIdAccessor = new StoreVAccessor<>(io.vertigo.samples.account.domain.Actor.class, "Actor");

	/** {@inheritDoc} */
	@Override
	public UID<Role> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long rolId <b>Obligatoire</b>
	 */
	@Field(domain = "DoId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
	public Long getRolId() {
		return rolId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param rolId Long <b>Obligatoire</b>
	 */
	public void setRolId(final Long rolId) {
		this.rolId = rolId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Dans le role de'.
	 * @return String asCharacter <b>Obligatoire</b>
	 */
	@Field(domain = "DoLabelVeryLong", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Dans le role de")
	public String getAsCharacter() {
		return asCharacter;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Dans le role de'.
	 * @param asCharacter String <b>Obligatoire</b>
	 */
	public void setAsCharacter(final String asCharacter) {
		this.asCharacter = asCharacter;
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Movie'.
	 * @return Long movId
	 */
	@Field(domain = "DoId", type = "FOREIGN_KEY", label = "Movie")
	public Long getMovId() {
		return (Long) movIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Movie'.
	 * @param movId Long
	 */
	public void setMovId(final Long movId) {
		movIdAccessor.setId(movId);
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Actor'.
	 * @return Long actId
	 */
	@Field(domain = "DoId", type = "FOREIGN_KEY", label = "Actor")
	public Long getActId() {
		return (Long) actIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Actor'.
	 * @param actId Long
	 */
	public void setActId(final Long actId) {
		actIdAccessor.setId(actId);
	}

 	/**
	 * Association : Actor.
	 * @return l'accesseur vers la propriété 'Actor'
	 */
	public StoreVAccessor<io.vertigo.samples.account.domain.Actor> actor() {
		return actIdAccessor;
	}

 	/**
	 * Association : Movie.
	 * @return l'accesseur vers la propriété 'Movie'
	 */
	public StoreVAccessor<io.vertigo.samples.account.domain.Movie> movie() {
		return movIdAccessor;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
