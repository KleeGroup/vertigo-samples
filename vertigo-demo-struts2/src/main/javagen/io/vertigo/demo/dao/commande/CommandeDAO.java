package io.vertigo.demo.dao.commande;

import javax.inject.Inject;
import io.vertigo.dynamo.impl.store.util.DAO;
import io.vertigo.dynamo.store.StoreManager;
import io.vertigo.dynamo.store.StoreServices;
import io.vertigo.dynamo.task.TaskManager;
import io.vertigo.demo.domain.commande.Commande;

/**
 * DAO : Accès à un object (DTO, DTC). 
 * CommandeDAO
 */
public final class CommandeDAO extends DAO<Commande, java.lang.Long> implements StoreServices {
	 
	/**
	 * Contructeur.
	 * @param storeManager Manager de persistance
	 * @param taskManager Manager de Task
	 */
	@Inject
	public CommandeDAO(final StoreManager storeManager, final TaskManager taskManager) {
		super(Commande.class, storeManager, taskManager);
	}
	

}