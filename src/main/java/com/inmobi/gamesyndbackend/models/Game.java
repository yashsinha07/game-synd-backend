package com.inmobi.gamesyndbackend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "Game")
@Entity
@Getter
@Setter
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;
}
