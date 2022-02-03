package com.dgoldstein1.cribbage;

import com.dgoldstein1.cribbage.model.Game;
import com.dgoldstein1.cribbage.controller.GameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(GameRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Game("my-first-game")));
        };
    }
}