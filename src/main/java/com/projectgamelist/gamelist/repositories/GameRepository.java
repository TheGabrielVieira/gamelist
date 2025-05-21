package com.projectgamelist.gamelist.repositories;

import com.projectgamelist.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
