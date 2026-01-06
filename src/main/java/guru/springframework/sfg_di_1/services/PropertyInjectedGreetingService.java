package guru.springframework.sfg_di_1.services;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World - Property";
    }
}
