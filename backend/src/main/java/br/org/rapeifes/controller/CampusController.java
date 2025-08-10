package br.org.rapeifes.controller;

import br.org.rapeifes.dto.CampusDTO;
import br.org.rapeifes.service.CampusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/campus")
@RequiredArgsConstructor
public class CampusController {
    private final CampusService service;

    @GetMapping
    public List<CampusDTO> listar() {
        return service.listarTodos();
    }
}
