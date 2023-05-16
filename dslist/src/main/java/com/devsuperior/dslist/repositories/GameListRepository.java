package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    // Foi informado o tipo Long pois foi o tipo da variável ID do objeto GameList
    

}
