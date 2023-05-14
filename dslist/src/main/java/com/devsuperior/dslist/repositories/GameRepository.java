package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    // Foi informado o tipo Long pois foi o tipo da variável ID do objeto Game
    

}
