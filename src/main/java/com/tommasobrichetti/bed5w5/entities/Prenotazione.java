package com.tommasobrichetti.bed5w5.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NamedEntityGraph
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate data;

    @OneToOne
    private Postazione postazione;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
