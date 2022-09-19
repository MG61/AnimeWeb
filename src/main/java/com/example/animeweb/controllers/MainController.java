package com.example.animeweb.controllers;

import com.example.animeweb.Models.Anime;
import com.example.animeweb.repo.animeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired
    private animeRepo animeRepo;


    @GetMapping("/")
    public String Home(Model model)
    {
        Iterable<Anime> anime = animeRepo.findAll();
        model.addAttribute("anime",anime);
        return "Home";
    }

    @GetMapping("/Anime/{id}")
    public String EmployeeDetails(@PathVariable(value="id") long id, Model model)
    {
        Anime anime = animeRepo.findById(id);
        model.addAttribute("anime", anime);
        return "Home";
    }

}
