package ALL.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);

        http
                .authorizeRequests()
                .antMatchers("/users/**").authenticated()
                // .antMatchers("/users/**").permitAll();
                .and()
                .formLogin()
                .loginPage("/login");
        http.csrf().disable();

    }

    //@Override
    //  protected  void configure (HttpSecurity http) throws
}
