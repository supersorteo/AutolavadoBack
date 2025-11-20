package com.example.exellsior.controller;

import com.example.exellsior.entity.Space;
import com.example.exellsior.services.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/spaces")
public class SpaceController {

    @Autowired
    private SpaceService spaceService;

    @GetMapping
    public List<Space> getAll() {
        return spaceService.getAllSpaces();
    }

    @PostMapping
    public Space create(@RequestBody Space space) {
        return spaceService.saveSpace(space);
    }

    @DeleteMapping("/{key}")
    public ResponseEntity<Void> delete(@PathVariable String key) {
        spaceService.deleteSpace(key);
        return ResponseEntity.noContent().build();
    }

}
