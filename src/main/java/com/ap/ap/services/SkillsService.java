package com.ap.ap.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ap.ap.models.Skills;
import com.ap.ap.repository.SkillsRepo;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;

    @Autowired

    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkills(Skills skills) {
        return skillsRepo.save(skills);
    }

    public List<Skills> buscarSkillss() {
        return skillsRepo.findAll();
    }

    public Skills editaSkills(Skills skills) {
        return skillsRepo.save(skills);
    }

    public void borrarSkills(long id) {
        skillsRepo.deleteById(id);
    }

    public Skills buscaSkillsPorId(long id) {

        return skillsRepo.findById(id).orElseThrow(() -> new RuntimeException("Skill not found "));
    }

}
