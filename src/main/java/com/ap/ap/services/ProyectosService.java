package com.ap.ap.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ap.ap.models.Proyectos;
import com.ap.ap.repository.ProyectosRepo;

@Service
@Transactional
public class ProyectosService {
    private final ProyectosRepo proyectosRepo;

    @Autowired

    public ProyectosService(ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }

    public Proyectos addProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public List<Proyectos> buscarProyectoss() {
        return proyectosRepo.findAll();
    }

    public Proyectos editaProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }

    public void borrarProyectos(long id) {
        proyectosRepo.deleteById(id);
    }

    public Proyectos buscaProyectosPorId(long id) {

        return proyectosRepo.findById(id).orElseThrow(() -> new RuntimeException("Proyect not found "));
    }

}
