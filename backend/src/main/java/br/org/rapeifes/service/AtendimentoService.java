package br.org.rapeifes.service;

import br.org.rapeifes.domain.Atendimento;
import br.org.rapeifes.dto.AtendimentoDTO;
import br.org.rapeifes.mapper.AtendimentoMapper;
import br.org.rapeifes.repository.AtendimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AtendimentoService {

    private final AtendimentoRepository repository;
    private final AtendimentoMapper atendimentoMapper;

    public List<AtendimentoDTO> listarTodos() {
        return atendimentoMapper.toDtoList(repository.findAll());
    }

    public List<AtendimentoDTO> listarAtendimentoPorIntervencao(Integer intervencaoId){
        return atendimentoMapper.toDtoList(repository.findByIntervencaoId(intervencaoId));
    }

    public AtendimentoDTO salvar(AtendimentoDTO dto) {
        Atendimento atendimento = atendimentoMapper.toEntity(dto);
        return atendimentoMapper.toDto(repository.save(atendimento));
    }

    public AtendimentoDTO alterar(AtendimentoDTO dto) {
        Atendimento atendimento = atendimentoMapper.toEntity(dto);
        return atendimentoMapper.toDto(repository.save(atendimento));
    }

//
//    public void deletar(Integer id) {
//        repository.deleteById(id);
//    }

}
