package io.vertigo.samples;

import javax.inject.Inject;

import io.vertigo.core.node.Home;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.datamodel.task.metamodel.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.core.lang.Assertion;
import io.vertigo.core.lang.Generated;
import io.vertigo.datastore.impl.dao.StoreServices;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class SamplesPAO implements StoreServices {
	private final TaskManager taskManager;

	/**
	 * Constructeur.
	 * @param taskManager Manager des Task
	 */
	@Inject
	public SamplesPAO(final TaskManager taskManager) {
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
	 * Execute la tache TkGetActorsIdsByMovie.
	 * @param movId Long
	 * @return List de Long actors
	*/
	public java.util.List<Long> getActorsIdsByMovie(final Long movId) {
		final Task task = createTaskBuilder("TkGetActorsIdsByMovie")
				.addValue("movId", movId)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	private TaskManager getTaskManager() {
		return taskManager;
	}
}
