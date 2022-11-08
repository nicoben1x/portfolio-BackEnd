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

import com.ap.ap.models.Proyectos;
import com.ap.ap.services.ProyectosService;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectosController {

    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }

    @GetMapping("/idProyect/{idProyect}")
    public ResponseEntity<Proyectos> obtenerProyectos(@PathVariable("idProyect") long idProyect) throws Throwable {
        Proyectos proyectos = proyectosService.buscaProyectosPorId(idProyect);
        return new ResponseEntity<>(proyectos, HttpStatus.OK);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> obtenerProyectos() {
        List<Proyectos> proyectoss = proyectosService.buscarProyectoss();
        return new ResponseEntity<>(proyectoss, HttpStatus.OK);

    }

    @PutMapping("/update")
    public ResponseEntity<Proyectos> editaProyectos(@RequestBody Proyectos proyectos) {
        Proyectos updateProyectos = proyectosService.editaProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Proyectos> addProyectos(@RequestBody Proyectos proyectos) {
        Proyectos addProyectos = proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(addProyectos, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarProyectos(@PathVariable("id") long id) {
        proyectosService.borrarProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
