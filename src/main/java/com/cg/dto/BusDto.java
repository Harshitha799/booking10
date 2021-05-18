package com.cg.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/*********************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0 
 * Date: 20-04-2021 
 * Description: This is the dto class of the Bus module
 *
 *********************************************************************/

public class BusDto {
	
    @NotEmpty(message = "busnumber should not be null")
	private String busNumber;
	@NotNull(message = "fare should not be null")
	private int fare;
	@NotNull(message = "no of seats should not be null")
    private int totalSeats;
	@NotNull(message = "busRouteId should not be null")
	private int busRouteId;
	
	private int busOperatorId;

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getBusRouteId() {
		return busRouteId;
	}

	public void setBusRouteId(int busRouteId) {
		this.busRouteId = busRouteId;
	}

	public int getBusOperatorId() {
		return busOperatorId;
	}

	public void setBusOperatorId(int busOperatorId) {
		this.busOperatorId = busOperatorId;
	}

	public BusDto(@NotEmpty(message = "busnumber should not be null") String busNumber,
			@NotNull(message = "fare should not be null") int fare,
			@NotNull(message = "no of seats should not be null") int totalSeats,
			@NotNull(message = "busRouteId should not be null") int busRouteId, int busOperatorId) {
		super();
		this.busNumber = busNumber;
		this.fare = fare;
		this.totalSeats = totalSeats;
		this.busRouteId = busRouteId;
		this.busOperatorId = busOperatorId;
	}

	public BusDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BusDto [busNumber=" + busNumber + ", fare=" + fare + ", totalSeats=" + totalSeats + ", busRouteId="
				+ busRouteId + ", busOperatorId=" + busOperatorId + "]";
	}

	
}
