package com.ap.ap.services;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ap.ap.models.Usuariop;
import com.ap.ap.repository.UsuariopRepo;

@Service
@Transactional

public class UsuariopService {

    private final UsuariopRepo usuarioRepo;

    @Autowired

    public UsuariopService(UsuariopRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public Usuariop addUsuario(Usuariop usuario) {
        return usuarioRepo.save(usuario);
    }

    public List<Usuariop> buscarUsuario() {
        return usuarioRepo.findAll();
    }

    public Usuariop editaUsuario(Usuariop usuario) {
        return usuarioRepo.save(usuario);
    }

    public void borrarUsuario(long id) {
        usuarioRepo.deleteById(id);
    }

    public Usuariop buscaUsuarioPorId(long id) {

        return usuarioRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found "));
    }

}
