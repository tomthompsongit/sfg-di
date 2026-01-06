package guru.springframework.sfg_di_1.services;

public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World - Constructor";
    }
}
