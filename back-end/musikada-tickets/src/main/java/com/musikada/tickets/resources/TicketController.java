package com.musikada.tickets.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musikada.tickets.dto.request.TicketRequestDTO;
import com.musikada.tickets.dto.response.TicketResponseDTO;
import com.musikada.tickets.services.TicketService;

import io.swagger.annotations.Api;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping(value = "/tickets")
@Api(value = "Tickets")
@EnableSwagger2
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@PostMapping
	public ResponseEntity<TicketResponseDTO> newTicket(@RequestBody TicketRequestDTO dto){
		TicketResponseDTO obj = ticketService.newTicket(dto);
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<TicketResponseDTO>> findAllTicket() {
		List<TicketResponseDTO> list = ticketService.findAllTicket();
		return ResponseEntity.ok(list);
	}
}