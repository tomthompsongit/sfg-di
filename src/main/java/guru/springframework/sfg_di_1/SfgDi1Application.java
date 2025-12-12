package guru.springframework.sfg_di_1;

import guru.springframework.sfg_di_1.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDi1Application {

	public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDi1Application.class, args);

        MyController myController = ctx.getBean(MyController.class);
        // MyController myController = ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);
	}

}
