    package com.example.appb;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.ConfigurableApplicationContext;
    import org.springframework.context.annotation.ImportResource;

    /**
     * Created by greguska on 2/16/16.
     */
    @SpringBootApplication
    @ImportResource("classpath:run-app-b-context.xml")
    public class ApplicationB {

        public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(ApplicationB.class, args);

            System.out.println(context.getBean("helloA"));
            System.out.println(context.getBean("helloB"));
        }
    }
