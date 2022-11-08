package com.ap.ap.controller;

import java.lang.reflect.Array;
import java.util.List;

import org.hibernate.annotations.Any;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.ap.models.Experiencia;
import com.ap.ap.services.ExperienciaService;

@RestController
@RequestMapping("/api/experiencia")
public class ExperienciaController {

    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @GetMapping("/idExp/{idExp}")
    public ResponseEntity<Experiencia> obtenerExperiencia(@PathVariable("idExp") long idExp) throws Throwable {
        Experiencia experiencia = experienciaService.buscaExperienciaPorId(idExp);
        return new ResponseEntity<>(experiencia, HttpStatus.OK);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia() {
        List<Experiencia> experiencias = experienciaService.buscarExperiencias();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);

    }

    @PutMapping("/update")
    public ResponseEntity<Experiencia> editaExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia updateExperiencia = experienciaService.editaExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia addExperiencia = experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(addExperiencia, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") long id) {
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
