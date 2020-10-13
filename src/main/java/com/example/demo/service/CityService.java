package com.example.demo.service;


import com.example.demo.model.City;
import org.springframework.stereotype.Service;

@Service
public interface CityService {
    Iterable<City> findAll();

    City findById(Integer id);

    void save(City contact);

    void delete(int id);
}
