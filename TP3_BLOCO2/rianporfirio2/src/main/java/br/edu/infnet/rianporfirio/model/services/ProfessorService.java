package br.edu.infnet.rianporfirio.model.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.rianporfirio.model.domain.Professor;
import br.edu.infnet.rianporfirio.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;
	
	public void incluir(Professor professor) {
		professorRepository.save(professor);
	}
	
	public void excluir(int registro) {
		//professores.remove(registro);
	}
	
	public Collection<Professor> obterLista(){
		return null;//professores.values();
	}
	
	public Professor obter(int registro){
		return null;//professores.get(registro);
	}
}