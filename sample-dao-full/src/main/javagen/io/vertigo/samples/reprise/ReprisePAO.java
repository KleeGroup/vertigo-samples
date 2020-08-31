package io.vertigo.samples.reprise;

import javax.inject.Inject;

import io.vertigo.core.node.Node;
import io.vertigo.core.lang.Assertion;
import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.datamodel.task.definitions.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.datastore.impl.dao.StoreServices;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class ReprisePAO implements StoreServices {
	private final TaskManager taskManager;

	/**
	 * Constructeur.
	 * @param taskManager Manager des Task
	 */
	@Inject
	public ReprisePAO(final TaskManager taskManager) {
		Assertion.check().isNotNull(taskManager);
		//-----
		this.taskManager = taskManager;
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
	 * Execute la tache TkCountActors.
	 * @return Long count
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkCountActors",
			request = "select count(*) from ACTOR",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyId")
	public Long countActors() {
		final Task task = createTaskBuilder("TkCountActors")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkCountMovies.
	 * @return Long count
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkCountMovies",
			request = "select count(*) from MOVIE" + 
 "        	where NAME like 'S%%'",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyId")
	public Long countMovies() {
		final Task task = createTaskBuilder("TkCountMovies")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkCountRoles.
	 * @return Long count
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkCountRoles",
			request = "select count(*) from ROLE rol" + 
 "        	join movie mov on mov.MOV_ID = rol.MOV_ID" + 
 "        	where mov.name like 'S%%'",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyId")
	public Long countRoles() {
		final Task task = createTaskBuilder("TkCountRoles")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	private TaskManager getTaskManager() {
		return taskManager;
	}
}
