package guru.springframework.sfg_di_1.controllers;

import guru.springframework.sfg_di_1.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    PropertyInjectedGreetingService greetingService;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new PropertyInjectedGreetingService();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.getGreeting());
    }
}