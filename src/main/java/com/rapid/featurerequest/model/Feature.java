package com.rapid.featurerequest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Feature {

	/*Title: A short, descriptive name of the feature request.
Description: A long description of the feature request.
Client: A selection list of clients (use "Client A", "Client B", "Client C")
Client Priority: The feature's priority number according to the client (1...n). Client Priority numbers should not repeat for the given client, so if a priority is set on a new feature as "1", then all other feature requests for that client should be adjusted.
Target Date: The date that the client is hoping to have the feature.
Product Area: A selection list of product areas (use 'Policies', 'Billing', 'Claims', 'Reports')*/

	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private String description;
	
	//@Enumerated(EnumType.STRING)
	//private Client client;
	
	private String client;
	
	private Integer clientPriority;
	
	@Temporal(TemporalType.DATE)
	private Date targetDate;
	
	//@Enumerated(EnumType.STRING)
	//private ProductArea productArea;
	
	
	private String productArea;
	
	public Feature() {
		
	}
	
	
	public Feature(String title, String description, String client, Integer clientPriority, Date targetDate,
			String productArea) throws IllegalArgumentException {
		//super();
		if(title == null) {
			throw new IllegalArgumentException();
		}
		this.title = title;
		this.description = description;
		this.client = client;
		this.clientPriority = clientPriority;
		this.targetDate = targetDate;
		this.productArea = productArea;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getClientPriority() {
		return clientPriority;
	}
	public void setClientPriority(Integer clientPriority) {
		this.clientPriority = clientPriority;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getClient() {
		return client;
	}


	public void setClient(String client) {
		this.client = client;
	}


	public String getProductArea() {
		return productArea;
	}


	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	
	
	
}
