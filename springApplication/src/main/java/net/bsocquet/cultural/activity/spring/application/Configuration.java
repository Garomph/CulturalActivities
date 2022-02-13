package net.bsocquet.cultural.activity.spring.application;

import activity.service.CulturalActivityRepository;
import activity.service.CulturalActivityService;
import net.bsocquet.cultural.activity.repository.CulturalActivityRepositoryImpl;
import net.bsocquet.cultural.activity.repository.data.CulturalActivityData;
import net.bsocquet.cultural.activity.service.CulturalActivityServiceImpl;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

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
