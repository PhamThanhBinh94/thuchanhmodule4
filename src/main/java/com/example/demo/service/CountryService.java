package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.model.Country;
import org.springframework.stereotype.Service;

@Service
public interface CountryService {
    Iterable<Country> findAll();
}
