package com.Booking_Owner1.BookingOwner1.DAOLayer;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Booking_Owner1.BookingOwner1.Entity.OwnerDetails;

public interface DAOLayer extends MongoRepository<OwnerDetails, String>{

}
