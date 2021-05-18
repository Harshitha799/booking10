package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.BusOperatorDto;
import com.cg.dto.FeedbackDto;
import com.cg.entity.BusOperator10;
import com.cg.entity.Feedback10;
import com.cg.entity.User10;
import com.cg.exception.InvalidRouteNameException;
import com.cg.repository.IBusOperator;
import com.cg.repository.IFeedBackRepository;
import com.cg.repository.IUserRepository;

/************************************************************************************************
 * 
 * @author Prithviraj V
 * Version: 1.0
 * Description: This is the service implementation class of the function declared in the 
 * 				service interface IFeedBackService that autowires a bean of IFeedBackRepository,
 * 				IUserRepository and IBusOperator to perform JPA Functions
 * Created date: 21-04-2021
 * 
 *************************************************************************************************/

@Service
public class FeedbackServiceImpl implements IFeedBackService{
	
	@Autowired
	IFeedBackRepository feedbackRepository;
	@Autowired
	IUserRepository userRepository;
	@Autowired
	IBusOperator busoperatorRepository;

	/****************************************************************************
	 * Method: addFeedback
	 * @param feedbackdto
	 * @return Feedback10
	 * Description: adds Feedback object in the Oracle Database connected to it
	 *****************************************************************************/
	
	@Override
	public Feedback10 addFeedback(FeedbackDto feedbackdto) {
		Feedback10 feedback=new Feedback10();
		BusOperator10 busoperator=busoperatorRepository.findById(feedbackdto.getBusoperator()).get();
		User10 user = userRepository.findById(feedbackdto.getUserId()).get();
		feedback.setBusoperator1(busoperator);
		feedback.setUser(user);
		feedback.setComments(feedbackdto.getComments());
		feedback.setRatings(feedbackdto.getRatings());
		feedback.setRouteName(feedbackdto.getRouteName());
		feedback.setUsername(feedbackdto.getUsername());
		return feedbackRepository.save(feedback);
	}

	/****************************************************************************
	 * Method: viewAllFeedBacks
	 * @param routeName
	 * @return List<Feedback10>
	 * @throws InvalidRouteNameException
	 * Description: allows client to view feedback based on the bus routeName  
	 *****************************************************************************/
	
//	@Override
//	public List<Feedback11> viewAllFeedBacks(String routeName) {
//		if(feedbackRepository.existsByRouteName(routeName)) {
//			return feedbackRepository.findByRouteName(routeName);
//		}
//		else {
//			throw new InvalidRouteNameException();
//		}
//	}

	
	
	
	
	
	
	
	@Override
	public List<Feedback10> viewAllFeedBacks(String routeName) {
		if(feedbackRepository.existsByRouteName(routeName)) {
			return feedbackRepository.findByRouteName(routeName);
		}
		else {
			throw new InvalidRouteNameException();
		}
	}
	/****************************************************************************
	 * Method: viewAllFeedBacks
	 * @param busoperator
	 * @return List<Feedback10>
	 * Description: allows client to view feedback based on busoperator  
	 *****************************************************************************/
	
	@Override
	public List<Feedback10> viewAllFeedBacks(BusOperatorDto busoperator) {
			return feedbackRepository.findByBusOperator(busoperator);	
	}

}