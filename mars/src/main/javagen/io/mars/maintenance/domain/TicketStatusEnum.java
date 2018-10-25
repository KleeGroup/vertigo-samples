package io.mars.maintenance.domain;

import java.io.Serializable;

import io.vertigo.dynamo.domain.model.MasterDataEnum;
import io.vertigo.dynamo.domain.model.URI;

public enum TicketStatusEnum implements MasterDataEnum<io.mars.maintenance.domain.TicketStatus> {

	;

	private final Serializable entityId;

	private TicketStatusEnum(final Serializable id) {
		entityId = id;
	}

	@Override
	public URI<io.mars.maintenance.domain.TicketStatus> getEntityUri() {
		return URI.of(io.mars.maintenance.domain.TicketStatus.class, entityId);
	}

}
