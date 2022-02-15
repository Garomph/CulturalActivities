package application.controller;


import activity.service.CulturalActivityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CulturalActivityController {

    private final CulturalActivityService culturalActivityService;

    public CulturalActivityController(CulturalActivityService culturalActivityService) {
        this.culturalActivityService = culturalActivityService;
    }

    @GetMapping("/activity")
    public ResponseEntity<Integer> getTotalNumberOfActivity() {
        return new ResponseEntity<>(culturalActivityService.getTotalActivityByCriteria(null), HttpStatus.OK);
    }
}
