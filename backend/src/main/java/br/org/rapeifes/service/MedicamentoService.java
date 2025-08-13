package br.org.rapeifes.service;

import br.org.rapeifes.domain.Medicamento;
import br.org.rapeifes.repository.MedicamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicamentoService {

    private final MedicamentoRepository medicamentoRepository;

    public List<Medicamento> listarTodas() {
        return medicamentoRepository.findAll();
    }

}
