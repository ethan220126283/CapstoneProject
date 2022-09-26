package za.ac.cput.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

public class Security {// need this dependency within the pom WebSecurityConfigurAdapter

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{lib}123456")
                .roles("ADMIN")
                .and()
                .withUser("Manager")
                //.password(encoder().encode("123456"))
                .roles("MANAGER")
                .and()
                .withUser("User")
                // .password(encoder().encode("123456"))
                .roles("Librarian");
    }
   /* protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeHttpRequests()
                .antMatchers(HttpMethod.POST, "").hasRole("MANAGEr")
                .antMatchers(HttpMethod.GET, "").hasRole("MANAGER")
                .antMatchers(HttpMethod.PUT, "").hasRole("MANAGER")
                .antMatchers(HttpMethod.DELETE, "").hasRole("Librarian")
                .antMatchers(HttpMethod.POST, "").hasRole("Librarian")
                .antMatchers(HttpMethod.GET, "").hasRole("User")
                .antMatchers(HttpMethod.PUT, "").hasRole("Librarian")
                .antMatchers(HttpMethod.DELETE, "").hasRole("Librarian")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

    @Bean
  //  public PasswordEncoder encoder(){
       // return new BCryptPasswordEncoder();
    }

    */
}