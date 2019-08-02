package me.kotkot.services;

import me.kotkot.models.Country;
import me.kotkot.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	public Country getCountryByCode(String code) {
		return countryRepository.findCountryByCode(code);
	}
}
