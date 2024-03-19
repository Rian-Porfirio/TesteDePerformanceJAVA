package br.edu.infnet.rianporfirio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.rianporfirio.model.domain.Professor;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer> {

}
