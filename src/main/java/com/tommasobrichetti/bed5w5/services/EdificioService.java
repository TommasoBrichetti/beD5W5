package com.tommasobrichetti.bed5w5.services;

import com.tommasobrichetti.bed5w5.entities.Citta;
import com.tommasobrichetti.bed5w5.entities.Edificio;
import com.tommasobrichetti.bed5w5.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {

    @Autowired
    EdificioRepository er;

    public void addEdificio(Edificio e){
        er.save(e);
    }

    public List<Edificio> getAll(){
        return er.findAll();
    }

    public Edificio findEdificioById(Long id){
        return er.findById(id).isPresent() ? er.findById(id).get() : null;
    }
}
