package com.sport.repository;


import org.springframework.data.repository.CrudRepository;

import com.sport.modal.Team;

public interface TeamRepository extends CrudRepository<Team, Integer> {

}