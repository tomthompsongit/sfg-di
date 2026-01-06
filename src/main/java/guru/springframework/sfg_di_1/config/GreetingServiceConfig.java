package guru.springframework.sfg_di_1.config;

import guru.springframework.sfg_di_1.services.ConstructorGreetingService;
import guru.springframework.sfg_di_1.services.PropertyInjectedGreetingService;
import guru.springframework.sfg_di_1.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService  propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

}
