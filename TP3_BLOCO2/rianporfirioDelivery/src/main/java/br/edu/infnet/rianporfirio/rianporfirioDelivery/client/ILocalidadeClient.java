package br.edu.infnet.rianporfirio.rianporfirioDelivery.client;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Distrito;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Estado;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Municipio;

@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades", name = "ibgeClient")
public interface ILocalidadeClient {

	@GetMapping(value = "/estados/{uf}/municipios")
	Collection<Municipio> obterMunicipiosPorUF(@PathVariable Integer uf);

	@GetMapping(value = "/municipios/{municipio}/distritos")
	Collection<Distrito> obterDistritoPorMunicipio(@PathVariable Integer municipio);

	@GetMapping(value = "/estados/{uf}")
	Estado obterEstadoPorUF(@PathVariable Integer uf);
	
	@GetMapping(value ="/estados?orderBy=nome")
	Collection<Estado> obterListaDeEstados();
}

//Municipio
///estados/{UF}/municipios

//Distritoj
///municipios/{municipio}/distritos?

//Unidade Federadiva
///estados/{UF}