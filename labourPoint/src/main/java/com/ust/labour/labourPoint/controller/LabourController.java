package com.ust.labour.labourPoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.labour.labourPoint.exception.LabourNotFoundException;
import com.ust.labour.labourPoint.model.Labour;
import com.ust.labour.labourPoint.response.WorkResponse;
import com.ust.labour.labourPoint.service.LabourService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("api/labourpoint")
public class LabourController {

	@Autowired
	private LabourService labourService;

	@GetMapping(path = "labour")
	public List<Labour> retrieveAllLabour() {
		List<Labour> labourList = labourService.retrieveAllLabour();
		if(labourList.isEmpty()) {
			throw new LabourNotFoundException("Labour Not Found");
		}
		return labourList;
	}
	
	@PostMapping(path = "labour/register")
	public Labour createNewLabour(@Valid @RequestBody Labour labour) {
		return labourService.addNewLabour(labour);	
	}
	
	@PutMapping(path = "labour/update")
	public Labour updateLabour(@RequestBody Labour labour) {
		return labourService.updateExistingLabour(labour);
	}
	
	@GetMapping(path = "labour/price/{price}")
	public List<Labour> retrieveLabourByPricePerDay(@PathVariable double price) {
		System.out.println("Labour By Price..."+price);
		return labourService.findByLabourPricePerDay(price);	
	}
	
	@GetMapping(path = "labour/specialization/{specialization}")
	public List<Labour> retrieveLabourBySpecialization(@PathVariable String specialization) {
		return labourService.findByLabourSpecialization(specialization);	
	}
	
	//Rest Call To User
	@GetMapping(path = "labour/users/{uiid}/{specialization}")
	public WorkResponse searchWorkBySpecialization(@PathVariable Integer uiid,@PathVariable String specialization) {
		return labourService.searchSpecializedWork(uiid, specialization);
	}
}
