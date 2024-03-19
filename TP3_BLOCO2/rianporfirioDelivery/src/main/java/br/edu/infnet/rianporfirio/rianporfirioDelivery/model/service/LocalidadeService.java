package br.edu.infnet.rianporfirio.rianporfirioDelivery.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.client.IEnderecoClient;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.client.ILocalidadeClient;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Distrito;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Endereco;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Estado;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Municipio;

@Service
public class LocalidadeService {

	@Autowired
	private IEnderecoClient enderecoClient;

	@Autowired
	private ILocalidadeClient localidadeClient;

	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterEnderecoPorCep(cep);
	}

	public Estado obterEstadoPorUF(Integer uf) {
		return localidadeClient.obterEstadoPorUF(uf);
	}

	public Collection<Municipio> obterMunicipiosPorUF(Integer uf) {
		return localidadeClient.obterMunicipiosPorUF(uf);
	}

	public Collection<Distrito> obterDistritoPorMunicipio(Integer municipio) {
		return localidadeClient.obterDistritoPorMunicipio(municipio);
	}
	
	public Collection<Estado> obterListaDeEstados(){
		return localidadeClient.obterListaDeEstados();
	}
}
