package com.ust.labour.labourPoint.model;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "labour")
public class Labour{
	
	@Id
	@GeneratedValue
	private Integer uuid;
	
	@NotBlank(message = "Name is mandatory")
	@Size(min=2, max=30, message = "Name must be between 2 to 30")
	private String labourName;
	
	@NotNull
	@NotBlank(message="Please enter your phone number")
	@Length(min = 10, max = 10, message = "Please enter valid phone number")
	private String phoneNumber;
	
	@Email(message = "Enter valid email id")
	private String email;
	
	private String panCard;
	
	@NotBlank(message = "Specialization is mandatory")
	private String specialization;
	
	private List<String> locations;
	
	private Double payPerDay;
	
	public Labour() {

	}
	
	public Labour(Integer uuid, String labourName, String phoneNumber, String email, String panCard, String specialization, List<String> locations,
			double payPerDay) {
		this.uuid = uuid;
		this.labourName = labourName;
		this.phoneNumber = phoneNumber;
		this.email = email;
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
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
