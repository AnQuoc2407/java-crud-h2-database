//package com.bezkoder.spring.jpa.h2.repository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import org.springframework.scheduling.annotation.Scheduled;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
//    @Autowired
//    private TutorialRepository tutorialRepository;
//
////    @Override
////    public void run(String... args) throws Exception {
//////        tutorialRepository.save(new Tutorial("Sample Tutorial 1", "Description 1","Sample Tutorial 1", "Sample Tutorial 1","Sample Tutorial 1","Sample Tutorial 1",true));
//////       tutorialRepository.findByType("Sample Tutorial 1");
////    }
//
////    @Scheduled(fixedDelay = 3000)// Run every 5 seconds (5000 milliseconds)
////    public void loadDataPeriodically() {
////        // Logic to execute periodically after a few seconds
////        System.out.println(tutorialRepository.findByType("Sample Tutorial 1"));
////        // You can perform any other operations here as needed
////    }
//}