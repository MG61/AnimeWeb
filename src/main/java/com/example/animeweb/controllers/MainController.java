package com.example.animeweb.controllers;

import com.example.animeweb.Models.*;
import com.example.animeweb.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private animeRepo animeRepo;

    @Autowired
    public TypeRepository typeRepository;

    @Autowired
    public QuantityRepository quantityRepository;

    @Autowired
    public StatusRepository statusRepository;

    @Autowired
    public OzvuchRepository ozvuchRepository;

    @Autowired
    public StudioRepository studioRepository;

    @Autowired
    public MPAARepository mpaaRepository;

    @Autowired
    public AgeRepository ageRepository;

    @Autowired
    public SourceRepository sourceRepository;

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
    public String AnimeAdd(Anime anime, Model model)
    {
        Iterable<Type> type = typeRepository.findAll();
        model.addAttribute("type",type);
        Iterable<Quantity> quantity = quantityRepository.findAll();
        model.addAttribute("quantity",quantity);
        Iterable<Status> status = statusRepository.findAll();
        model.addAttribute("status",status);
        Iterable<Ozvuch> ozvuch = ozvuchRepository.findAll();
        model.addAttribute("ozvuch",ozvuch);
        Iterable<Studio> studio = studioRepository.findAll();
        model.addAttribute("studio",studio);
        Iterable<MPAA> mpaa = mpaaRepository.findAll();
        model.addAttribute("mpaa",mpaa);
        Iterable<Age> age = ageRepository.findAll();
        model.addAttribute("age",age);
        Iterable<Source> source = sourceRepository.findAll();
        model.addAttribute("source",source);
        return "animeAdd";
    }

    @PostMapping("/Anime/add")
    public String AddAnime(@ModelAttribute("anime") @Valid Anime anime,
                           @RequestParam Long col,
                           @RequestParam Long street,
                           @RequestParam Long stat,
                           @RequestParam Long ozv,
                           @RequestParam Long stud,
                           @RequestParam Long mpaa,
                           @RequestParam Long ag,
                           @RequestParam Long sour,
                           BindingResult bindingResult
    ){
        if(bindingResult.hasErrors()) {
            return "anime";
        }
        Type type1 = typeRepository.findById(street).orElseThrow();
        anime.setType(type1);
        Quantity quantity = quantityRepository.findById(col).orElseThrow();
        anime.setQuantity(quantity);
        Status status = statusRepository.findById(stat).orElseThrow();
        anime.setStatus(status);
        Ozvuch ozvuch = ozvuchRepository.findById(ozv).orElseThrow();
        anime.setOzvuch(ozvuch);
        Studio studio = studioRepository.findById(stud).orElseThrow();
        anime.setStudio(studio);
        MPAA mpaa1 = mpaaRepository.findById(mpaa).orElseThrow();
        anime.setMpaa(mpaa1);
        Age age = ageRepository.findById(ag).orElseThrow();
        anime.setAge(age);
        Source source = sourceRepository.findById(sour).orElseThrow();
        anime.setSource(source);
        animeRepo.save(anime);
        return "redirect:/";
    }
}
