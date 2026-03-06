package com.example.service;

import com.example.model.Musician;
import com.example.repository.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicianService {

    @Autowired
    private MusicianRepository musicianRepository;

    public void addMusician(Musician musician) {
        musicianRepository.save(musician);
    }

    public List<Musician> listMusicians() {
        return musicianRepository.findAll();
    }

    public Optional<Musician> findMusicianById(int id) {
        return musicianRepository.findById(id);
    }

    public Musician updateMusician(int id, Musician updatedMusician) {
        Optional<Musician> existingMusician = musicianRepository.findById(id);
        if (existingMusician.isPresent()) {
            Musician musician = existingMusician.get();
            musician.setName(updatedMusician.getName());
            musician.setStrings(updatedMusician.getStrings());
            musician.setType(updatedMusician.getType());
            musician.setBand(updatedMusician.getBand());
            musicianRepository.save(musician);
            return musician;
        }
        return null;
    }

    public void deleteMusician(int id) {
        musicianRepository.deleteById(id);
    }
}