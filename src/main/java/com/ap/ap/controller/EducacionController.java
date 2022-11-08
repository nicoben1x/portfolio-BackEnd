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

import com.ap.ap.models.Educacion;
import com.ap.ap.services.EducacionService;

@RestController
@RequestMapping("/educacion")
public class EducacionController {

    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @GetMapping("/idEdu/{idEdu}")
    public ResponseEntity<Educacion> obtenerEducacion(@PathVariable("idEdu") long idEdu) throws Throwable {
        Educacion educacion = educacionService.buscaEducacionPorId(idEdu);
        return new ResponseEntity<>(educacion, HttpStatus.OK);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obtenerEducacion() {
        List<Educacion> educacions = educacionService.buscarEducacions();
        return new ResponseEntity<>(educacions, HttpStatus.OK);

    }

    @PutMapping("/update")
    public ResponseEntity<Educacion> editaEducacion(@RequestBody Educacion educacion) {
        Educacion updateEducacion = educacionService.editaEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion) {
        Educacion addEducacion = educacionService.addEducacion(educacion);
        return new ResponseEntity<>(addEducacion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") long id) {
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
