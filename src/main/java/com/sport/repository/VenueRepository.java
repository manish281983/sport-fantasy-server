package com.sport.repository;


import org.springframework.data.repository.CrudRepository;

import com.sport.modal.Venue;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface VenueRepository extends CrudRepository<Venue, Integer> {

}