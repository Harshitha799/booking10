package com.cg.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*********************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0 
 * Date: 19-04-2021 
 * Description: This is the entity class of the Booking module
 *
 *********************************************************************/

@Entity
@Table
public class Admin10 {
	@Id
	private int adminId;
	private String adminUsername;
	private String password;
	
	@Column
    @ElementCollection(targetClass=Integer.class)
	private List<Integer> caseNumber; // bus operator's updation or bus cancelation request

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Integer> getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(List<Integer> caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Admin10(int adminId, String adminUsername, String password, List<Integer> caseNumber) {
		super();
		this.adminId = adminId;
		this.adminUsername = adminUsername;
		this.password = password;
		this.caseNumber = caseNumber;
	}

	public Admin10() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Admin10 [adminId=" + adminId + ", adminUsername=" + adminUsername + ", password=" + password
				+ ", caseNumber=" + caseNumber + "]";
	}

	
	/******************************************************************
	 * Description: Getter & Setter functions for the above attributes
	 * 
	 ******************************************************************/
	
	
	
	
	
	
}