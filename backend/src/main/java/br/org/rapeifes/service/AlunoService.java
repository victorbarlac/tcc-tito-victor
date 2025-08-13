package br.org.rapeifes.service;

import br.org.rapeifes.domain.Aluno;
import br.org.rapeifes.dto.AcompanhamentoMedicoDTO;
import br.org.rapeifes.dto.AlunoDTO;
import br.org.rapeifes.dto.ListaAlunoDTO;
import br.org.rapeifes.mapper.AlunoMapper;
import br.org.rapeifes.mapper.ListaAlunoMapper;
import br.org.rapeifes.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;
    private final AlunoMapper alunoMapper;
    private final ListaAlunoMapper listaAlunoMapper;
    private final AcompanhamentoMedicoService acompanhamentoMedicoService;

    public List<ListaAlunoDTO> listarTodos() {
        return listaAlunoMapper.toDtoList(repository.findAll());
    }

    public AlunoDTO listarAluno(Integer id){
        return alunoMapper.toDto(repository.findById(id).get());
    }

    public AlunoDTO salvar(AlunoDTO dto) {
        Aluno aluno = alunoMapper.toEntity(dto);

        AlunoDTO alunoDTO = alunoMapper.toDto(repository.save(aluno));

        AcompanhamentoMedicoDTO acompanhamentoMedicoDTO = new AcompanhamentoMedicoDTO();

        acompanhamentoMedicoDTO.setEstadoAcompanhamentoId(dto.getEstadoAcompanhamentoId());
        acompanhamentoMedicoDTO.setProfissionalId(dto.getProfissionalId());
        acompanhamentoMedicoDTO.setAlunoId(alunoDTO.getId());

        acompanhamentoMedicoService.salvar(acompanhamentoMedicoDTO);

        return alunoDTO;
    }

    public AlunoDTO alterar(AlunoDTO dto) {
        Aluno aluno = alunoMapper.toEntity(dto);

        AlunoDTO alunoDTO = alunoMapper.toDto(repository.save(aluno));

        AcompanhamentoMedicoDTO acompanhamentoMedicoDTO = new AcompanhamentoMedicoDTO();

        acompanhamentoMedicoDTO.setEstadoAcompanhamentoId(dto.getEstadoAcompanhamentoId());
        acompanhamentoMedicoDTO.setProfissionalId(dto.getProfissionalId());
        acompanhamentoMedicoDTO.setAlunoId(alunoDTO.getId());

        acompanhamentoMedicoService.alterar(acompanhamentoMedicoDTO);

        return alunoDTO;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}
