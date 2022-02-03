package com.dgoldstein1.cribbage.model;

import com.dgoldstein1.cribbage.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GAME")
public
class Game {
    private @Id
    @GeneratedValue
    Long id;

    // instance variables
    private String name;
    private Player[] players;
    private String deck; //TODO: implement deck class

    public Game() {}
    public Game(String name) {
        // TODO: intialize game
        this.name = name;
    }
}


