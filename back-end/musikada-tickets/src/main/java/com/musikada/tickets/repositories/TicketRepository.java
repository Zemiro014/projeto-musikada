package com.musikada.tickets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musikada.tickets.entities.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, String>{

}