package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController//It executes data and service in the form of JSON/XML.
public class MainController {
    List<String> list=new ArrayList<>();
    public MainController(){
        list.add("Vaishu");list.add("Harshitha");list.add("Chinmayi");
    }

//    @RequestMapping("/list")
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @GetMapping("/list")

    public List<String> list() {
        return list;
    }

    @GetMapping("/findone/{index}")

    public String findone(@PathVariable int index) {
        return list.get(index);
    }

    @PostMapping("/add")

    public void add(@RequestBody String name){
        //list.add("Netra");
        list.add(name);
    }

    @PutMapping("update/{index}")
    public void update(@PathVariable int index, @RequestBody String name){
        list.set(index,name);
    }

    @DeleteMapping("delete/{index}")
    public void delete(@PathVariable int index){
        list.remove(index);
    }

}
