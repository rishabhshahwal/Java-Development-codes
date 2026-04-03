package com.cfs.SecurityP04;


import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurity {

   @Autowired
    private CustomUserDetailService customUserDetailService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.csrf(csrf->csrf.disable())
                .authorizeHttpRequests(auth->auth
                        .requestMatchers("api/public","/api/addusers").permitAll())
                .securityMatchers("/api/user").hasRole("USER")
                .securityMatchers("/api/admin").hasRole("ADMIN")
                .anyRequest().authenticated()
                ).httpBasic(Customizer.withDefaults());

           return http.build();
    }


    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config){
        AuthenticationManager authenticationManager = config.getAuthenticationManager();
        System.out.println("AuthenticationManager called.......");
        return authenticationManager;
    }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println("passwordEncoder method caleed......");
        return BCryptPasswordEncoder;
    }

}
