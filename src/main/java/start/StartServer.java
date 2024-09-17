package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("*start*")
public class StartServer {


    public static void main(String[] args) {

        SpringApplication.run(StartServer.class, args);
    }
}