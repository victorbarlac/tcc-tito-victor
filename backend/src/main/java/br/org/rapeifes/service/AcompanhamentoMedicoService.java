package br.org.rapeifes.service;

import br.org.rapeifes.domain.AcompanhamentoMedico;
import br.org.rapeifes.dto.AcompanhamentoMedicoDTO;
import br.org.rapeifes.mapper.AcompanhamentoMedicoMapper;
import br.org.rapeifes.repository.AcompanhamentoMedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AcompanhamentoMedicoService {

    private final AcompanhamentoMedicoRepository repository;
    private final AcompanhamentoMedicoMapper acompanhamentoMedicoMapper;

    public List<AcompanhamentoMedicoDTO> listarTodos() {
        return acompanhamentoMedicoMapper.toDtoList(repository.findAll());
    }

    public AcompanhamentoMedicoDTO salvar(AcompanhamentoMedicoDTO dto) {
        AcompanhamentoMedico acompanhamentoMedico = acompanhamentoMedicoMapper.toEntity(dto);
        return acompanhamentoMedicoMapper.toDto(repository.save(acompanhamentoMedico));
    }

    public AcompanhamentoMedicoDTO alterar(AcompanhamentoMedicoDTO dto) {
        AcompanhamentoMedico acompanhamentoMedico = acompanhamentoMedicoMapper.toEntity(dto);
        return acompanhamentoMedicoMapper.toDto(repository.save(acompanhamentoMedico));
    }

//
//    public void deletar(Integer id) {
//        repository.deleteById(id);
//    }
}
