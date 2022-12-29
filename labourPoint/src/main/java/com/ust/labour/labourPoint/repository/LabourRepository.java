package com.ust.labour.labourPoint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.labour.labourPoint.model.Labour;

public interface LabourRepository extends JpaRepository<Labour, Integer> {

	public List<Labour> findBySpecialization(String specialization);

	public List<Labour> findByPayPerDay(double pricePerDay);

}
