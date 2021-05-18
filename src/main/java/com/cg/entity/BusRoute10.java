package com.cg.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
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
public class BusRoute10 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="busRoute_Counter",sequenceName="busRoute_Sequence",initialValue=1)
	private  int busrouteId;
	@Column(unique=true)
	private String routeName ;
	private String source;
	private String destination;
	
	@OneToMany(mappedBy="busRoute")
	private List<Bus10> bus;

	public int getBusrouteId() {
		return busrouteId;
	}

	public void setBusrouteId(int busrouteId) {
		this.busrouteId = busrouteId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<Bus10> getBus() {
		return bus;
	}

	public void setBus(List<Bus10> bus) {
		this.bus = bus;
	}

	public BusRoute10(int busrouteId, String routeName, String source, String destination, List<Bus10> bus) {
		super();
		this.busrouteId = busrouteId;
		this.routeName = routeName;
		this.source = source;
		this.destination = destination;
		this.bus = bus;
	}

	public BusRoute10() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BusRoute10 [busrouteId=" + busrouteId + ", routeName=" + routeName + ", source=" + source
				+ ", destination=" + destination + ", bus=" + bus + "]";
	}

	
	
}