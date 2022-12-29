package com.user.userMicroservice.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Labour {
	@Id
	@GeneratedValue
	private Integer uuid;

	private String labourName;

	private Integer mobileNo;

	private String panCard;

	private String specialization;

	private List<String> locations;

	private Double payPerDay;

	public Labour() {
		super();
	}

	public Labour(Integer uuid, String labourName, Integer mobileNo, String panCard, String specialization,
			List<String> locations, Double payPerDay) {
		super();
		this.uuid = uuid;
		this.labourName = labourName;
		this.mobileNo = mobileNo;
		this.panCard = panCard;
		this.specialization = specialization;
		this.locations = locations;
		this.payPerDay = payPerDay;
	}

	public Integer getUuid() {
		return uuid;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

	public String getLabourName() {
		return labourName;
	}

	public void setLabourName(String labourName) {
		this.labourName = labourName;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	public Double getPayPerDay() {
		return payPerDay;
	}

	public void setPayPerDay(Double payPerDay) {
		this.payPerDay = payPerDay;
	}
	
	

}
