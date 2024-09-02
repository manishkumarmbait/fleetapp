package com.kindsonthegenius.fleetapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	// Return list of Countries
	public List<Country> getCountries() {
		return countryRepository.findAll();
	}

	// Save new Country

	public void save(Country country) {
		countryRepository.save(country);
	}

	// get by id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}

	public void delete(Integer id) {
		countryRepository.deleteById(id);
	}

}
