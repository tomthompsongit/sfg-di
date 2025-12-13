package guru.springframework.sfg_di_1;

import guru.springframework.sfg_di_1.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDi1Application {

	public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDi1Application.class, args);

        System.out.println("------ I18nController  with Springframework -------");
        I18nController i18nController = ctx.getBean(I18nController.class);
        System.out.println(i18nController.sayGreeting());

        MyController myController = ctx.getBean(MyController.class);
        System.out.println("------ Primary Bean MyController  with Springframework -------");
        String greeting = myController.sayHello();
        System.out.println(greeting);
        System.out.println("------ PropertyBasedContoller  with Springframework -------");
        PropertyInjectedController controller = ctx.getBean(PropertyInjectedController.class);
        System.out.println(controller.getGreeting());
        System.out.println("------ SetterInjectedContoller  with Springframework -------");
        SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreeting());
        System.out.println("------ ConstructorInjectedController  with Springframework -------");
        ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.getGreeting());

    }

}
