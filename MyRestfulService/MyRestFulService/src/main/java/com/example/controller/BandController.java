package com.example.controller;

import com.example.model.Band;
import com.example.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/band")
public class BandController {

    @Autowired
    private BandService bandService;

    @PostMapping("/add")
    public void addBand(@RequestBody Band band) {
        bandService.addBand(band);
    }

    @GetMapping("/list")
    public List<Band> listBands() {
        return bandService.listBands();
    }

    @GetMapping("/find/{id}")
    public Optional<Band> findBand(@PathVariable int id) {
        return bandService.findBandById(id);
    }

    @PutMapping("/update/{id}")
    public Band updateBand(@PathVariable int id, @RequestBody Band updatedBand) {
        return bandService.updateBand(id, updatedBand);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBand(@PathVariable int id) {
        bandService.deleteBand(id);
    }
}