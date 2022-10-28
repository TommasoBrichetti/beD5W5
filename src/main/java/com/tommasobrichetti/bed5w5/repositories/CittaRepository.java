package com.tommasobrichetti.bed5w5.repositories;

import com.tommasobrichetti.bed5w5.entities.Citta;
import com.tommasobrichetti.bed5w5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CittaRepository extends JpaRepository<Citta, Long> {

}
