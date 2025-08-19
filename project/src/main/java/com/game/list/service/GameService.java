package com.game.list.service;


import com.game.list.model.Game;
import com.game.list.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<Game> getAll(){
        return repository.findAll();
    }
}
