package com.ap.ap.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ap.ap.models.Experiencia;
import com.ap.ap.repository.ExperienciaRepo;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;

    @Autowired

    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> buscarExperiencias() {
        return experienciaRepo.findAll();
    }

    public Experiencia editaExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public void borrarExperiencia(long id) {
        experienciaRepo.deleteById(id);
    }

    public Experiencia buscaExperienciaPorId(long id) {

        return experienciaRepo.findById(id).orElseThrow(() -> new RuntimeException("Experience not found "));
    }

}
