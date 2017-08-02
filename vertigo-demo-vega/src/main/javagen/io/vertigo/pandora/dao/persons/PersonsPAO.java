package io.vertigo.pandora.dao.persons;

import javax.inject.Inject;

import io.vertigo.app.Home;
import io.vertigo.dynamo.task.TaskManager;
import io.vertigo.dynamo.task.metamodel.TaskDefinition;
import io.vertigo.dynamo.task.model.Task;
import io.vertigo.dynamo.task.model.TaskBuilder;
import io.vertigo.dynamo.store.StoreServices;
import io.vertigo.lang.Assertion;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class PersonsPAO implements StoreServices {
	private final TaskManager taskManager;

	/**
	 * Constructeur.
	 * @param taskManager Manager des Task
	 */
	@Inject
	public PersonsPAO(final TaskManager taskManager) {
		Assertion.checkNotNull(taskManager);
		//-----
		this.taskManager = taskManager;
	}

	/**
	 * Creates a taskBuilder.
	 * @param name  the name of the task
	 * @return the builder 
	 */
	private static TaskBuilder createTaskBuilder(final String name) {
		final TaskDefinition taskDefinition = Home.getApp().getDefinitionSpace().resolve(name, TaskDefinition.class);
		return Task.builder(taskDefinition);
	}

	/**
	 * Execute la tache TK_IMPORT_PERSONS.
	 * @param dtc io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> 
	*/
	public void importPersons(final io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> dtc) {
		final Task task = createTaskBuilder("TK_IMPORT_PERSONS")
				.addValue("DTC", dtc)
				.build();
		getTaskManager().execute(task);
	}

	/**
	 * Execute la tache TK_LOAD_ACTOR_ROLE_LINK.
	 * @param movId Long 
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.PersonActorRoleLink> dtc
	*/
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.PersonActorRoleLink> loadActorRoleLink(final Long movId) {
		final Task task = createTaskBuilder("TK_LOAD_ACTOR_ROLE_LINK")
				.addValue("MOV_ID", movId)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TK_LOAD_FULL_PERSON_INDEX.
	 * @param dtc io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.movies.Dummy> 
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.PersonIndex> dtcIndex
	*/
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.PersonIndex> loadFullPersonIndex(final io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.movies.Dummy> dtc) {
		final Task task = createTaskBuilder("TK_LOAD_FULL_PERSON_INDEX")
				.addValue("DTC", dtc)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TK_LOAD_PERSON_INDEX.
	 * @param dtc io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.movies.Dummy> 
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.PersonIndex> dtcIndex
	*/
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.PersonIndex> loadPersonIndex(final io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.movies.Dummy> dtc) {
		final Task task = createTaskBuilder("TK_LOAD_PERSON_INDEX")
				.addValue("DTC", dtc)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TK_REMOVE_ALL_PERSONS.
	*/
	public void removeAllPersons() {
		final Task task = createTaskBuilder("TK_REMOVE_ALL_PERSONS")
				.build();
		getTaskManager().execute(task);
	}

	private TaskManager getTaskManager() {
		return taskManager;
	}
}
