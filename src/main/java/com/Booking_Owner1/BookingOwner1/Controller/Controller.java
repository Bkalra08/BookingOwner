package com.Booking_Owner1.BookingOwner1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Booking_Owner1.BookingOwner1.Entity.Details;
import com.Booking_Owner1.BookingOwner1.Entity.OwnerDetails;
import com.Booking_Owner1.BookingOwner1.Entity.ticketcollection;
import com.Booking_Owner1.BookingOwner1.Service.ServiceClass;
import com.Booking_Owner1.BookingOwner1.Service.ServiceClassInterface;

@RestController
@RequestMapping("/OwnerDetails")


public class Controller {
	@Autowired
	private ServiceClass services;
	
	@PostMapping("/AddOwnerDetails")
	public OwnerDetails AddOwnerDetails(@RequestBody OwnerDetails details) {
		return this.services.AddOwnerDetails(details);
	}
	@PutMapping("/owners/{ownerId}/tickets")
	public void updateOwnerWithTicket(@PathVariable String ownerId, @RequestBody ticketcollection ticket) {
	    services.addTicketToOwner(ownerId, ticket);
	}

	@DeleteMapping("/DeleteOwnerDetails/{OwnerId}")
	public ResponseEntity<?>DeleteData(@PathVariable String OwnerId){
		services.DeleteOwnerDetails(services.findById(OwnerId).getOwnerId());
		return new ResponseEntity("DATA DELETED SUCCESSFULLY" , HttpStatus.OK);
	}
	@GetMapping("/GetAllOwnerDetails")
	public List<OwnerDetails> getAllOwnerDetails() {
	    return this.services.getAllOwnerDetails();
	}
	@GetMapping("/GetAllOwnerDetailsnophoto")
	public List<OwnerResponseDTO> getAllOwnerDetailsWithoutTicketAndPhoto() {
	    return services.getAllOwnerDetailswithoutticketandphoto();
	}
	@GetMapping("/Owner/tickets/{ownerId}")
	public List<ticketcollection> getAllTicketsByOwnerId(@PathVariable String ownerId) {
	    return services.getAllTicketsByOwnerId(ownerId);
	}
	@GetMapping("/owners/{ownerId}/tickets/{ticketId}")
	public ticketcollection getTicketDetails(@PathVariable String ownerId, @PathVariable String ticketId) {
	    return services.getTicketDetails(ownerId, ticketId);
	}
	@GetMapping("/owners/{ownerId}")
	public Details getOwnerDetails(@PathVariable String ownerId) {
	    return services.getOwnerDetails(ownerId);
	}



	@PatchMapping("/UpdateBike/{OwnerId}")
	public ResponseEntity<?> updateBike(@PathVariable String OwnerId, @RequestBody int bikeSpace) {
	    services.updateBike(OwnerId, bikeSpace);
	    return new ResponseEntity<>("Bike details updated successfully", HttpStatus.OK);
	}

	@PatchMapping("/UpdateCar/{OwnerId}")
	public ResponseEntity<?> updateCar(@PathVariable String OwnerId, @RequestBody int carSpace) {
	    services.updateCar(OwnerId, carSpace);
	    return new ResponseEntity<>("Car details updated successfully", HttpStatus.OK);
	}
	


	
	
}
