package ALL.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by asu on 15.08.2020.
 */
@SpringBootApplication
@ComponentScan(basePackages = "ALL")
@EnableJpaRepositories(basePackages = "ALL.repository")
@EntityScan(basePackages = "ALL.models")
public class Application {


    @Bean
    public PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }


    public static void main(String[] args){

        SpringApplication.run(Application.class);

    }
}
