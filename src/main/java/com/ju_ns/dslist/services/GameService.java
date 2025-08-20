package com.ju_ns.dslist.services;

import com.ju_ns.dslist.dto.GameDTO;
import com.ju_ns.dslist.dto.GameMinDTO;
import com.ju_ns.dslist.entities.Game;
import com.ju_ns.dslist.projections.GameMinProjection;
import com.ju_ns.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long lisId){
        List<GameMinProjection> result = gameRepository.searchByList(lisId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }


}
