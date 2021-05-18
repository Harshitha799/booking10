package com.cg.controller;
//package com.cg.controller;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cg.entity.Booking10;
//import com.cg.entity.Feedback10;
//import com.cg.entity.Passenger10;
//import com.cg.entity.User10;
//import com.cg.exception.BookingValidationException;
//import com.cg.exception.IdNotFoundException;
//import com.cg.exception.InvalidBookingException;
//import com.cg.exception.InvalidBookingUsernameException;
//import com.cg.exception.InvalidBusRouteNameException;
//import com.cg.exception.InvalidDateException;
//
//import com.cg.service.BookingServiceImpl;
//
//import io.swagger.annotations.Api;
//
//
///******************************************************************
// * 
// * @author Harshitha V
// * Version: 1.0
// * Description: This is controller methods implementation
// * Created date: 21-04-2021
// * 
// ******************************************************************/
//
//@RestController
//@Api(value = "BusRoute API")
//@RequestMapping(value = "/OnlineBusBooking/busRoute")
//public class BusRouteController {
//
//	
//	@Autowired
//	BusRouteServiceImpl busRouteService;
//
//	@GetMapping(value='/search')
//  public List<Bus11> search(@PathVariable source, @Pathvariable destination)
//  {
//      BusRoute11 route=new BusRoute11();
//		if(busRouteRepository.existsBySource(source) && busRouteRepository.existsByDestination(destination))
//		{
//			return route.getBus();
//		}
//		else
//		{
//			throw new InvalidRouteNameException("invalid route");
//		}
//	
//	
//}