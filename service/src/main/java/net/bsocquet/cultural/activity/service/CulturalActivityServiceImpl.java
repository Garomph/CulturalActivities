package net.bsocquet.cultural.activity.service;

import activity.entities.CulturalActivity;
import activity.service.CulturalActivityRepository;
import activity.service.CulturalActivityService;

public class CulturalActivityServiceImpl implements CulturalActivityService {

    private final CulturalActivityRepository repository;

    public CulturalActivityServiceImpl(CulturalActivityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Integer getTotalActivityByCriteria(CulturalActivity culturalActivity) {
        return repository.getByCriteria(culturalActivity).stream()
                .map(CulturalActivity::numberOfActivities)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
