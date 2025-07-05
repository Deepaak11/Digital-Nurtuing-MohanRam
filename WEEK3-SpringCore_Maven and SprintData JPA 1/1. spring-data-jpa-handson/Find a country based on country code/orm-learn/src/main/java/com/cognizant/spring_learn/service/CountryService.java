package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

public interface CountryService {
    Country findCountryByCode(String countryCode) throws CountryNotFoundException;
}