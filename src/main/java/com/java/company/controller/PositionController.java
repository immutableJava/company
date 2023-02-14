package com.java.company.controller;

import com.java.company.model.Position;
import com.java.company.service.PositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("position")
public class PositionController {
    private final PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }


    @PostMapping("/create")
    public ResponseEntity<Position> addPosition(@RequestBody Position position) {
        return ResponseEntity.ok(positionService.addPosition(position));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Position> getPositionById(@PathVariable Long id) {
        return ResponseEntity.ok(positionService.findPositionById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Position> updatePosition(@RequestBody Position position) {
        return ResponseEntity.ok(positionService.updatePosition(position));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Position> deletePosition(@PathVariable Long id) {
        positionService.deletePositionById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Collection<Position>> getAllPositions() {
        return ResponseEntity.ok(positionService.findAllPositions());
    }
}
