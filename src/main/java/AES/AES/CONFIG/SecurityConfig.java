/*package AES.AES.CONFIG;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        // Permite el acceso sin autenticación a Swagger
        return (web) -> web.ignoring().requestMatchers("/swagger-ui/**", "/v3/api-docs/**");
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // Configuración básica de usuario en memoria para autenticación
        return new InMemoryUserDetailsManager(
                User.withUsername("admin").password("{noop}password").roles("USER").build()
        );
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Configuración de las rutas de autorización
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll() // Acceso libre a Swagger
                        .anyRequest().authenticated()  // Requiere autenticación para otras rutas
                )
                // Desactivar CSRF de forma correcta para Spring Security 6
                .csrf().disable();  // Desactiva CSRF si usas JWT (sin cookies de sesión)

        return http.build();
    }
}*/