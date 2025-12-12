package guru.springframework.sfg_di_1.controllers;

import guru.springframework.sfg_di_1.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
