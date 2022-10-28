package com.tommasobrichetti.bed5w5.services;

import com.tommasobrichetti.bed5w5.entities.Citta;
import com.tommasobrichetti.bed5w5.entities.Postazione;
import com.tommasobrichetti.bed5w5.entities.Prenotazione;
import com.tommasobrichetti.bed5w5.entities.User;
import com.tommasobrichetti.bed5w5.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneRepository prr;

    public void addPrenotazione(Prenotazione p){
        prr.save(p);
    }

    public void realAddPrenotazione(User u, Postazione p, LocalDate d){
        Prenotazione prenotazione = Prenotazione.builder().user(u).data(d).postazione(p).build();
        List<Prenotazione> list = prr.checkValiditaPrenotazione(u,d,p);
        if (list.size()==0){
            prr.save(prenotazione);
        }else{
            System.out.println("Non pupi POJOOOO!");
        }
    }

    public List<Prenotazione> getAll(){
        return prr.findAll();
    }

    public Prenotazione findPrenotazioneById(Long id){
        return prr.findById(id).isPresent() ? prr.findById(id).get() : null;
    }
}
