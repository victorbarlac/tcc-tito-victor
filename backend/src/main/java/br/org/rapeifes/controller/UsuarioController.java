package br.org.rapeifes.controller;

import br.org.rapeifes.dto.UsuarioDTO;
import br.org.rapeifes.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService service;

    @PostMapping
    public UsuarioDTO salvar(@RequestBody UsuarioDTO usuarioDTO) {
        return service.salvar(usuarioDTO);
    }

    @PutMapping
    public UsuarioDTO alterar(@RequestBody UsuarioDTO usuarioDTO) {
        return service.alterar(usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
