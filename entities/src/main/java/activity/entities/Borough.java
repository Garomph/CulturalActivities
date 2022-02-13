package activity.entities;

import java.util.Arrays;

public enum Borough {
    AHUNSTIC("Ahuntsic-Cartierville"),
    ANJOU("Anjou"),
    COTE_DES_NEIGES("Côte-des-Neiges-Notre-Dame-de-Grâce"),
    LACHINE("Lachine"),
    LASALLE("LaSalle"),
    PLATEAU("Le Plateau Mont-Royal"),
    SUD_OUEST("Le Sud-Ouest"),
    ILE_BIZARD("L'Île-Bizard-Sainte-Geneviève"),
    HOCHELAGA("Mercier-Hochelaga-Maisonneuve"),
    MONTREAL_NORD("Montréal-Nord"),
    OUTREMONT("Outremont"),
    ROXBORO("Pierrefonds-Roxboro"),
    POINTE_AUX_TREMBLES("Rivière-des-Prairies-Pointe-aux-Trembles"),
    ROSEMONT("Rosemont-La-Petite-Patrie"),
    SAINT_LAURENT("Saint-Laurent"),
    SAINT_LEONARD("Saint-Léonard"),
    VERDUN("Verdun"),
    VILLE_MARIE("Ville-Marie"),
    VILLERAY("Villeray-Saint-Michel-Parc-Extension");


    private final String description;

    Borough(String description) {
        this.description = description;
    }

    public static Borough getFromDescription(String description) {
        return Arrays.stream(Borough.values())
                .filter(borough -> borough.description.equals(description))
                .findFirst()
                .orElse(null);
    }

    public String getDescription() {
        return description;
    }

}
