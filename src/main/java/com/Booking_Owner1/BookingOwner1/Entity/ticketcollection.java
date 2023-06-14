package com.Booking_Owner1.BookingOwner1.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ticketcollection {
	@Id
	private String ticketNumber;
	private String ticketStatus; //to be changed as Boolean
	private String ticketId;
	private String OwnerId;
	private String userId;
	private String vehicleNumber;
}
