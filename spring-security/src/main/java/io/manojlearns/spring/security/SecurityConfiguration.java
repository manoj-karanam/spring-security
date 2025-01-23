package io.manojlearns.spring.security;


//https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    public InMemoryUserDetailsManager userDetailsService(){

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("foo")
                .password("foo")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);

    }

}



