package com.tommasobrichetti.bed5w5.repositories;

import com.tommasobrichetti.bed5w5.entities.Postazione;
import com.tommasobrichetti.bed5w5.entities.Prenotazione;
import com.tommasobrichetti.bed5w5.entities.Tipo;
import com.tommasobrichetti.bed5w5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM Prenotazione WHERE (user_id = :u AND data = :d) OR (postazione_id = :p AND " +
                    "data= :d)"
    )
    public List<Prenotazione> checkValiditaPrenotazione(@Param( "u" ) User u, @Param( "d" ) LocalDate d,
                                                     @Param( "p" ) Postazione p);
    //se array.lenght = 0 allora posso procedere
}
