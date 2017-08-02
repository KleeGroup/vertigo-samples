package io.vertigo.demo.dao.referentiel;

import javax.inject.Inject;

import io.vertigo.demo.domain.referentiel.Region;
import io.vertigo.dynamo.impl.store.util.DAO;
import io.vertigo.dynamo.store.StoreManager;
import io.vertigo.dynamo.store.StoreServices;
import io.vertigo.dynamo.task.TaskManager;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class RegionDAO extends DAO<Region, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param storeManager Manager de persistance
	 * @param taskManager Manager de Task
	 */
	@Inject
	public RegionDAO(final StoreManager storeManager, final TaskManager taskManager) {
		super(Region.class, storeManager, taskManager);
	}

}
