package com.apiinfra.infra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiinfra.infra.entity.Relatorio;
import com.apiinfra.infra.repository.RelatorioRepository;

@Service
public class RelatorioService {
	
	private RelatorioRepository relatorioRepository;
	
	@Autowired
	public RelatorioService(RelatorioRepository relatorioRepository) {
		this.relatorioRepository = relatorioRepository;
	}

	public String createRelatorio(Relatorio relatorio) {
		Relatorio relatorioCriado = relatorioRepository.save(relatorio);
		return "Relatório criado com sucesso " + relatorioCriado.getInspetor();
				

	}
}
