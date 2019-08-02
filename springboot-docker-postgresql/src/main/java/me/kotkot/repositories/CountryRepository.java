package me.kotkot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import me.kotkot.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {
	public Country findCountryByCode(String code);
}
