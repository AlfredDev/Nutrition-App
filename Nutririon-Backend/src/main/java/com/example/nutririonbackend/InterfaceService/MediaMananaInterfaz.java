package com.example.nutririonbackend.InterfaceService;

import java.util.List;
import java.util.Optional;
import com.example.nutririonbackend.Model.MediaManana;

public interface MediaMananaInterfaz {
    public List<MediaManana> getAllMediaManana();
    public MediaManana saveMediaManana(MediaManana mediaManana);
    public Optional<MediaManana> findById(int id);
    public void deletedByid(int id);
}
