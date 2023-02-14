package com.java.company.service;

import com.java.company.model.Position;
import com.java.company.repository.PositionRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;

    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public Collection<Position> findAllPositions() {
        return positionRepository.findAll();
    }

    @Override
    public Position addPosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public Position updatePosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public void deletePositionById(Long id) {
        positionRepository.deleteById(id);
    }

    @Override
    public Position findPositionById(Long id) {
        return positionRepository.findById(id).orElseThrow();
    }
}
