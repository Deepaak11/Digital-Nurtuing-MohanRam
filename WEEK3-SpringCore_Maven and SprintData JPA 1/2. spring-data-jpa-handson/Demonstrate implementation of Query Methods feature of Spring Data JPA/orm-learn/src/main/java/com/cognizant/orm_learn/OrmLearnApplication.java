package com.cognizant.orm_learn;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Test methods
		System.out.println("All countries:");
		countryService.getAllCountries().forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));

		System.out.println("\nGet country by code 'IN':");
		Optional<Country> country = countryService.getCountry("IN");
		country.ifPresent(c -> System.out.println(c.getCode() + " - " + c.getName()));

		System.out.println("\nAdding new country:");
		countryService.addCountry(new Country("ZZ", "Zootopia"));

		System.out.println("\nUpdating country name:");
		countryService.updateCountry(new Country("ZZ", "Zootopia - Updated"));

		System.out.println("\nSearch countries containing 'land':");
		List<Country> countries = countryService.searchByPartialName("land");
		countries.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));

		System.out.println("\nDeleting country 'ZZ'");
		countryService.deleteCountry("ZZ");
	}
}
