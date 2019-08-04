package info.mastera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Can be used and this annotations
//@ComponentScan
//@EnableAutoConfiguration

@SpringBootApplication
public class RestWebService {
    /**
     * Service with Spring Boot start
     * To run : mvn spring-boot:run
     */
    public static void main(String[] args) {
        SpringApplication.run(RestWebService.class, args);
    }
}