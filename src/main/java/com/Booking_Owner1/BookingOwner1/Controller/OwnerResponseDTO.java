package com.Booking_Owner1.BookingOwner1.Controller;


import com.Booking_Owner1.BookingOwner1.Entity.Details;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OwnerResponseDTO {
    private String OwnerId;
    private Details detailsofowner;
}
