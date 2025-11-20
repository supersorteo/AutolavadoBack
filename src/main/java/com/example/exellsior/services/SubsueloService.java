package com.example.exellsior.services;

import com.example.exellsior.entity.Subsuelo;
import com.example.exellsior.repository.SubsueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsueloService {

    @Autowired
    private SubsueloRepository subsueloRepository;

    public List<Subsuelo> getAllSubsuelos() {
        return subsueloRepository.findAll();
    }

    public Subsuelo saveSubsuelo(Subsuelo subsuelo) {
        return subsueloRepository.save(subsuelo);
    }

    public void deleteSubsuelo(String id) {
        subsueloRepository.deleteById(id);
    }
}
