package br.org.rapeifes.service;

import br.org.rapeifes.model.OrientacaoSexual;
import br.org.rapeifes.repository.OrientacaoSexualRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrientacaoSexualService {

    private final OrientacaoSexualRepository orientacaoSexualRepository;

    public List<OrientacaoSexual> listarTodas() {
        return orientacaoSexualRepository.findAll();
    }
}
