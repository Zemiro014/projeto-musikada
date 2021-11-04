package com.musikada.tickets.util;

import com.musikada.tickets.dto.request.TicketRequestDTO;
import com.musikada.tickets.dto.response.TicketResponseDTO;
import com.musikada.tickets.entities.Ticket;

public class ObjectConversor {
	private Ticket ticket;
	private TicketResponseDTO ticketResponseDTO;
	
	public Ticket convertTicketRequestToEntity(TicketRequestDTO to) {
		ticket = new Ticket();
		ticket.setPrice(to.getPrice());
		ticket.setQuantity(to.getQuantity());
		ticket.setTicketCode(to.getTicketCode());
		ticket.setUrlImage(to.getUrlImage());
		return ticket;
	}
	
	public TicketResponseDTO convertEntityToTicketResponse(Ticket entity) {		
		ticketResponseDTO = new TicketResponseDTO();
		ticketResponseDTO.setTicketId(entity.getTicketId());
		ticketResponseDTO.setPrice(entity.getPrice());
		ticketResponseDTO.setQuantity(entity.getQuantity());
		ticketResponseDTO.setTicketCode(entity.getTicketCode());
		ticketResponseDTO.setUrlImage(entity.getUrlImage());
		return ticketResponseDTO;
	}
}