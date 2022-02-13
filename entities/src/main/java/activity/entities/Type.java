package activity.entities;

import java.util.Arrays;

public enum Type {
    DRAMATIQUE("arts dramatiques"),
    MEDIATIQUE("arts médiatiques"),
    URBAIN("arts urbains"),
    VISUEL("arts visuels"),
    CIRQUE("cirque"),
    LITTERAIRE("création littéraire"),
    DANSE("danse"),
    METIER_D_ARTS("métiers d'arts"),
    MUSIQUE("musique");

    private final String description;

    Type(String description) {
        this.description = description;
    }

    public static Type getFromDescription(String description) {
        return Arrays.stream(Type.values())
                .filter(type -> type.description.equals(description))
                .findFirst()
                .orElse(null);
    }

    public String getDescription() {
        return description;
    }
}
