package com.example.controller;


import com.example.model.Laptop;
import com.example.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    LaptopRepository lr;
    @PostMapping("/add")
    public void add(@RequestBody Laptop lp) {
        lr.save(lp);
    }

    @GetMapping("/list")
    public List<Laptop> list() {
        return lr.findAll();
    }

    @GetMapping("/findOne/{index}")
    public Optional<Laptop> findOne(@PathVariable int index) {
        return lr.findById(index);
    }

    @PutMapping("/update/{index}")
    public Laptop update(@PathVariable int index, @RequestBody Laptop newLaptop) {
        Optional<Laptop> oldLaptop = lr.findById(index);
        oldLaptop.get().setName(newLaptop.getName());
        oldLaptop.get().setBrand(newLaptop.getBrand());
        oldLaptop.get().setPrice(newLaptop.getPrice());
        oldLaptop.get().setRAM(newLaptop.getRAM());
        lr.save(oldLaptop.get());
        return oldLaptop.get();
    }

    @DeleteMapping("/delete/{index}")
    public void delete(@PathVariable int index) {
        lr.deleteById(index);
    }

    @GetMapping("/findByBrand/{brand}")
    public List<Laptop> findByBrandName(@PathVariable String brand) {
        return lr.findByBrand(brand);
    }
}