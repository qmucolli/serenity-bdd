package dto;

public enum SpecialisationType {

    INFECTED ("infected");

    String lowerCased;

    SpecialisationType(String lowerCased) {
        this.lowerCased = lowerCased;
    }

    public String getLowerCased() {
        return this.lowerCased;
    }
}
