package com.ap.ap.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ap.ap.models.Educacion;
import com.ap.ap.repository.EducacionRepo;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired

    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> buscarEducacions() {
        return educacionRepo.findAll();
    }

    public Educacion editaEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void borrarEducacion(long id) {
        educacionRepo.deleteById(id);
    }

    public Educacion buscaEducacionPorId(long id) {

        return educacionRepo.findById(id).orElseThrow(() -> new RuntimeException("Education not found "));
    }

}
