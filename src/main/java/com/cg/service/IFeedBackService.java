package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.BusOperatorDto;
import com.cg.dto.FeedbackDto;
import com.cg.entity.Feedback10;


/**************************************************************************
 * 
 * @author Prithviraj V
 * Version: 1.0
 * Description: This is the service layer's IFeedBackService interface
 * Created date: 20-04-2021
 * 
 ****************************************************************************/

@Service
public interface IFeedBackService {
	
	public Feedback10 addFeedback(FeedbackDto feedback);
	
	//public List<Feedback11> viewAllFeedBacks(String routeName);
	
	public List<Feedback10> viewAllFeedBacks(BusOperatorDto busoperator);
	
	public List<Feedback10> viewAllFeedBacks(String routeName);
	
}