package net.bsocquet.cultural.activity.repository.data;

import activity.entities.CulturalActivity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class CulturalActivityData {


    private final ObjectMapper mapper = new ObjectMapper();

    List<CulturalActivity> culturalActivities = new ArrayList<>();

    @PostConstruct
    public void postConstruct() throws JsonProcessingException {
        loadData(DRAMATIQUE);
        loadData(MEDIATIQUE);
        loadData(METIER);
        loadData(VISUEL);
        loadData(URBAIN);
        loadData(DANSE);
        loadData(LITTERAIRE);
        loadData(MUSIQUE);
        loadData(CIRQUE);
    }


    public List<CulturalActivity> getCulturalActivites() {
        return culturalActivities;
    }

    private void loadData(String data) throws JsonProcessingException {
        culturalActivities.addAll(mapper.readValue(data, new TypeReference<>() {
        }));
    }


    private static final String DRAMATIQUE = """
            [
              {
                "type": "DRAMATIQUE",
                "borough": "AHUNSTIC",\s
                "numberOfActivities": 23
              },
              {
                "type": "DRAMATIQUE",
                "borough": "ANJOU",\s
                "numberOfActivities": 3
              },
              {
                "type": "DRAMATIQUE",
                "borough": "COTE_DES_NEIGES",
                "numberOfActivities": 11
              },
              {
                "type": "DRAMATIQUE",
                "borough": "LACHINE",
                "numberOfActivities": 11
              },
              {
                "type": "DRAMATIQUE",
                "borough": "LASALLE",
                "numberOfActivities": 13
              },
              {
                "type": "DRAMATIQUE",
                "borough": "PLATEAU",
                "numberOfActivities": 40
              },
              {
                "type": "DRAMATIQUE",
                "borough": "SUD_OUEST",
                "numberOfActivities": 3
              },
              {
                "type": "DRAMATIQUE",
                "borough": "ILE_BIZARD",
                "numberOfActivities": 3
              },
              {
                "type": "DRAMATIQUE",
                "borough": "HOCHELAGA",
                "numberOfActivities": 48
              },
              {
                "type": "DRAMATIQUE",
                "borough": "MONTREAL_NORD",
                "numberOfActivities": 4
              },
              {
                "type": "DRAMATIQUE",
                "borough": "OUTREMONT",
                "numberOfActivities": 0
              },
              {
                "type": "DRAMATIQUE",
                "borough": "ROXBORO",
                "numberOfActivities": 14
              },
              {
                "type": "DRAMATIQUE",
                "borough": "POINTE_AUX_TREMBLES",
                "numberOfActivities": 15
              },
              {
                "type": "DRAMATIQUE",
                "borough": "ROSEMONT",
                "numberOfActivities": 65
              },
              {
                "type": "DRAMATIQUE",
                "borough": "SAINT_LAURENT",
                "numberOfActivities": 2
              },
              {
                "type": "DRAMATIQUE",
                "borough": "SAINT_LEONARD",
                "numberOfActivities": 2
              },
              {
                "type": "DRAMATIQUE",
                "borough": "VERDUN",
                "numberOfActivities": 0
              },
              {
                "type": "DRAMATIQUE",
                "borough": "VILLE_MARIE",
                "numberOfActivities": 8
              },
              {
                "type": "DRAMATIQUE",
                "borough": "VILLERAY",
                "numberOfActivities": 15
              }
            ]
            """;

    private static final String CIRQUE = """
            [
              {
                "type": "CIRQUE",
                "borough": "AHUNSTIC",
                "numberOfActivities": 2
              },
              {
                "type": "CIRQUE",
                "borough": "ANJOU",
                "numberOfActivities": 0
              },
              {
                "type": "CIRQUE",
                "borough": "COTE_DES_NEIGES",
                "numberOfActivities": 3
              },
              {
                "type": "CIRQUE",
                "borough": "LACHINE",
                "numberOfActivities": 2
              },
              {
                "type": "CIRQUE",
                "borough": "LASALLE",
                "numberOfActivities": 1
              },
              {
                "type": "CIRQUE",
                "borough": "PLATEAU",
                "numberOfActivities": 0
              },
              {
                "type": "CIRQUE",
                "borough": "SUD_OUEST",
                "numberOfActivities": 4
              },
              {
                "type": "CIRQUE",
                "borough": "ILE_BIZARD",
                "numberOfActivities": 0
              },
              {
                "type": "CIRQUE",
                "borough": "HOCHELAGA",
                "numberOfActivities": 26
              },
              {
                "type": "CIRQUE",
                "borough": "MONTREAL_NORD",
                "numberOfActivities": 0
              },
              {
                "type": "CIRQUE",
                "borough": "OUTREMONT",
                "numberOfActivities": 0
              },
              {
                "type": "CIRQUE",
                "borough": "ROXBORO",
                "numberOfActivities": 0
              },
              {
                "type": "CIRQUE",
                "borough": "POINTE_AUX_TREMBLES",
                "numberOfActivities": 1
              },
              {
                "type": "CIRQUE",
                "borough": "ROSEMONT",
                "numberOfActivities": 9
              },
              {
                "type": "CIRQUE",
                "borough": "SAINT_LAURENT",
                "numberOfActivities": 0
              },
              {
                "type": "CIRQUE",
                "borough": "SAINT_LEONARD",
                "numberOfActivities": 0
              },
              {
                "type": "CIRQUE",
                "borough": "VERDUN",
                "numberOfActivities": 21
              },
              {
                "type": "CIRQUE",
                "borough": "VILLE_MARIE",
                "numberOfActivities": 0
              },
              {
                "type": "CIRQUE",
                "borough": "VILLERAY",
                "numberOfActivities": 6
              }
            ]
            """;

    private static final String MEDIATIQUE = """
            [
              {
                "type": "MEDIATIQUE",
                "borough": "AHUNSTIC",
                "numberOfActivities": 8
              },
              {
                "type": "MEDIATIQUE",
                "borough": "ANJOU",
                "numberOfActivities": 0
              },
              {
                "type": "MEDIATIQUE",
                "borough": "COTE_DES_NEIGES",
                "numberOfActivities": 5
              },
              {
                "type": "MEDIATIQUE",
                "borough": "LACHINE",
                "numberOfActivities": 1
              },
              {
                "type": "MEDIATIQUE",
                "borough": "LASALLE",
                "numberOfActivities": 8
              },
              {
                "type": "MEDIATIQUE",
                "borough": "PLATEAU",
                "numberOfActivities": 17
              },
              {
                "type": "MEDIATIQUE",
                "borough": "SUD_OUEST",
                "numberOfActivities": 0
              },
              {
                "type": "MEDIATIQUE",
                "borough": "ILE_BIZARD",
                "numberOfActivities": 4
              },
              {
                "type": "MEDIATIQUE",
                "borough": "HOCHELAGA",
                "numberOfActivities": 33
              },
              {
                "type": "MEDIATIQUE",
                "borough": "MONTREAL_NORD",
                "numberOfActivities": 2
              },
              {
                "type": "MEDIATIQUE",
                "borough": "OUTREMONT",
                "numberOfActivities": 0
              },
              {
                "type": "MEDIATIQUE",
                "borough": "ROXBORO",
                "numberOfActivities": 4
              },
              {
                "type": "MEDIATIQUE",
                "borough": "POINTE_AUX_TREMBLES",
                "numberOfActivities": 17
              },
              {
                "type": "MEDIATIQUE",
                "borough": "ROSEMONT",
                "numberOfActivities": 40
              },
              {
                "type": "MEDIATIQUE",
                "borough": "SAINT_LAURENT",
                "numberOfActivities": 10
              },
              {
                "type": "MEDIATIQUE",
                "borough": "SAINT_LEONARD",
                "numberOfActivities": 0
              },
              {
                "type": "MEDIATIQUE",
                "borough": "VERDUN",
                "numberOfActivities": 8
              },
              {
                "type": "MEDIATIQUE",
                "borough": "VILLE_MARIE",
                "numberOfActivities": 22
              },
              {
                "type": "MEDIATIQUE",
                "borough": "VILLERAY",
                "numberOfActivities": 19
              }
            ]
            """;

    private static final String URBAIN = """
            [
              {
                "type": "URBAIN",
                "borough": "AHUNSTIC",
                "numberOfActivities": 40
              },
              {
                "type": "URBAIN",
                "borough": "ANJOU",
                "numberOfActivities": 0
              },
              {
                "type": "URBAIN",
                "borough": "COTE_DES_NEIGES",
                "numberOfActivities": 43
              },
              {
                "type": "URBAIN",
                "borough": "LACHINE",
                "numberOfActivities": 8
              },
              {
                "type": "URBAIN",
                "borough": "LASALLE",
                "numberOfActivities": 13
              },
              {
                "type": "URBAIN",
                "borough": "PLATEAU",
                "numberOfActivities": 48
              },
              {
                "type": "URBAIN",
                "borough": "SUD_OUEST",
                "numberOfActivities": 13
              },
              {
                "type": "URBAIN",
                "borough": "ILE_BIZARD",
                "numberOfActivities": 3
              },
              {
                "type": "URBAIN",
                "borough": "HOCHELAGA",
                "numberOfActivities": 70
              },
              {
                "type": "URBAIN",
                "borough": "MONTREAL_NORD",
                "numberOfActivities": 6
              },
              {
                "type": "URBAIN",
                "borough": "OUTREMONT",
                "numberOfActivities": 8
              },
              {
                "type": "URBAIN",
                "borough": "ROXBORO",
                "numberOfActivities": 3
              },
              {
                "type": "URBAIN",
                "borough": "POINTE_AUX_TREMBLES",
                "numberOfActivities": 29
              },
              {
                "type": "URBAIN",
                "borough": "ROSEMONT",
                "numberOfActivities": 19
              },
              {
                "type": "URBAIN",
                "borough": "SAINT_LAURENT",
                "numberOfActivities": 0
              },
              {
                "type": "URBAIN",
                "borough": "SAINT_LEONARD",
                "numberOfActivities": 2
              },
              {
                "type": "URBAIN",
                "borough": "VERDUN",
                "numberOfActivities": 6
              },
              {
                "type": "URBAIN",
                "borough": "VILLE_MARIE",
                "numberOfActivities": 26
              },
              {
                "type": "URBAIN",
                "borough": "VILLERAY",
                "numberOfActivities": 26
              }
            ]
            """;

    private static final String VISUEL = """
            [
              {
                "type": "VISUEL",
                "borough": "AHUNSTIC",
                "numberOfActivities": 142
              },
              {
                "type": "VISUEL",
                "borough": "ANJOU",
                "numberOfActivities": 18
              },
              {
                "type": "VISUEL",
                "borough": "COTE_DES_NEIGES",
                "numberOfActivities": 94
              },
              {
                "type": "VISUEL",
                "borough": "LACHINE",
                "numberOfActivities": 32
              },
              {
                "type": "VISUEL",
                "borough": "LASALLE",
                "numberOfActivities": 35
              },
              {
                "type": "VISUEL",
                "borough": "PLATEAU",
                "numberOfActivities": 77
              },
              {
                "type": "VISUEL",
                "borough": "SUD_OUEST",
                "numberOfActivities": 19
              },
              {
                "type": "VISUEL",
                "borough": "ILE_BIZARD",
                "numberOfActivities": 3
              },
              {
                "type": "VISUEL",
                "borough": "HOCHELAGA",
                "numberOfActivities": 137
              },
              {
                "type": "VISUEL",
                "borough": "MONTREAL_NORD",
                "numberOfActivities": 4
              },
              {
                "type": "VISUEL",
                "borough": "OUTREMONT",
                "numberOfActivities": 21
              },
              {
                "type": "VISUEL",
                "borough": "ROXBORO",
                "numberOfActivities": 26
              },
              {
                "type": "VISUEL",
                "borough": "POINTE_AUX_TREMBLES",
                "numberOfActivities": 67
              },
              {
                "type": "VISUEL",
                "borough": "ROSEMONT",
                "numberOfActivities": 92
              },
              {
                "type": "VISUEL",
                "borough": "SAINT_LAURENT",
                "numberOfActivities": 108
              },
              {
                "type": "VISUEL",
                "borough": "SAINT_LEONARD",
                "numberOfActivities": 45
              },
              {
                "type": "VISUEL",
                "borough": "VERDUN",
                "numberOfActivities": 21
              },
              {
                "type": "VISUEL",
                "borough": "VILLE_MARIE",
                "numberOfActivities": 37
              },
              {
                "type": "VISUEL",
                "borough": "VILLERAY",
                "numberOfActivities": 73
              }
            ]
            """;

    private static final String MUSIQUE = """
            [
              {
                "type": "MUSIQUE",
                "borough": "AHUNSTIC",
                "numberOfActivities": 57
              },
              {
                "type": "MUSIQUE",
                "borough": "ANJOU",
                "numberOfActivities": 10
              },
              {
                "type": "MUSIQUE",
                "borough": "COTE_DES_NEIGES",
                "numberOfActivities": 114
              },
              {
                "type": "MUSIQUE",
                "borough": "LACHINE",
                "numberOfActivities": 41
              },
              {
                "type": "MUSIQUE",
                "borough": "LASALLE",
                "numberOfActivities": 19
              },
              {
                "type": "MUSIQUE",
                "borough": "PLATEAU",
                "numberOfActivities": 26
              },
              {
                "type": "MUSIQUE",
                "borough": "SUD_OUEST",
                "numberOfActivities": 31
              },
              {
                "type": "MUSIQUE",
                "borough": "ILE_BIZARD",
                "numberOfActivities": 0
              },
              {
                "type": "MUSIQUE",
                "borough": "HOCHELAGA",
                "numberOfActivities": 66
              },
              {
                "type": "MUSIQUE",
                "borough": "MONTREAL_NORD",
                "numberOfActivities": 15
              },
              {
                "type": "MUSIQUE",
                "borough": "OUTREMONT",
                "numberOfActivities": 19
              },
              {
                "type": "MUSIQUE",
                "borough": "ROXBORO",
                "numberOfActivities": 11
              },
              {
                "type": "MUSIQUE",
                "borough": "POINTE_AUX_TREMBLES",
                "numberOfActivities": 45
              },
              {
                "type": "MUSIQUE",
                "borough": "ROSEMONT",
                "numberOfActivities": 101
              },
              {
                "type": "MUSIQUE",
                "borough": "SAINT_LAURENT",
                "numberOfActivities": 0
              },
              {
                "type": "MUSIQUE",
                "borough": "SAINT_LEONARD",
                "numberOfActivities": 7
              },
              {
                "type": "MUSIQUE",
                "borough": "VERDUN",
                "numberOfActivities": 46
              },
              {
                "type": "MUSIQUE",
                "borough": "VILLE_MARIE",
                "numberOfActivities": 46
              },
              {
                "type": "MUSIQUE",
                "borough": "VILLERAY",
                "numberOfActivities": 103
              }
            ]
            """;

    private static final String METIER = """
            [
              {
                "type": "METIER_D_ARTS",
                "borough": "AHUNSTIC",
                "numberOfActivities": 43
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "ANJOU",
                "numberOfActivities": 14
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "COTE_DES_NEIGES",
                "numberOfActivities": 57
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "LACHINE",
                "numberOfActivities": 8
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "LASALLE",
                "numberOfActivities": 21
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "PLATEAU",
                "numberOfActivities": 30
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "SUD_OUEST",
                "numberOfActivities": 8
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "ILE_BIZARD",
                "numberOfActivities": 3
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "HOCHELAGA",
                "numberOfActivities": 88
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "MONTREAL_NORD",
                "numberOfActivities": 10
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "OUTREMONT",
                "numberOfActivities": 0
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "ROXBORO",
                "numberOfActivities": 7
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "POINTE_AUX_TREMBLES",
                "numberOfActivities": 38
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "ROSEMONT",
                "numberOfActivities": 49
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "SAINT_LAURENT",
                "numberOfActivities": 90
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "SAINT_LEONARD",
                "numberOfActivities": 4
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "VERDUN",
                "numberOfActivities": 10
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "VILLE_MARIE",
                "numberOfActivities": 24
              },
              {
                "type": "METIER_D_ARTS",
                "borough": "VILLERAY",
                "numberOfActivities": 38
              }
            ]
            """;

    private static final String DANSE = """
            [
              {
                "type": "DANSE",
                "borough": "AHUNSTIC",
                "numberOfActivities": 152
              },
              {
                "type": "DANSE",
                "borough": "ANJOU",
                "numberOfActivities": 14
              },
              {
                "type": "DANSE",
                "borough": "COTE_DES_NEIGES",
                "numberOfActivities": 123
              },
              {
                "type": "DANSE",
                "borough": "LACHINE",
                "numberOfActivities": 78
              },
              {
                "type": "DANSE",
                "borough": "LASALLE",
                "numberOfActivities": 62
              },
              {
                "type": "DANSE",
                "borough": "PLATEAU",
                "numberOfActivities": 122
              },
              {
                "type": "DANSE",
                "borough": "SUD_OUEST",
                "numberOfActivities": 48
              },
              {
                "type": "DANSE",
                "borough": "ILE_BIZARD",
                "numberOfActivities": 25
              },
              {
                "type": "DANSE",
                "borough": "HOCHELAGA",
                "numberOfActivities": 216
              },
              {
                "type": "DANSE",
                "borough": "MONTREAL_NORD",
                "numberOfActivities": 12
              },
              {
                "type": "DANSE",
                "borough": "OUTREMONT",
                "numberOfActivities": 70
              },
              {
                "type": "DANSE",
                "borough": "ROXBORO",
                "numberOfActivities": 20
              },
              {
                "type": "DANSE",
                "borough": "POINTE_AUX_TREMBLES",
                "numberOfActivities": 167
              },
              {
                "type": "DANSE",
                "borough": "ROSEMONT",
                "numberOfActivities": 221
              },
              {
                "type": "DANSE",
                "borough": "SAINT_LAURENT",
                "numberOfActivities": 11
              },
              {
                "type": "DANSE",
                "borough": "SAINT_LEONARD",
                "numberOfActivities": 19
              },
              {
                "type": "DANSE",
                "borough": "VERDUN",
                "numberOfActivities": 44
              },
              {
                "type": "DANSE",
                "borough": "VILLE_MARIE",
                "numberOfActivities": 99
              },
              {
                "type": "DANSE",
                "borough": "VILLERAY",
                "numberOfActivities": 77
              }
            ]
            """;

    private static final String LITTERAIRE = """
            [
              {
                "type": "LITTERAIRE",
                "borough": "AHUNSTIC",
                "numberOfActivities": 1
              },
              {
                "type": "LITTERAIRE",
                "borough": "ANJOU",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "COTE_DES_NEIGES",
                "numberOfActivities": 4
              },
              {
                "type": "LITTERAIRE",
                "borough": "LACHINE",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "LASALLE",
                "numberOfActivities": 3
              },
              {
                "type": "LITTERAIRE",
                "borough": "PLATEAU",
                "numberOfActivities": 2
              },
              {
                "type": "LITTERAIRE",
                "borough": "SUD_OUEST",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "ILE_BIZARD",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "HOCHELAGA",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "MONTREAL_NORD",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "OUTREMONT",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "ROXBORO",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "POINTE_AUX_TREMBLES",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "ROSEMONT",
                "numberOfActivities": 15
              },
              {
                "type": "LITTERAIRE",
                "borough": "SAINT_LAURENT",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "SAINT_LEONARD",
                "numberOfActivities": 0
              },
              {
                "type": "LITTERAIRE",
                "borough": "VERDUN",
                "numberOfActivities": 2
              },
              {
                "type": "LITTERAIRE",
                "borough": "VILLE_MARIE",
                "numberOfActivities": 1
              },
              {
                "type": "LITTERAIRE",
                "borough": "VILLERAY",
                "numberOfActivities": 3
              }
            ]
            """;
}
