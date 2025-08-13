package br.org.rapeifes.service;

import br.org.rapeifes.domain.Intervencao;
import br.org.rapeifes.dto.AtendimentoDTO;
import br.org.rapeifes.dto.IntervencaoDTO;
import br.org.rapeifes.mapper.IntervencaoMapper;
import br.org.rapeifes.repository.IntervencaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IntervencaoService {

    private final IntervencaoRepository repository;
    private final IntervencaoMapper intervencaoMapper;
    private final AtendimentoService atendimentoService;

    public List<IntervencaoDTO> listarTodos() {
        return intervencaoMapper.toDtoList(repository.findAll());
    }

    public IntervencaoDTO listarIntervencao(Integer id){
        IntervencaoDTO intervencaoDTO = intervencaoMapper.toDto(repository.findById(id).get());

        intervencaoDTO.setAlunoIds(atendimentoService.listarAtendimentoPorIntervencao(intervencaoDTO.getId()));

        return intervencaoDTO;
    }

    public IntervencaoDTO salvar(IntervencaoDTO dto) {
        Intervencao intervencao = repository.save(intervencaoMapper.toEntity(dto));

        IntervencaoDTO intervencaoDTO = intervencaoMapper.toDto(intervencao);

        List<AtendimentoDTO> atendimentoDTOS = new ArrayList<>();

        dto.getAlunoIds().forEach(
                aluno -> {
                    AtendimentoDTO atendimentoDTO = new AtendimentoDTO();
                    atendimentoDTO.setIntervencaoId(intervencaoDTO.getId());
                    atendimentoDTO.setAlunoId(aluno.getAlunoId());
                    atendimentoDTOS.add(this.atendimentoService.salvar(atendimentoDTO));
                }
        );

        intervencaoDTO.setAlunoIds(atendimentoDTOS);

        return intervencaoDTO;
    }

    public IntervencaoDTO alterar(IntervencaoDTO dto) {
        Intervencao intervencao = repository.save(intervencaoMapper.toEntity(dto));

        IntervencaoDTO intervencaoDTO = intervencaoMapper.toDto(intervencao);

        List<AtendimentoDTO> atendimentoDTOS = new ArrayList<>();

        dto.getAlunoIds().forEach(
                aluno -> {
                    AtendimentoDTO atendimentoDTO = new AtendimentoDTO();
                    atendimentoDTO.setIntervencaoId(intervencaoDTO.getId());
                    atendimentoDTO.setAlunoId(aluno.getAlunoId());
                    atendimentoDTOS.add(this.atendimentoService.alterar(atendimentoDTO));
                }
        );

        intervencaoDTO.setAlunoIds(atendimentoDTOS);

        return intervencaoDTO;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}
