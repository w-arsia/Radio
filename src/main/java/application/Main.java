package application;

import application.repository.SongRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "application")

public class Main {

    public static void main (String [] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        SongRepository songRepository = (SongRepository)  context.getBean("songRepository");
        System.out.println(songRepository);

    }

}
