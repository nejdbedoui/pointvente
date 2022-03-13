package com.example.demo.controller;
import com.example.demo.entity.DetailsCommande;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.RepDetails;
import com.example.demo.services.Serdetails;

import java.util.List;

@RestController
@RequestMapping(path="api/details")
@AllArgsConstructor
public class Contdetails {

    RepDetails repDetails;
    private final Serdetails serdetails;

    @Autowired
    public Contdetails(Serdetails serdetails){
        this.serdetails=serdetails;
    }

    @GetMapping(value = "/Getdetails")
    @CrossOrigin(origins = "*")
    public List<DetailsCommande> Getdetails(){
        return serdetails.Getdetails();
    }

    @PostMapping(value = "/Adddetails")
    @CrossOrigin(origins = "*")
    public void Adddetails(DetailsCommande d){
        serdetails.Adddetails(d);
    }

    @PutMapping(value = "/Updatedetails")
    @CrossOrigin(origins = "*")
    public void Updatedetails(DetailsCommande d){
        serdetails.Updatedetails(d);
    }

    @DeleteMapping(value = "/deletedetails/{idd}")
    @CrossOrigin(origins = "*")
    public void deletedetails(@PathVariable("idd") String id) {
        serdetails.deletedetails(id);
    }
}
