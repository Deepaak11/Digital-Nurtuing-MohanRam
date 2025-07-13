package com.cognizant.spring_learn.controller;



import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;
@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START: getCountry() with code {}", code);
        Country country = countryService.getCountry(code);
        LOGGER.info("END: getCountry()");
        return country;
    }

    // existing method for /country (optional)
    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START: getCountryIndia()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country");
        LOGGER.info("END: getCountryIndia()");
        return country;
    }
}

