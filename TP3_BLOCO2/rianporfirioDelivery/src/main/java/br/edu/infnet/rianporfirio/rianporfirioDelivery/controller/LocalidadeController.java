package br.edu.infnet.rianporfirio.rianporfirioDelivery.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Distrito;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Endereco;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Estado;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Municipio;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.service.LocalidadeService;

@RestController
@RequestMapping("/api/localidade")
public class LocalidadeController {

	@Autowired
	private LocalidadeService localidadeService;

	@GetMapping(value = "/endereco/{cep}")
	public Endereco obterPorCep(@PathVariable String cep) {
		return localidadeService.obterPorCep(cep);
	}

	@GetMapping(value = "/estado/{uf}")
	public Estado obterEstadoPorUF(@PathVariable Integer uf) {
		return localidadeService.obterEstadoPorUF(uf);
	}

	@GetMapping(value = "/municipio/{uf}/listar")
	public Collection<Municipio> obterMunicipiosPorUF(@PathVariable Integer uf) {
		return localidadeService.obterMunicipiosPorUF(uf);
	}

	@GetMapping(value = "/municipio/{municipio}/distrito/listar")
	public Collection<Distrito> obterDistritoPorMunicipio(@PathVariable Integer municipio) {
		return localidadeService.obterDistritoPorMunicipio(municipio);
	}

	@GetMapping(value = "/estado/listar")
	public Collection<Estado> obterListaDeEstados() {
		return localidadeService.obterListaDeEstados();
	}
}
