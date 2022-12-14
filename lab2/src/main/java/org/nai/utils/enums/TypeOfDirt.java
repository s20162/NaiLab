package org.nai.utils.enums;

/**
 * Enum represents names for specific terms
 *
 * @author Mikołaj Kalata
 * @author Adam Lichy
 */
public enum TypeOfDirt {
    EASY("easy"),
    NORMAL("normal"),
    DIFICULT("dificult");

    private final String typeOfDirt;

    TypeOfDirt(String typeOfDirt) {
        this.typeOfDirt = typeOfDirt;
    }

    public String getTypeOfDirt() {
        return typeOfDirt;
    }
}
