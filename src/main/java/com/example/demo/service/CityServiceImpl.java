package com.example.demo.service;


import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;

    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Integer id) {
        return cityRepository.findById(id).get();
    }

    @Override
    public void save(City contact) {
        cityRepository.save(contact);
    }

    @Override
    public void delete(int id) {
        cityRepository.deleteById(id);
    }
}
