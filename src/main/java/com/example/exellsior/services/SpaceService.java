package com.example.exellsior.services;

import com.example.exellsior.entity.Space;
import com.example.exellsior.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceService {

    @Autowired
    private SpaceRepository spaceRepository;

    public List<Space> getAllSpaces() {
        return spaceRepository.findAll();
    }

    public Space saveSpace(Space space) {
        return spaceRepository.save(space);
    }

    public void deleteSpace(String key) {
        spaceRepository.deleteById(key);
    }
}
