package com.ust.labour.labourPoint.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ust.labour.labourPoint.exception.LabourNotFoundException;
import com.ust.labour.labourPoint.model.Labour;
import com.ust.labour.labourPoint.repository.LabourRepository;
import com.ust.labour.labourPoint.response.User;
import com.ust.labour.labourPoint.response.WorkResponse;

@Service
public class LabourService {

	@Autowired
	private LabourRepository labourRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Labour addNewLabour(Labour labour) {
		return labourRepository.save(labour);
	}

	public List<Labour> retrieveAllLabour() {
		return labourRepository.findAll();
	}

	public List<Labour> findByLabourSpecialization(String specialization) {
		return labourRepository.findBySpecialization(specialization);
	}

	public List<Labour> findByLabourPricePerDay(double pricePerDay) {
		return labourRepository.findByPayPerDay(pricePerDay);
	}

	public Labour updateExistingLabour(Labour labour) {
		Labour newLabour = new Labour();
		Optional<Labour> findById = labourRepository.findById(labour.getUuid());
		if (findById.isPresent()) {
			newLabour.setUuid(labour.getUuid());
			newLabour.setLabourName(labour.getLabourName());
			newLabour.setPanCard(labour.getPanCard());
			newLabour.setPhoneNumber(labour.getPhoneNumber());
			newLabour.setEmail(labour.getEmail());
			newLabour.setSpecialization(labour.getSpecialization());
			newLabour.setPayPerDay(labour.getPayPerDay());
			newLabour.setLocations(labour.getLocations());
		} else {
			return new Labour();
		}
		return labourRepository.save(newLabour);
	}

	public WorkResponse searchSpecializedWork(Integer id, String specialization) {
		WorkResponse apiResponse = new WorkResponse();
		Optional<Labour> object = labourRepository.findById(id);
		if (object.isPresent()) {
			Labour labour = object.get();

			ResponseEntity<List<User>> exchange = restTemplate.exchange(
					"http://localhost:8091/api/user/getUser/work/Flooring Installer", 
					HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {});
			List<User> userList = exchange.getBody();

			apiResponse.setLabour(labour);
			apiResponse.setUsersList(userList);
		} else {
			throw new LabourNotFoundException("Labout Not Found:" + id);
		}
		return apiResponse;
	}
}
