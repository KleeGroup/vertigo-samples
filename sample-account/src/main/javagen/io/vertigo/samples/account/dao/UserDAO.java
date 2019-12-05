package io.vertigo.samples.account.dao;

import javax.inject.Inject;

import io.vertigo.core.lang.Generated;
import io.vertigo.dynamo.impl.store.util.DAO;
import io.vertigo.dynamo.store.StoreManager;
import io.vertigo.dynamo.store.StoreServices;
import io.vertigo.dynamo.task.TaskManager;
import io.vertigo.samples.account.domain.User;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class UserDAO extends DAO<User, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param storeManager Manager de persistance
	 * @param taskManager Manager de Task
	 */
	@Inject
	public UserDAO(final StoreManager storeManager, final TaskManager taskManager) {
		super(User.class, storeManager, taskManager);
	}

}