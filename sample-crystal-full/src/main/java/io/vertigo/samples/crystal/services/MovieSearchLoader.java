package io.vertigo.samples.crystal.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.vertigo.commons.transaction.VTransactionManager;
import io.vertigo.core.node.component.Activeable;
import io.vertigo.dynamo.domain.model.DtList;
import io.vertigo.dynamo.domain.model.UID;
import io.vertigo.dynamo.search.SearchManager;
import io.vertigo.dynamo.search.metamodel.SearchChunk;
import io.vertigo.dynamo.search.metamodel.SearchIndexDefinition;
import io.vertigo.dynamo.search.model.SearchIndex;
import io.vertigo.dynamo.task.TaskManager;
import io.vertigo.dynamox.search.AbstractSqlSearchLoader;
import io.vertigo.samples.crystal.domain.Movie;
import io.vertigo.samples.crystal.domain.MovieIndex;

public final class MovieSearchLoader extends AbstractSqlSearchLoader<Long, Movie, MovieIndex> implements Activeable {

	private final MovieServices movieServices;
	private final SearchManager searchManager;
	private SearchIndexDefinition indexDefinition;

	@Inject
	public MovieSearchLoader(final TaskManager taskManager, final SearchManager searchManager, final VTransactionManager transactionManager, final MovieServices movieServices) {
		super(taskManager, transactionManager);
		this.searchManager = searchManager;
		this.movieServices = movieServices;
	}

	@Override
	public void start() {
		indexDefinition = searchManager.findFirstIndexDefinitionByKeyConcept(Movie.class);
	}

	@Override
	public void stop() {
		indexDefinition = null;
	}

	@Override
	public List<SearchIndex<Movie, MovieIndex>> loadData(final SearchChunk<Movie> searchChunk) {
		final List<Long> movieIds = new ArrayList<>();
		for (final UID<Movie> uid : searchChunk.getAllUIDs()) {
			movieIds.add((Long) uid.getId());
		}
		final DtList<MovieIndex> movieIndexes = movieServices.getMovieIndex(movieIds);
		final List<SearchIndex<Movie, MovieIndex>> movieSearchIndexes = new ArrayList<>(searchChunk.getAllUIDs().size());
		for (final MovieIndex movieIndex : movieIndexes) {
			movieSearchIndexes.add(SearchIndex.createIndex(indexDefinition,
					UID.of(indexDefinition.getKeyConceptDtDefinition(), movieIndex.getMovId()), movieIndex));
		}
		return movieSearchIndexes;
	}

}