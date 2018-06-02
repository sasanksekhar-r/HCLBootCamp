package com.krishna.seatbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.seatbooking.dto.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
