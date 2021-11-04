package com.musikada.tickets.services;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musikada.tickets.dto.request.TicketRequestDTO;
import com.musikada.tickets.dto.response.TicketResponseDTO;
import com.musikada.tickets.entities.Ticket;
import com.musikada.tickets.repositories.TicketRepository;
import com.musikada.tickets.util.ObjectConversor;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	public TicketResponseDTO newTicket(TicketRequestDTO to) {
		Ticket entity = new ObjectConversor().convertTicketRequestToEntity(to);
		entity.setTicketId(UUID.randomUUID().toString());
		entity = ticketRepository.save(entity);
		return new ObjectConversor().convertEntityToTicketResponse(entity);
	}

	public List<TicketResponseDTO> findAllTicket() {
		return ticketRepository.findAll()
				.stream().map(x -> new ObjectConversor().convertEntityToTicketResponse(x))
				.collect(Collectors.toList());
	}
}
