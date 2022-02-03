package com.dgoldstein1.cribbage.controller;

import java.util.List;

import com.dgoldstein1.cribbage.model.Game;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class GameNotFoundException extends RuntimeException {

    GameNotFoundException(Long id) {
        super("Could not find game " + id);
    }
}

@RestController
class GameController {

    private final GameRepository repository;

    GameController(GameRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/game")
    List<Game> all() {
        return repository.findAll();
    }

    // Single item
    @GetMapping("/game/{id}")
    Game one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new GameNotFoundException(id));
    }

    @PostMapping("/game/new")
    Game newEmployee(@RequestBody Game newGame) {
        return repository.save(newGame);
    }

    @DeleteMapping("/game/{id}")
    void deleteGame(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
