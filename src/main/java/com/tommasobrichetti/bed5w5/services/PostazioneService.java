package com.tommasobrichetti.bed5w5.services;

import com.tommasobrichetti.bed5w5.entities.Citta;
import com.tommasobrichetti.bed5w5.entities.Postazione;
import com.tommasobrichetti.bed5w5.entities.Tipo;
import com.tommasobrichetti.bed5w5.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {
    @Autowired
    PostazioneRepository pr;

    public void addPostazione(Postazione p){
        pr.save(p);
    }

    public List<Postazione> getAll(){
        return pr.findAll();
    }

    public Postazione findPostazioneById(Long id){
        return pr.findById(id).isPresent() ? pr.findById(id).get() : null;
    }

    public List<Postazione> findPostazioneByTipo(Tipo tipo){
       return pr.findPostazioneByTipo(tipo);
    }

    public List<Postazione> findPostazioneByTipoECitta(Tipo tipo, Citta citta){
        return pr.findPostazioneByTipoAndCitta(tipo, citta);
    }

}
