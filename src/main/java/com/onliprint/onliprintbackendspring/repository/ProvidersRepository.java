package com.onliprint.onliprintbackendspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onliprint.onliprintbackendspring.model.ProvidersModel;

@Repository
public interface ProvidersRepository extends JpaRepository<ProvidersModel, Integer> {

	@Query(value = "SELECT * FROM providers WHERE id_provider LIKE %:providerId%", nativeQuery = true)
	ProvidersModel findOneById(@Param("providerId") int providerId);
}
