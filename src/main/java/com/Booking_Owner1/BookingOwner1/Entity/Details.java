package com.Booking_Owner1.BookingOwner1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Details {
    private String fname;
    private String lname;
    private int bikeSpace;
    private int carSpace;
    private String paddress;
    private boolean isVerified;
    private String pmanager;
    private String pphNo;
    private String plotName;
}
