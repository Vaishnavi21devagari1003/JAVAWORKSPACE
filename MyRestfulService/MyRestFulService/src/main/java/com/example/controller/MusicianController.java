package com.example.controller;

import com.example.model.Musician;
import com.example.service.MusicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musician")
public class MusicianController {

    @Autowired
    private MusicianService musicianService;

    @PostMapping("/add")
    public void addMusician(@RequestBody Musician musician) {
        musicianService.addMusician(musician);
    }

    @GetMapping("/list")
    public List<Musician> listMusicians() {
        return musicianService.listMusicians();
    }

    @GetMapping("/find/{id}")
    public Optional<Musician> findMusician(@PathVariable int id) {
        return musicianService.findMusicianById(id);
    }

    @PutMapping("/update/{id}")
    public Musician updateMusician(@PathVariable int id, @RequestBody Musician updatedMusician) {
        return musicianService.updateMusician(id, updatedMusician);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMusician(@PathVariable int id) {
        musicianService.deleteMusician(id);
    }
}