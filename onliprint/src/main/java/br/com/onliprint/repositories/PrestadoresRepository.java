package br.com.onliprint.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.onliprint.models.PrestadoresModel;

@Repository
public interface PrestadoresRepository extends JpaRepository<PrestadoresModel, Integer> {
	
	@Query(value = "SELECT * FROM tblprestador WHERE id LIKE %:id:%", nativeQuery = true)
	List<PrestadoresModel> findByIdContains(@Param("id") Integer id);
}
