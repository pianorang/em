package me.pianorang.em.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class SpringSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> authz
                        .antMatchers("/h2-console/**").permitAll()
                        //.anyRequest().authenticated()
                        .antMatchers("/admin/**").authenticated()
                )
                .csrf().ignoringAntMatchers("/h2-console/**").and()
                .headers().frameOptions().disable().and()

                .logout().logoutUrl("/logout").and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login")

                .failureHandler(
                    (request, response, exception) -> {
                        System.out.println("exception!! : " + exception.getMessage());
                        response.sendRedirect("/login");
                    }
                )
        ;
        return http.build();
    }

    public class SecurityConfiguration {
        //@Bean
        public WebSecurityCustomizer webSecurityCustomizer() {
            return (web) -> web.ignoring().antMatchers("/**");
        }

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
