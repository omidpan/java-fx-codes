package champlaincollege.demo.utility;

public enum Country {
    CANADA( "CANADA",
            "The Canadian national flag features a red maple leaf centered between two red vertical bands on a white field.","flags/ca.png"),
    CHINA("CHINA", "The China national flag ...",  "flags/china.png"),
    DENMARK( "DENMARK", "The Denmark national flag ...",  "flags/denmark.png"),
    FRANCE("FRANCE", "The France national flag ...",  "flags/france.png"),
    GERMANY( "GERMANY", "The Germany national flag ...","flags/germany.png"),
    INDIA( "INDIA", "The India national flag ...",  "flags/india.png"),
    NORWAY( "NORWAY", "The Norway national flag ...",  "flags/norway.png"),
    UNITED_KINGDOM("UNITED_KINGDOM", "The United Kingdom national flag ...",  "flags/uk.png"),
    UNITED_STATES_OF_AMERICA("UNITED_STATES_OF_AMERICA", "The United State of America national flag ...",  "flags/us.png"),;


    private final String countryName;
    private final String description;
    private final String flagImage;

    Country( String countryName, String description, String flagImage) {
        this.countryName = countryName;
        this.description = description;
        this.flagImage = flagImage;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getDescription() {
        return description;
    }
    public String getFlagImage() {
        return flagImage;
    }
}
