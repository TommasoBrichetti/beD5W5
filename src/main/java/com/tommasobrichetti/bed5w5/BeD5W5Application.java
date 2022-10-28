package com.tommasobrichetti.bed5w5;

import com.tommasobrichetti.bed5w5.entities.*;
import com.tommasobrichetti.bed5w5.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BeD5W5Application implements CommandLineRunner {

    @Autowired
    UserService us;
    @Autowired
    CittaService cs;
    @Autowired
    EdificioService es;
    @Autowired
    PostazioneService ps;
    @Autowired
    PrenotazioneService prs;

    public static void main(String[] args) {
        SpringApplication.run(BeD5W5Application.class, args);
    }

  @Override
    public void run(String... args) throws Exception{
        //insertUser(User.builder().username("mariello").nomeCompleto("mario rossi").email("rossim@gmail.com").build());
//        insertCitta(Citta.builder().name("Toronto").build());
//        insertEdificio(Edificio.builder().name("Palazzo verde").address("Via vegas").citta(cs.findCittaById(1L)).build());
//        insertPostazione(Postazione.builder().tipo(Tipo.OPENSPACE).maxSize(60).description("lavoro").edificio(es.findEdificioById(1L)).build());
      realPrenotazione(us.findUserById(1L),ps.findPostazioneById(1L),LocalDate.now());
    }

    public void insertUser(User u){
        us.addUser(u);
    }
    public void insertCitta(Citta c){
        cs.addCitta(c);
    }
    public void insertEdificio(Edificio e){
        es.addEdificio(e);
    }
    public void insertPostazione(Postazione p){
        ps.addPostazione(p);
    }
    public void insertPrenotazione(Prenotazione pr){
        prs.addPrenotazione(pr);
    }
    public void realPrenotazione(User u, Postazione p, LocalDate d){
        prs.realAddPrenotazione(u,p,d);
    }
}
