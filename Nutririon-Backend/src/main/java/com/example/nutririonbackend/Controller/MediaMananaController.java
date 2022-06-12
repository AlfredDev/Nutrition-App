package com.example.nutririonbackend.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nutririonbackend.InterfaceService.MediaMananaInterfaz;
import com.example.nutririonbackend.Model.MediaManana;

@RestController
@RequestMapping("/MediaManana")
@CrossOrigin

public class AlimentoController {
    @Autowired
    private MediaMananaInterfaz mediaManana_service;

    @PostMapping("/addMediaManana")
    public String addMediaManana(@RequestBody  MediaManana mediaManana){
        mediaManana_service.saveMediaManana(mediaManana);
        return "MediaManana insertados";
    }

    @GetMapping("/getAll")
    public List<MediaManana> getAllMediaManana(){
        return  mediaManana_service.getAllMediaManana();
    }

    @GetMapping("/findById/{id}")
    public Optional<MediaManana> findById(@PathVariable int id){
        return mediaManana_service.findById(id);
    }

    @GetMapping("/deletedByid/{id}")
    public void DeletedByid(@PathVariable int id){
        mediaManana_service.deletedByid(id);
    }
}