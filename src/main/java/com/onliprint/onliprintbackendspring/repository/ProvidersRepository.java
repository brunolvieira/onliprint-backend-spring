package com.onliprint.onliprintbackendspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onliprint.onliprintbackendspring.model.ProvidersModel;

@Repository
public interface ProvidersRepository extends JpaRepository<ProvidersModel, Integer> {

}
