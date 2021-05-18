package com.cg.dto;

import javax.validation.constraints.NotEmpty;

/*********************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0 
 * Date: 20-04-2021 
 * Description: This is the dto class of the BusOpeartor module
 *
 *********************************************************************/

public class BusOperatorDto {
	@NotEmpty(message = "username should not be empty")
	private String busOperatorUsername;
	@NotEmpty(message = "password should not be empty")
	private String password;
	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}
	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BusOperatorDto(@NotEmpty(message = "username should not be empty") String busOperatorUsername,
			@NotEmpty(message = "password should not be empty") String password) {
		super();
		this.busOperatorUsername = busOperatorUsername;
		this.password = password;
	}
	public BusOperatorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
