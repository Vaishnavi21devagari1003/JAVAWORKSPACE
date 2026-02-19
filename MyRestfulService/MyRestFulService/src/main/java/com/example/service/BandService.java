package com.example.service;

import com.example.model.Band;
import com.example.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BandService {

    @Autowired
    private BandRepository bandRepository;

    public void addBand(Band band) {
        bandRepository.save(band);
    }

    public List<Band> listBands() {
        return bandRepository.findAll();
    }

    public Optional<Band> findBandById(int id) {
        return bandRepository.findById(id);
    }

    public Band updateBand(int id, Band updatedBand) {
        Optional<Band> existingBand = bandRepository.findById(id);
        if (existingBand.isPresent()) {
            Band band = existingBand.get();
            band.setName(updatedBand.getName());
            bandRepository.save(band);
            return band;
        }
        return null;
    }

    public void deleteBand(int id) {
        bandRepository.deleteById(id);
    }
}