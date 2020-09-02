package io.vertigo.samples.dao.dao;

import javax.inject.Inject;

import java.util.Optional;
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
import io.vertigo.samples.dao.domain.Movie;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class MovieDAO extends DAO<Movie, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param entityStoreManager Manager de persistance
	 * @param taskManager Manager de Task
	 * @param smartTypeManager SmartTypeManager
	 */
	@Inject
	public MovieDAO(final EntityStoreManager entityStoreManager, final TaskManager taskManager, final SmartTypeManager smartTypeManager) {
		super(Movie.class, entityStoreManager, taskManager, smartTypeManager);
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
	 * Execute la tache TkGetMoviesByCriteria.
	 * @param title String
	 * @param year Integer
	 * @return DtList de Movie movies
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetMoviesByCriteria",
			request = "select mov.*" + 
 "        	from movie mov" + 
 "        	where " + 
 "        	1=1" + 
 "        	<%if(title != null) {%>" + 
 "        	 and mov.NAME like concat(#title#, '%%')" + 
 "        	<%}%>" + 
 "        	<%if(year != null) {%>" + 
 "        	 and mov.YEAR = #year#" + 
 "        	<%}%>",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtMovie")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Movie> getMoviesByCriteria(@io.vertigo.datamodel.task.proxy.TaskInput(name = "title", smartType = "STyLabelLong") final String title, @io.vertigo.datamodel.task.proxy.TaskInput(name = "year", smartType = "STyYear") final Integer year) {
		final Task task = createTaskBuilder("TkGetMoviesByCriteria")
				.addValue("title", title)
				.addValue("year", year)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkGetMoviesByCriteriaWithCountry.
	 * @param title String
	 * @param year Integer
	 * @param countries DtList de Country
	 * @return DtList de Movie movies
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetMoviesByCriteriaWithCountry",
			request = "select mov.*" + 
 "        	from movie mov" + 
 "        	where " + 
 "        	1=1" + 
 "        	<%if(title != null) {%>" + 
 "        	 and mov.NAME like concat(#title#, '%%')" + 
 "        	<%}%>" + 
 "        	<%if(year != null) {%>" + 
 "        	 and mov.YEAR = #year#" + 
 "        	<%}%>" + 
 "        	<%if(!countries.isEmpty()) {%>" + 
 "        	 and mov.COU_ID in (#countries.rownum.couId#)" + 
 "        	<%}%>",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtMovie")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Movie> getMoviesByCriteriaWithCountry(@io.vertigo.datamodel.task.proxy.TaskInput(name = "title", smartType = "STyLabelLong") final String title, @io.vertigo.datamodel.task.proxy.TaskInput(name = "year", smartType = "STyYear") final Optional<Integer> year, @io.vertigo.datamodel.task.proxy.TaskInput(name = "countries", smartType = "STyDtCountry") final io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Country> countries) {
		final Task task = createTaskBuilder("TkGetMoviesByCriteriaWithCountry")
				.addValue("title", title)
				.addValue("year", year.orElse(null))
				.addValue("countries", countries)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkGetMoviesWith100Actors.
	 * @return DtList de Movie movies
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetMoviesWith100Actors",
			request = "select mov.*" + 
 "			from movie mov" + 
 "			join (select MOV_ID, count(*) cnt from role group by mov_id ) hv on hv.MOV_ID = mov.MOV_ID" + 
 "			where hv.cnt> 100",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtMovie")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Movie> getMoviesWith100Actors() {
		final Task task = createTaskBuilder("TkGetMoviesWith100Actors")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkInsertMoviesBatch.
	 * @param moviesList DtList de Movie
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			dataSpace = "mine",
			name = "TkInsertMoviesBatch",
			request = "INSERT INTO MY_MOVIE (MOV_ID, NAME, YEAR, IMDBID, COU_ID) values (#moviesList.movId#, #moviesList.name#, #moviesList.year#, #moviesList.imdbid#, #moviesList.couId#)",
			taskEngineClass = io.vertigo.basics.task.TaskEngineProcBatch.class)
	public void insertMoviesBatch(@io.vertigo.datamodel.task.proxy.TaskInput(name = "moviesList", smartType = "STyDtMovie") final io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Movie> moviesList) {
		final Task task = createTaskBuilder("TkInsertMoviesBatch")
				.addValue("moviesList", moviesList)
				.build();
		getTaskManager().execute(task);
	}

	/**
	 * Execute la tache TkLoadMoviesByChunk.
	 * @param limit Long
	 * @param offset Long
	 * @return DtList de Movie moviesList
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkLoadMoviesByChunk",
			request = "select * from movie" + 
 "        	where MOV_ID > #offset#" + 
 "        	order by MOV_ID asc" + 
 "        	limit #limit#",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtMovie")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Movie> loadMoviesByChunk(@io.vertigo.datamodel.task.proxy.TaskInput(name = "limit", smartType = "STyId") final Long limit, @io.vertigo.datamodel.task.proxy.TaskInput(name = "offset", smartType = "STyId") final Long offset) {
		final Task task = createTaskBuilder("TkLoadMoviesByChunk")
				.addValue("limit", limit)
				.addValue("offset", offset)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

}
