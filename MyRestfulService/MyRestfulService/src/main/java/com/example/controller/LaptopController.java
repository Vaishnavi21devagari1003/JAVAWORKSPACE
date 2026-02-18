package com.example.controller;


import com.example.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

        List<Laptop> laptopList = new ArrayList<>();

        public LaptopController() {
            laptopList.add(new Laptop(1, "Dell", "Inspiron", 55000));
            laptopList.add(new Laptop(2, "HP", "Pavilion", 60000));
            laptopList.add(new Laptop(3, "Lenovo", "ThinkPad", 75000));
        }

        // ✅ Get all laptops
        @GetMapping
        public List<Laptop> getAll() {
            return laptopList;
        }

        // ✅ Get one laptop by index
        @GetMapping("/{index}")
        public Laptop getOne(@PathVariable int index) {
            return laptopList.get(index);
        }

        // ✅ Add laptop
        @PostMapping
        public void add(@RequestBody Laptop laptop) {
            laptopList.add(laptop);
        }

        // ✅ Update laptop
        @PutMapping("/{index}")
        public void update(@PathVariable int index,
                           @RequestBody Laptop laptop) {
            laptopList.set(index, laptop);
        }

        // ✅ Delete laptop
        @DeleteMapping("/{index}")
        public void delete(@PathVariable int index) {
            laptopList.remove(index);
        }
    }

