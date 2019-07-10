package io.mars.maintenance.commands;

import javax.inject.Inject;

import io.mars.maintenance.domain.Ticket;
import io.mars.maintenance.services.ticket.TicketServices;
import io.vertigo.commons.command.Command;
import io.vertigo.commons.command.CommandResponse;
import io.vertigo.commons.command.CommandResponseStatus;
import io.vertigo.commons.command.GenericUID;
import io.vertigo.core.component.Component;

public class MaintenanceCommands implements Component {

	@Inject
	private TicketServices ticketServices;

	@Command(handle = "/m/ticketStatus", description = "Gets the status of a ticket")
	public CommandResponse<Ticket> checkTicket(final GenericUID<Ticket> ticketUID) {
		final Long ticketId = (Long) ticketUID.getId();
		final Ticket ticket = ticketServices.getTicketFromId(ticketId);
		return CommandResponse.<Ticket> builder()
				.withStatus(CommandResponseStatus.OK)
				.withDisplay("Ticket is " + ticket.ticketStatus().getEnumValue().name())
				.withPayload(ticket)
				.build();
	}

	@Command(handle = "/m/ticket", description = "Creates a ticket")
	public CommandResponse<Ticket> checkTicket(final String code, final String content) {
		return CommandResponse.<Ticket> builder()
				.withStatus(CommandResponseStatus.OK)
				.withDisplay("Ticket ok")
				.build();
	}

}
