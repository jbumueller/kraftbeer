package meta;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import configuration.DomainConfiguration;
import meta.configuration.ApiConfiguration;

@Import({DomainConfiguration.class, ApiConfiguration.class})
@SpringBootApplication
public class AppRunner {

    public static void main(String[] args) {
    	
        SpringApplication.run(AppRunner.class, args);
    }
}
