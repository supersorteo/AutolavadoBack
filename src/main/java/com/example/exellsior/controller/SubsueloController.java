package com.example.exellsior.controller;

import com.example.exellsior.entity.Subsuelo;
import com.example.exellsior.services.SubsueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subsuelos")
public class SubsueloController {
    @Autowired
    private SubsueloService subsueloService;

    @GetMapping
    public List<Subsuelo> getAll() {
        return subsueloService.getAllSubsuelos();
    }

    @PostMapping
    public Subsuelo create(@RequestBody Subsuelo subsuelo) {
        return subsueloService.saveSubsuelo(subsuelo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        subsueloService.deleteSubsuelo(id);
        return ResponseEntity.noContent().build();
    }
}
