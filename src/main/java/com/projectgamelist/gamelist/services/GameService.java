package com.projectgamelist.gamelist.services;

import com.projectgamelist.gamelist.dto.GameDTO;
import com.projectgamelist.gamelist.dto.GameMinDTO;
import com.projectgamelist.gamelist.entities.Game;
import com.projectgamelist.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        // necessario um tratamento de excessoes de um Id que não existe
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
