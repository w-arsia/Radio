package application;

import application.repository.SongRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "application")

public class Main {

    public static void main (String [] args){

        SpringApplication.run(Main.class, args);

    }

}
