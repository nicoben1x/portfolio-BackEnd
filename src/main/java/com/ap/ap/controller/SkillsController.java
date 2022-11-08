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

import com.ap.ap.models.Skills;
import com.ap.ap.services.SkillsService;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping("/idSkills/{idSkills}")
    public ResponseEntity<Skills> obtenerSkills(@PathVariable("idSkills") long idSkills) throws Throwable {
        Skills skills = skillsService.buscaSkillsPorId(idSkills);
        return new ResponseEntity<>(skills, HttpStatus.OK);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkills() {
        List<Skills> skillss = skillsService.buscarSkillss();
        return new ResponseEntity<>(skillss, HttpStatus.OK);

    }

    @PutMapping("/update")
    public ResponseEntity<Skills> editaSkills(@RequestBody Skills skills) {
        Skills updateSkills = skillsService.editaSkills(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skills> addSkills(@RequestBody Skills skills) {
        Skills addSkills = skillsService.addSkills(skills);
        return new ResponseEntity<>(addSkills, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") long id) {
        skillsService.borrarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
