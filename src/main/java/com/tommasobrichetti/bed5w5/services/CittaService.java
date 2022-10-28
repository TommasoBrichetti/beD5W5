package com.tommasobrichetti.bed5w5.services;

import com.tommasobrichetti.bed5w5.entities.Citta;
import com.tommasobrichetti.bed5w5.repositories.CittaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CittaService {
    @Autowired
    CittaRepository cr;

    public void addCitta(Citta c){
        cr.save(c);
    }

    public List<Citta> getAll(){
        return cr.findAll();
    }

    public Citta findCittaById(Long id){
        return cr.findById(id).isPresent() ? cr.findById(id).get() : null;
    }
}
