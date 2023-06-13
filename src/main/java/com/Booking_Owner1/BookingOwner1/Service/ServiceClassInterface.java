package com.Booking_Owner1.BookingOwner1.Service;

import java.util.List;

import com.Booking_Owner1.BookingOwner1.Controller.OwnerResponseDTO;
import com.Booking_Owner1.BookingOwner1.Entity.Details;
import com.Booking_Owner1.BookingOwner1.Entity.OwnerDetails;
import com.Booking_Owner1.BookingOwner1.Entity.ticketcollection;


public interface ServiceClassInterface {
	void DeleteOwnerDetails (String OwnerId);
	OwnerDetails findById(String OwnerId);
	public List<OwnerDetails> getAllOwnerDetails();
	List<OwnerResponseDTO> getAllOwnerDetailswithoutticketandphoto();
	void updateBike(String OwnerId, int bikeSpace);
	void updateCar(String OwnerId, int carSpace);
	public OwnerDetails AddOwnerDetails(OwnerDetails details);
	List<ticketcollection> getAllTicketsByOwnerId(String ownerId);
	void addTicketToOwner(String ownerId, ticketcollection ticket);
	ticketcollection getTicketDetails(String ownerId, String ticketId);
}
