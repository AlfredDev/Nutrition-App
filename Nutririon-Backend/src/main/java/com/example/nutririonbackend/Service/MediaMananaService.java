package com.example.nutririonbackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nutririonbackend.InterfaceService.MediaMananaInterfaz;
import com.example.nutririonbackend.Model.MediaManana;
import com.example.nutririonbackend.Repository.MediaMananaRepository;

@Service
public class MediaMananaService implements MediaMananaInterfaz{

    @Autowired
    private MediaMananaRepository mediaManana;

    @Override
    public List<MediaManana> getAllMediaManana() {
        return mediaManana.findAll();
    }

    @Override
    public MediaManana saveMediaManana(MediaManana mediaMa) {
        return mediaManana.save(mediaMa);
    }

    @Override
    public Optional<MediaManana> findById(int id) {
        return mediaManana.findById(id);
    }

    @Override
    public void deletedByid(int id) {
        mediaManana.deleteById(id);
        
    }
    
}