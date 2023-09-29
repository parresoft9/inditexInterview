package com.bezkoder.spring.jpa.h2.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "published")
  private boolean published;

  public LocalDateTime getStart(){
    return start;
  }

  public LocalDateTime getEnd(){
    return end;
  }

  @Column(name = "firstfecha")
  private LocalDateTime start;
  @Column(name = "secondfecha")
  private LocalDateTime end;

  @Column(name = "priority")
  private long priority;

  public long getPriority(){
    return priority;
  }

  public Tutorial() {

  }

  public Tutorial(String title, String description, boolean published, LocalDateTime start, LocalDateTime end, long priority) {
    this.title = title;
    this.description = description;
    this.published = published;
    this.start = start;
    this.end = end;
    this.priority = priority;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
  }

}
