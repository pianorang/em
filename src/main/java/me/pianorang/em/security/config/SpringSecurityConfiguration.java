package me.pianorang.em.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.io.IOException;

@Configuration
public class SpringSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {



        http
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers("/login","/h2-console/**").permitAll()
                        //.anyRequest().authenticated()
                        .requestMatchers("/admin/**").authenticated()
                )
                .csrf().ignoringRequestMatchers("/h2-console/**").and()
                .headers().frameOptions().disable().and()

                .formLogin(login-> login
                        .loginPage("/login")
                        .loginProcessingUrl("/login")
                        .failureHandler(
                                (request, response, exception) -> {
                                    System.out.println("exception!! : " + exception.getMessage());
                                    response.sendRedirect("/login");
                                }
                        )
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/login")
                        //.logoutSuccessHandler(logoutSuccessHandler)
                        .invalidateHttpSession(true)
                        //.addLogoutHandler(logoutHandler)
                        //.deleteCookies(cookieNamesToClear)
                )
        ;
        return http.build();
    }

    public class SecurityConfiguration {
        //@Bean
        public WebSecurityCustomizer webSecurityCustomizer() {
            return (web) -> web.ignoring().requestMatchers("/**");
        }

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
