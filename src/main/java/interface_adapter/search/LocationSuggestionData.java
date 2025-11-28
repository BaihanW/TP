package interface_adapter.search;

/**
 * Data transfer object for location suggestions.
 * Used by the view layer to avoid direct dependency on entity classes.
 */
public class LocationSuggestionData {
    private final String name;
    private final double latitude;
    private final double longitude;

    public LocationSuggestionData(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

