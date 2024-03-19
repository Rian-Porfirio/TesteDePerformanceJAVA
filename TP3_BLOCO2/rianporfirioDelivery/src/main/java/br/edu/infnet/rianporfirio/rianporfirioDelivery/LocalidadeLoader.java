package br.edu.infnet.rianporfirio.rianporfirioDelivery;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Estado;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Municipio;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.service.LocalidadeService;

@Component
public class LocalidadeLoader implements ApplicationRunner {

	@Autowired
	private LocalidadeService localidadeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Estado estado1 = localidadeService.obterEstadoPorUF(33);
		System.out.println("O estado|  " + estado1);
//
		Collection<Estado> estados = localidadeService.obterListaDeEstados();
		for (Estado estado : estados) {
			System.out.println("\n" + estado);

			Collection<Municipio> municipios = localidadeService.obterMunicipiosPorUF(estado.getId());

			for (Municipio municipio : municipios) {
				System.out.println(municipio);
			}
		}
	}
}
