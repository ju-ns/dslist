package com.ju_ns.dslist.repositories;

import com.ju_ns.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
