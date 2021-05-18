package com.cg.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*********************************************************************
 * 
 * @author Hima Bindhu 
 * Version: 1.0 
 * Date: 19-04-2021 
 * Description: This is the entity class of the Booking module
 *
 *********************************************************************/

@Entity
@Table
public class Bus10 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busId;
	private String busNumber;
	private int totalSeats;
	private int fare;
	
	@ManyToOne
	@JoinColumn(name="busrouteId")
	private BusRoute10 busRoute;
	
	@ManyToOne
	@JoinColumn(name="busOperatorId",referencedColumnName = "busOperatorId")
	private  BusOperator10 busOperator;
	
	@OneToOne
	@JoinColumn(name="busoperatorrequestId")
	private BusOperatorRequest10 busOperatorRequest;

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public BusRoute10 getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(BusRoute10 busRoute) {
		this.busRoute = busRoute;
	}

	public BusOperator10 getBusOperator() {
		return busOperator;
	}

	public void setBusOperator(BusOperator10 busOperator) {
		this.busOperator = busOperator;
	}

	public BusOperatorRequest10 getBusOperatorRequest() {
		return busOperatorRequest;
	}

	public void setBusOperatorRequest(BusOperatorRequest10 busOperatorRequest) {
		this.busOperatorRequest = busOperatorRequest;
	}

	public Bus10(int busId, String busNumber, int totalSeats, int fare, BusRoute10 busRoute, BusOperator10 busOperator,
			BusOperatorRequest10 busOperatorRequest) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.totalSeats = totalSeats;
		this.fare = fare;
		this.busRoute = busRoute;
		this.busOperator = busOperator;
		this.busOperatorRequest = busOperatorRequest;
	}

	public Bus10() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bus10 [busId=" + busId + ", busNumber=" + busNumber + ", totalSeats=" + totalSeats + ", fare=" + fare
				+ ", busRoute=" + busRoute + ", busOperator=" + busOperator + ", busOperatorRequest="
				+ busOperatorRequest + "]";
	}


	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/
	
	
	

}