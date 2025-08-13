package br.org.rapeifes.service;

import br.org.rapeifes.domain.ProfissionalSaude;
import br.org.rapeifes.repository.ProfissionalSaudeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfissionalSaudeService {

    private final ProfissionalSaudeRepository profissionalSaudeRepository;

    public List<ProfissionalSaude> listarTodas() {
        return profissionalSaudeRepository.findAll();
    }

}
