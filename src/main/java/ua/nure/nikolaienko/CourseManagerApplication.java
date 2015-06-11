package ua.nure.nikolaienko;

//import org.flywaydb.core.Flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class CourseManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseManagerApplication.class, args);
    }

}
