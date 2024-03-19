package br.edu.infnet.rianporfirio.rianporfirioDelivery.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Entregador;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Funcionario;

@Service
public class RestauranteService {

	private Map<String, Entregador> entregadores = new HashMap<String, Entregador>();
	private Map<String, Funcionario> funcionarios = new HashMap<String, Funcionario>();

	public void incluirEntregador(Entregador entregador) {
		entregadores.put(entregador.getNome(), entregador);
	}

	public void excluirEntregador(String nomeEntregador) {
		entregadores.remove(nomeEntregador);
	}

	public Collection<Entregador> obterListaEntregadores() {
		return entregadores.values();
	}

	public void incluirFuncionario(Funcionario funcionario) {
		funcionarios.put(funcionario.getNome(), funcionario);
	}

	public void excluirFuncionario(String nomeFuncionario) {
		funcionarios.remove(nomeFuncionario);
	}

	public Funcionario obterFuncionario(String nomeFuncionario) {
		return funcionarios.get(nomeFuncionario);
	}

	public Collection<Funcionario> obterListaFuncionarios() {
		return funcionarios.values();
	}

	public Entregador obterEntregador(String nomeEntregador) {
		return entregadores.get(nomeEntregador);
	}

}
