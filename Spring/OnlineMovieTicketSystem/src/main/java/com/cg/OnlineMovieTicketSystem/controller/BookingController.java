package com.cg.OnlineMovieTicketSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.OnlineMovieTicketSystem.exception.UserNamePasswordNotProvidedException;
import com.cg.OnlineMovieTicketSystem.model.Booking;
import com.cg.OnlineMovieTicketSystem.model.User;
import com.cg.OnlineMovieTicketSystem.service.BookingService;
import com.cg.OnlineMovieTicketSystem.service.MovieService;
import com.cg.OnlineMovieTicketSystem.service.TheaterService;
import com.cg.OnlineMovieTicketSystem.service.UserService;

/*
 * @author-Tushar Tevetia
 */
@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookingController {

	
	@Autowired
	private BookingService bookingService;
	@Autowired
	private MovieService movieService;
	@Autowired
	private TheaterService theaterService;
	@Autowired
	private UserService userService;
	
	//-------------------------------------------Do Booking-------------------------------------------------------------------
	
	@RequestMapping(value="/booking/doBooking",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Booking addBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}
	
	//--------------------------------------------Cancel Booking--------------------------------------------------------------
	
	@RequestMapping(value="/booking/cancelbooking/{bookingId}",method=RequestMethod.DELETE)
	public String cancelBooking(@PathVariable("bookingId")Integer bookingId) {
		return bookingService.cancelBooking(bookingId);
	}
	
	//--------------------------------------------Login-------------------------------------------------------------------
	
	@GetMapping("/Login/Validate/{name}/{password}")
	public int validateLogin(@PathVariable String name,@PathVariable String password)
	{
		if(name.contentEquals("null") || password.contentEquals("null"))
		{ 
			throw new UserNamePasswordNotProvidedException("UserName or Password Should Not be Empty");
		}
		else
		return userService.validateLogin(name, password);
	}
	
	
	//---------------------------------------------SignUp/Register New User----------------------------------------------
	
	@PostMapping("/SignUp/Register")
	public ResponseEntity<String> signUp(@RequestBody User userobject) {
//		if(userobject.getName().contentEquals("null")) throw new MovieException("Empty Name not allowed");
        userService.signUp(userobject);
        
		return new ResponseEntity<String>("User Successfully Created",HttpStatus.OK);
	}
	
	/*
	 * @GetMapping("/User/UserName/{name}") public List<Customer>
	 * getEmployeeByUserName(@PathVariable String name) { return
	 * userService.getUserByUserName(name); }
	 */

//	@GetMapping("/User/custId/{name}")
//	public int getIdByName(@PathVariable String name)
//	{
//		return userService.getIdByName(name);
//	}
	
	//----------------------------------------------Get Login Details--------------------------------------------------------
	
	@GetMapping("/Login/LoginDetails/{name}")
	public User loginDetails(@PathVariable ("name") String name)
	{
		return userService.loginDetails(name);
	}

//-----------------------------------------------------Change Password---------------------------------------------------
	@PutMapping("/Login/ChangePassword")
	public boolean changePassword(@RequestBody User login)
	{
	return userService.changePassword(login);	
	}


}
