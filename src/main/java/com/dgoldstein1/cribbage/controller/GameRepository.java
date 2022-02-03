package com.dgoldstein1.cribbage.controller;

import com.dgoldstein1.cribbage.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
