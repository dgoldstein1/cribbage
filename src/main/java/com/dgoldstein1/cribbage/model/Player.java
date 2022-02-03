package com.dgoldstein1.cribbage.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Player {
    @Id
    private String name;

    Player(String name) {
        this.name = name;
    }
}

