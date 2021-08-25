package com.inmobi.gamesyndbackend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "Publisher")
@Entity
@Getter
@Setter
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;
}
