package com.bezkoder.spring.jpa.h2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.bezkoder.spring.jpa.h2.model.Tutorial;
import com.bezkoder.spring.jpa.h2.repository.TutorialRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TutorialController {

  @Autowired
  TutorialRepository tutorialRepository;

  @CrossOrigin
  @GetMapping("/books")
  public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String type) {
    try {
      List<Tutorial> tutorials = new ArrayList<Tutorial>();

      if (type == null)
        tutorials.addAll(tutorialRepository.findAll());
      else
        tutorials.addAll(tutorialRepository.findByTypeContainingIgnoreCase(type));

      if (tutorials.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(tutorials, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  @CrossOrigin
  @GetMapping("/books/{id}")
  public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
    Optional<Tutorial> tutorialData = tutorialRepository.findById(id);

    if (tutorialData.isPresent()) {
      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  @CrossOrigin
  @PostMapping("/books")
  public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
    try {
      Tutorial _tutorial = tutorialRepository.save(new Tutorial(tutorial.getName(), tutorial.getAuthor(), tutorial.getDescription(), tutorial.getRate(), tutorial.getLike(), tutorial.getContent(), tutorial.getPrice(), tutorial.getSalePrice(), tutorial.getSaleRate(), tutorial.getType(), tutorial.getImageURL(),  false, tutorial.getFormat(), tutorial.getPublishedDate()));
      return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  @CrossOrigin
  @PutMapping("/books/{id}")
  public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
    Optional<Tutorial> tutorialData = tutorialRepository.findById(id);

    if (tutorialData.isPresent()) {
      Tutorial _tutorial = tutorialData.get();
      _tutorial.setName((tutorial.getName()));
      _tutorial.setAuthor((tutorial.getAuthor()));
      _tutorial.setDescription((tutorial.getDescription()));
      _tutorial.setRate((tutorial.getRate()));
      _tutorial.setLike((tutorial.getLike()));
      _tutorial.setContent((tutorial.getContent()));
      _tutorial.setPrice((tutorial.getPrice()));
      _tutorial.setSalePrice((tutorial.getSalePrice()));
      _tutorial.setSaleRate((tutorial.getSaleRate()));
      _tutorial.setType((tutorial.getType()));
      _tutorial.setImageURL((tutorial.getImageURL()));
      _tutorial.setPublished(tutorial.isPublished());
      return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  @CrossOrigin
  @DeleteMapping("/books/{id}")
  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
    try {
      tutorialRepository.deleteById(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  @CrossOrigin
  @DeleteMapping("/books")
  public ResponseEntity<HttpStatus> deleteAllTutorials() {
    try {
      tutorialRepository.deleteAll();
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }
  @CrossOrigin
  @GetMapping("/books/published")
  public ResponseEntity<List<Tutorial>> findByPublished() {
    try {
      List<Tutorial> tutorials = tutorialRepository.findByPublished(true);

      if (tutorials.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(tutorials, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }


  @CrossOrigin
  @GetMapping("/books/type/{type}")
  public ResponseEntity<List<Tutorial>> getTutorialByType(@PathVariable("type") String type) {
    try {
      List<Tutorial> tutorials = tutorialRepository.findByType(type);

      if (tutorials.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(tutorials, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @CrossOrigin
  @GetMapping("/books/author/{author}")
  public ResponseEntity<List<Tutorial>> getTutorialByAuthor(@PathVariable("author") String author) {
    try {
      List<Tutorial> tutorials = tutorialRepository.findByAuthor(author);

      if (tutorials.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(tutorials, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}