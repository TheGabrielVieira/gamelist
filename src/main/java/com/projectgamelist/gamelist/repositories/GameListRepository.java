package com.projectgamelist.gamelist.repositories;

import com.projectgamelist.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
