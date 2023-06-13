package com.Booking_Owner1.BookingOwner1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Owner Data for BookMySlot",version = "1.0" , description= "API for BookMySlot"))
public class BookingOwner1Application {

	public static void main(String[] args) {
		SpringApplication.run(BookingOwner1Application.class, args);
	}

}
