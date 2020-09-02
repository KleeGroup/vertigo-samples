package io.vertigo.samples.dao.dao;

import javax.inject.Inject;

import io.vertigo.core.lang.Generated;
import io.vertigo.core.node.Node;
import io.vertigo.datamodel.task.definitions.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.datastore.entitystore.EntityStoreManager;
import io.vertigo.datastore.impl.dao.DAO;
import io.vertigo.datastore.impl.dao.StoreServices;
import io.vertigo.datamodel.smarttype.SmartTypeManager;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.samples.dao.domain.Country;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class CountryDAO extends DAO<Country, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param entityStoreManager Manager de persistance
	 * @param taskManager Manager de Task
	 * @param smartTypeManager SmartTypeManager
	 */
	@Inject
	public CountryDAO(final EntityStoreManager entityStoreManager, final TaskManager taskManager, final SmartTypeManager smartTypeManager) {
		super(Country.class, entityStoreManager, taskManager, smartTypeManager);
	}


	/**
	 * Creates a taskBuilder.
	 * @param name  the name of the task
	 * @return the builder 
	 */
	private static TaskBuilder createTaskBuilder(final String name) {
		final TaskDefinition taskDefinition = Node.getNode().getDefinitionSpace().resolve(name, TaskDefinition.class);
		return Task.builder(taskDefinition);
	}

	/**
	 * Execute la tache TkInsertCountriesBatch.
	 * @param countryList DtList de Country
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			dataSpace = "mine",
			name = "TkInsertCountriesBatch",
			request = "INSERT INTO MY_COUNTRY (COU_ID, NAME) values (#countryList.couId#, #countryList.name#)",
			taskEngineClass = io.vertigo.basics.task.TaskEngineProcBatch.class)
	public void insertCountriesBatch(@io.vertigo.datamodel.task.proxy.TaskInput(name = "countryList", smartType = "STyDtCountry") final io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Country> countryList) {
		final Task task = createTaskBuilder("TkInsertCountriesBatch")
				.addValue("countryList", countryList)
				.build();
		getTaskManager().execute(task);
	}

	/**
	 * Execute la tache TkLoadCountries.
	 * @return DtList de Country countryList
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkLoadCountries",
			request = "select * from COUNTRY",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtCountry")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Country> loadCountries() {
		final Task task = createTaskBuilder("TkLoadCountries")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

}
