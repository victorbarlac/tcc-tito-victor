package br.org.rapeifes.service;

import br.org.rapeifes.domain.CondicaoDiagnosticada;
import br.org.rapeifes.repository.CondicaoDiagnosticadaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CondicaoDiagnosticadaService {

    private final CondicaoDiagnosticadaRepository condicaoDiagnosticadaRepository;

    public List<CondicaoDiagnosticada> listarTodas() {
        return condicaoDiagnosticadaRepository.findAll();
    }

}
