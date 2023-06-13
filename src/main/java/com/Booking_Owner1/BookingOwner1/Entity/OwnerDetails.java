package com.Booking_Owner1.BookingOwner1.Entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "ownerDB")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class OwnerDetails {

	@Id
	private String ownerId;
	private Details detailsofowner;
	private Photo photodetails;
	private List<ticketcollection> tickets;
	
}
