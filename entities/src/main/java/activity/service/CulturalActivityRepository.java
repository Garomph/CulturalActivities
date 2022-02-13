package activity.service;

import activity.entities.CulturalActivity;

import java.util.List;

public interface CulturalActivityRepository {

    void insert(CulturalActivity activity);
    void update(CulturalActivity activity);
    void delete(CulturalActivity activity);
    List<CulturalActivity> getByCriteria(CulturalActivity criteria);

}
