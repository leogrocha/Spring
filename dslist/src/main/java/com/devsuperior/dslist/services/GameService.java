package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service // registrar o GameService como sendo um componente do sistema.
public class GameService {
    
    // Injetando uma instância do GameRepository dentro do GameService
    @Autowired
    private GameRepository gameRepository;

    // garantir operação com o banco de dados
    // readonly - assegurando que não terá escrita deixando a consulta mais rápida
    @Transactional(readOnly = true) 
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true) 
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
}
