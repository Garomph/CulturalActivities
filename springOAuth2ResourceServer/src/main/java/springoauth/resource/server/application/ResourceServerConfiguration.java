package springoauth.resource.server.application;


import activity.service.CulturalActivityRepository;
import activity.service.CulturalActivityService;
import net.bsocquet.cultural.activity.repository.CulturalActivityRepositoryImpl;
import net.bsocquet.cultural.activity.repository.data.CulturalActivityData;
import net.bsocquet.cultural.activity.service.CulturalActivityServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class ResourceServerConfiguration {


    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.mvcMatcher("/activity/**")
                .authorizeRequests()
                .mvcMatchers("/activity/**")
                .access("hasAuthority('SCOPE_activity.read')")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }

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

}
