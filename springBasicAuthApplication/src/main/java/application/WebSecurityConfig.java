package application;

import activity.service.CulturalActivityRepository;
import activity.service.CulturalActivityService;
import net.bsocquet.cultural.activity.repository.CulturalActivityRepositoryImpl;
import net.bsocquet.cultural.activity.repository.data.CulturalActivityData;
import net.bsocquet.cultural.activity.service.CulturalActivityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public CulturalActivityData getCulturalActivityData() {
        return new CulturalActivityData();
    }

    @Bean
    public CulturalActivityRepository getCulturalActivityRepository() {
        return new CulturalActivityRepositoryImpl(getCulturalActivityData());
    }

    @Bean
    public CulturalActivityService getCulturalActivityService() {
        return new CulturalActivityServiceImpl(getCulturalActivityRepository());
    }

    @Autowired
    private AuthenticationEntryPoint authEntryPoint;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .anyRequest().authenticated()
                .and().httpBasic()
                .authenticationEntryPoint(authEntryPoint);
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER");
    }

}
