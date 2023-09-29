package com.bezkoder.spring.jpa.h2.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bezkoder.spring.jpa.h2.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContainingIgnoreCase(String title);

  @Query(value = "SELECT e.* FROM tutorials e WHERE firstfecha <=:date AND secondfecha>=:date ORDER BY priority DESC", nativeQuery = true)
  List<Tutorial> findByDateBetweenStartAndEnd(LocalDateTime date);

}
