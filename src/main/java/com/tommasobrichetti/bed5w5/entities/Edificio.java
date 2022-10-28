package com.tommasobrichetti.bed5w5.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String address;

    @ManyToOne
    @JoinColumn(name = "citta_id")
    private Citta citta;

    @OneToMany(mappedBy = "edificio")
    @ToString.Exclude
    List<Postazione> postazioni;


}
