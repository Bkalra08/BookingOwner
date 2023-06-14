package com.Booking_Owner1.BookingOwner1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Booking_Owner1.BookingOwner1.Controller.OwnerResponseDTO;
import com.Booking_Owner1.BookingOwner1.DAOLayer.DAOLayer;
import com.Booking_Owner1.BookingOwner1.Entity.Details;
import com.Booking_Owner1.BookingOwner1.Entity.OwnerDetails;
import com.Booking_Owner1.BookingOwner1.Entity.ticketcollection;


@Service
public class ServiceClass implements ServiceClassInterface {
    @Autowired
    private DAOLayer dao;

//    @Override
//    public OwnerDetails AddOwnerDetails(OwnerDetails details) {
//        dao.save(details);
//        return details;
//    }

    @Override
    public void DeleteOwnerDetails(String OwnerId) {
        dao.deleteById(OwnerId);
    }

    @Override
    public OwnerDetails findById(String OwnerId) {
        return dao.findById(OwnerId).orElseThrow(() -> new RuntimeException("OwnerDetails not found"));
    }

    @Override
    public List<OwnerDetails> getAllOwnerDetails() {
        return dao.findAll();
    }

    @Override
    public List<OwnerResponseDTO> getAllOwnerDetailswithoutticketandphoto() {
        List<OwnerDetails> ownerDetailsList = dao.findAll();
        List<OwnerResponseDTO> responseDTOList = new ArrayList<>();

        for (OwnerDetails ownerDetails : ownerDetailsList) {
            OwnerResponseDTO responseDTO = new OwnerResponseDTO();
            responseDTO.setOwnerId(ownerDetails.getOwnerId());
            responseDTO.setDetailsofowner(ownerDetails.getDetailsofowner());
            responseDTOList.add(responseDTO);
        }

        return responseDTOList;
    }
    @Override
    public void updateBike(String OwnerId, int bikeSpace) {
        OwnerDetails ownerDetails = findById(OwnerId);
        ownerDetails.getDetailsofowner().setBikeSpace(bikeSpace);
        dao.save(ownerDetails);
    }

    @Override
    public void updateCar(String OwnerId, int carSpace) {
        OwnerDetails ownerDetails = findById(OwnerId);
        ownerDetails.getDetailsofowner().setCarSpace(carSpace);
        dao.save(ownerDetails);
    }
    
    @Override
    public Details getOwnerDetails(String ownerId) {
        OwnerDetails ownerDetails = findById(ownerId);
        return ownerDetails.getDetailsofowner();
    }

    @Override
    public List<ticketcollection> getAllTicketsByOwnerId(String ownerId) {
        OwnerDetails ownerDetails = findById(ownerId);
        return ownerDetails.getTickets();
    }
    @Override
    public void addTicketToOwner(String ownerId, ticketcollection ticket) {
        OwnerDetails ownerDetails = findById(ownerId);
        ownerDetails.getTickets().add(ticket);
        dao.save(ownerDetails);
    }
    @Override
    public ticketcollection getTicketDetails(String ownerId, String ticketId) {
        OwnerDetails ownerDetails = findById(ownerId);
        List<ticketcollection> tickets = ownerDetails.getTickets();
        
        for (ticketcollection ticket : tickets) {
            if (ticket.getTicketId().equals(ticketId)) {
                return ticket;
            }
        }
        
        throw new RuntimeException("Ticket not found");
    }


	@Override
	public OwnerDetails AddOwnerDetails(OwnerDetails details) {
		dao.save(details);
	    return details;
	}
}