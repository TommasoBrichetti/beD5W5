package com.tommasobrichetti.bed5w5.repositories;

import com.tommasobrichetti.bed5w5.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}
