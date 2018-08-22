package com.sport.repository;

import org.springframework.data.repository.CrudRepository;

import com.sport.modal.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}