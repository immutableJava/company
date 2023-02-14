package com.java.company.service;

import com.java.company.model.Position;

import java.util.Collection;

public interface PositionService {
    Collection<Position> findAllPositions();

    Position addPosition(Position position);

    Position updatePosition(Position position);

    void deletePositionById(Long id);

    Position findPositionById(Long id);
}
