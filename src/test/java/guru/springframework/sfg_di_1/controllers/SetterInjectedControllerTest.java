package guru.springframework.sfg_di_1.controllers;

import guru.springframework.sfg_di_1.SfgDi1Application;
import guru.springframework.sfg_di_1.services.GreetingService;
import guru.springframework.sfg_di_1.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setup() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}