package com.cg.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
public class BusOperator10 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busOperatorId;
	private String busOperatorUsername;
	private String password;
	
	@Column
    @ElementCollection(targetClass=Integer.class)
	private List<Integer> caseNumber; 

	@OneToMany(mappedBy="busOperator",cascade = CascadeType.ALL)
	private List<Bus10> bus;
	
	@OneToMany(mappedBy="busoperator1")
	private List<Feedback10> feedback;

	public int getbusOperatorId() {
		return busOperatorId;
	}

	public void setbusOperatorId(int busOperatorId) {
		this.busOperatorId = busOperatorId;
	}

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

	public List<Integer> getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(List<Integer> caseNumber) {
		this.caseNumber = caseNumber;
	}

	public List<Bus10> getBus() {
		return bus;
	}

	public void setBus(List<Bus10> bus) {
		this.bus = bus;
	}

	public List<Feedback10> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<Feedback10> feedback) {
		this.feedback = feedback;
	}

	public BusOperator10(int busOperatorId, String busOperatorUsername, String password, List<Integer> caseNumber,
			List<Bus10> bus, List<Feedback10> feedback) {
		super();
		this.busOperatorId = busOperatorId;
		this.busOperatorUsername = busOperatorUsername;
		this.password = password;
		this.caseNumber = caseNumber;
		this.bus = bus;
		this.feedback = feedback;
	}

	public BusOperator10() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BusOperator10 [busOperatorId=" + busOperatorId + ", busOperatorUsername=" + busOperatorUsername
				+ ", password=" + password + ", caseNumber=" + caseNumber + ", bus=" + bus + ", feedback=" + feedback
				+ "]";
	}

	
	

}