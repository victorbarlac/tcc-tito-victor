package br.org.rapeifes.service;

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

    public List<ListaAlunoDTO> listarTodos() {
        return listaAlunoMapper.toDtoList(repository.findAll());
    }

    public AlunoDTO listarAluno(Long id){
        return alunoMapper.toDto(repository.findById(id).get());
    }

    public AlunoDTO salvar(AlunoDTO dto) {
        var aluno = alunoMapper.toEntity(dto);
        return alunoMapper.toDto(repository.save(aluno));
    }

    public AlunoDTO alterar(AlunoDTO dto) {
        var aluno = alunoMapper.toEntity(dto);
        return alunoMapper.toDto(repository.save(aluno));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
