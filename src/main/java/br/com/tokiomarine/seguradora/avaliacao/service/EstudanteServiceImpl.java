package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;

@Service
public class EstudanteServiceImpl implements EstudandeService {

	@Autowired
	EstudanteRepository repository;

	@Override
	public void cadastrarEstudante(@Valid Estudante estudante) {
		repository.save(estudante);
	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {
		
		repository.save(estudante);

	}

	@Override
	public List<Estudante> buscarEstudantes() {
		
		List<Estudante> estudantes = repository.findAll();
		
		if(estudantes.size() > 0) {
			return estudantes;
		}
		
		return null;
	}

	@Override
	public Estudante buscarEstudante(Long id) {
		
		Optional<Estudante> estudante = repository.findById(id);
		
		if(estudante.isPresent()) {
			
			return estudante.get();
		}
		
		return null;
	}
	
	@Override
	public void excluirEstudante(Long id) {
		
		Optional<Estudante> estudante = repository.findById(id);
		
		if(estudante.isPresent()) {
			
			repository.delete(estudante.get());
		}
		
	}

}
