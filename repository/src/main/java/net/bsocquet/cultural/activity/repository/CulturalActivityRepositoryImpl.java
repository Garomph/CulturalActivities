package net.bsocquet.cultural.activity.repository;

import activity.entities.CulturalActivity;
import activity.service.CulturalActivityRepository;
import net.bsocquet.cultural.activity.repository.data.CulturalActivityData;

import java.util.List;
import java.util.stream.Collectors;

public class CulturalActivityRepositoryImpl implements CulturalActivityRepository {

    private final CulturalActivityData data;

    public CulturalActivityRepositoryImpl(CulturalActivityData data) {
        this.data = data;
    }

    @Override
    public void insert(CulturalActivity activity) {
        throw new RuntimeException("Not Implemented");
    }

    @Override
    public void update(CulturalActivity activity) {
        throw new RuntimeException("Not Implemented");
    }

    @Override
    public void delete(CulturalActivity activity) {
        throw new RuntimeException("Not Implemented");
    }

    @Override
    public List<CulturalActivity> getByCriteria(CulturalActivity criteria) {
        return data.getCulturalActivites()
                .stream().filter(activity -> matches(activity, criteria))
                .collect(Collectors.toList());
    }

    private boolean matches(CulturalActivity activity, CulturalActivity criteria) {
        return criteria == null || (
                (criteria.type() == null || criteria.type() == activity.type()) &&
                        (criteria.borough() == null || criteria.borough() == activity.borough()) &&
                        (criteria.numberOfActivities() == null || criteria.numberOfActivities().equals(activity.numberOfActivities()))

        );
    }
}
