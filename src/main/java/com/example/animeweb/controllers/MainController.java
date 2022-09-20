package com.example.animeweb.controllers;

import com.example.animeweb.Models.Anime;
import com.example.animeweb.repo.animeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private animeRepo animeRepo;


    @GetMapping("/")
    public String Home(Model model)
    {
        Iterable<Anime> anime = animeRepo.findAll();
        model.addAttribute("anime",anime);
        return "home";
    }

    @GetMapping("/Anime")
    public String Anime(Model model)
    {
        Iterable<Anime> anime = animeRepo.findAll();
        model.addAttribute("anime",anime);
        return "anime";
    }

    @GetMapping("/Anime/{id}")
    public String AnimeAdd(@PathVariable(value="id") long id, Model model)
    {
        Anime anime = animeRepo.findById(id);
        model.addAttribute("anime", anime);
        return "animeShow";
    }

    @GetMapping("/Anime/Search")
    public String AnimeSearch(Model model) {return "animeSearch";}

    @PostMapping("/Anime/Search")
    public String AnimeResult (@RequestParam String name, Model model)
    {
        List<Anime> search = animeRepo.findByNameContains(name);
        model.addAttribute("search", search);
        return "animeSearch";
    }

    @GetMapping("/AnimeAdd")
    public String AnimeAdd(Anime anime, Model model) {return "animeAdd";}

    @PostMapping("/Anime/add")
    public String AddAnime(@ModelAttribute("anime") @Valid Anime anime, BindingResult bindingResult
    ){
        if(bindingResult.hasErrors()) {
            return "anime";
        }
        animeRepo.save(anime);
        return "redirect:/";
    }
}
