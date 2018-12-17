package io.mars.hr.webservices;

import javax.inject.Inject;

import io.mars.hr.domain.Person;
import io.mars.hr.services.person.PersonServices;
import io.vertigo.dynamo.domain.model.DtList;
import io.vertigo.dynamo.domain.model.DtListState;
import io.vertigo.vega.webservice.WebServices;
import io.vertigo.vega.webservice.stereotype.AnonymousAccessAllowed;
import io.vertigo.vega.webservice.stereotype.GET;

public class HrWebServices implements WebServices {

	@Inject
	private PersonServices personServices;

	@AnonymousAccessAllowed
	@GET("/persons")
	public DtList<Person> persons() {
		DtListState dtListState = new DtListState(Integer.MAX_VALUE, 0, null, null);
		return personServices.getPersons(dtListState);
	}

}