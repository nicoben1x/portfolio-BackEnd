package com.ap.ap.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.ap.models.Usuariop;
import com.ap.ap.services.UsuariopService;

@RestController
@RequestMapping("api/usuario")
public class UsuariopController {

    private final UsuariopService usuarioService;

    public UsuariopController(UsuariopService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuariop> obtenerUsuario(@PathVariable("id") long id) throws Throwable {
        Usuariop usuario = usuarioService.buscaUsuarioPorId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);

    }

    @PutMapping("/update")
    public ResponseEntity<Usuariop> editaUsuario(@RequestBody Usuariop usuario) {
        Usuariop updateUsuario = usuarioService.editaUsuario(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }

    @PutMapping("/add")
    public ResponseEntity<Usuariop> addUsuario(@RequestBody Usuariop usuario) {
        Usuariop addUsuario = usuarioService.addUsuario(usuario);
        return new ResponseEntity<>(addUsuario, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") long id) {
        usuarioService.borrarUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

// sfsdfsdfsdf