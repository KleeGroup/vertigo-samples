package io.vertigo.samples.dao.dao;

import javax.inject.Inject;

import io.vertigo.core.lang.Generated;
import io.vertigo.core.node.Home;
import io.vertigo.datamodel.task.metamodel.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.datastore.entitystore.EntityStoreManager;
import io.vertigo.datastore.impl.dao.DAO;
import io.vertigo.datastore.impl.dao.StoreServices;
import io.vertigo.datamodel.smarttype.ModelManager;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.samples.dao.domain.Actor;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class ActorDAO extends DAO<Actor, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param entityStoreManager Manager de persistance
	 * @param taskManager Manager de Task
	 */
	@Inject
	public ActorDAO(final EntityStoreManager entityStoreManager, final TaskManager taskManager, final ModelManager modelManager) {
		super(Actor.class, entityStoreManager, taskManager, modelManager);
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
	 * Execute la tache StTkGetActorsInMovie.
	 * @param movId Long
	 * @return DtList de Actor actors
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetActorsInMovie",
			request = "select act.*" + 
 "        	from role rol" + 
 "        	join actor act on act.ACT_ID = rol.ACT_ID" + 
 "        	where rol.MOV_ID = #movId#",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(domain = "STyDtActor")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Actor> getActorsInMovie(@io.vertigo.datamodel.task.proxy.TaskInput(name = "movId", domain = "STyId") final Long movId) {
		final Task task = createTaskBuilder("TkGetActorsInMovie")
				.addValue("movId", movId)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache StTkInsertActorsBatch.
	 * @param actorsList DtList de Actor
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			dataSpace = "mine",
			name = "TkInsertActorsBatch",
			request = "INSERT INTO MY_ACTOR (ACT_ID, NAME, SEXE) values (#ACTORS_LIST.ACT_ID#, #ACTORS_LIST.NAME#, #ACTORS_LIST.SEXE#)",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineProcBatch.class)
	public void insertActorsBatch(@io.vertigo.datamodel.task.proxy.TaskInput(name = "actorsList", domain = "STyDtActor") final io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Actor> actorsList) {
		final Task task = createTaskBuilder("TkInsertActorsBatch")
				.addValue("actorsList", actorsList)
				.build();
		getTaskManager().execute(task);
	}

	/**
	 * Execute la tache StTkLoadActorsByChunk.
	 * @param limit Long
	 * @param offset Long
	 * @return DtList de Actor actorsList
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkLoadActorsByChunk",
			request = "select * from ACTOR" + 
 "			where ACT_ID > #offset#" + 
 "        	order by ACT_ID asc" + 
 "			limit 1000",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(domain = "STyDtActor")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Actor> loadActorsByChunk(@io.vertigo.datamodel.task.proxy.TaskInput(name = "limit", domain = "STyId") final Long limit, @io.vertigo.datamodel.task.proxy.TaskInput(name = "offset", domain = "STyId") final Long offset) {
		final Task task = createTaskBuilder("TkLoadActorsByChunk")
				.addValue("limit", limit)
				.addValue("offset", offset)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

}
