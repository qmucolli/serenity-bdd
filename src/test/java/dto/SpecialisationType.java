package dto;

public enum SpecialisationType {

    CARDIO ("cardio");

    String lowerCased;

    SpecialisationType(String lowerCased) {
        this.lowerCased = lowerCased;
    }

    public String getLowerCased() {
        return this.lowerCased;
    }
}
