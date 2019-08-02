package me.kotkot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import me.kotkot.models.Country;
import me.kotkot.services.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;

	@RequestMapping("/{country_code}")
	public ResponseEntity<Country> getCountry(@PathVariable String country_code) {
		Country country = countryService.getCountryByCode(country_code);
		/*
		 * Handle Invalid Code County
		 */
		if (country == null) {
			return new ResponseEntity("INVALID_COUNTRY_CODE", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(country, HttpStatus.OK);
	}

	@RequestMapping("/")
	public Object index() {
		return "App Is Running .. ";
	}
}
