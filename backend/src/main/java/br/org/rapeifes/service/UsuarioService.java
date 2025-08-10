package br.org.rapeifes.service;

import br.org.rapeifes.domain.Usuario;
import br.org.rapeifes.dto.UsuarioDTO;
import br.org.rapeifes.mapper.UsuarioMapper;
import br.org.rapeifes.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    private final EncryptService encryptService = new EncryptService();

    public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {
        Usuario usuario = mapper.toEntity(usuarioDTO);
        usuario.setHashSenha(encryptService.encrypt(usuarioDTO.getHashSenha()));

        return mapper.toDto(repository.save(usuario));
    }

    public UsuarioDTO alterar(UsuarioDTO usuarioDTO) {
        Usuario usuario = repository.findById(usuarioDTO.getId()).get();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setHashSenha(encryptService.encrypt(usuarioDTO.getHashSenha()));

        return mapper.toDto(repository.save(usuario));
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }


}
