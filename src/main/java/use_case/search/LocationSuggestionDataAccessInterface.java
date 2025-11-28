package use_case.search;

import interface_adapter.search.LocationSuggestionData;

import java.io.IOException;
import java.util.List;

/**
 * Interface for accessing location suggestion and reverse geocoding services.
 * This interface is used by the view layer to maintain clean architecture boundaries.
 */
public interface LocationSuggestionDataAccessInterface {
    /**
     * Search for location suggestions based on a query string and geographic bounds.
     *
     * @param query the search query string
     * @param minLon minimum longitude of the search area (can be null)
     * @param minLat minimum latitude of the search area (can be null)
     * @param maxLon maximum longitude of the search area (can be null)
     * @param maxLat maximum latitude of the search area (can be null)
     * @param limit maximum number of results to return
     * @return list of location suggestions
     * @throws IOException if the request fails
     * @throws InterruptedException if the request is interrupted
     */
    List<LocationSuggestionData> searchSuggestions(String query, Double minLon, Double minLat, 
                                                   Double maxLon, Double maxLat, int limit) 
            throws IOException, InterruptedException;

    /**
     * Reverse geocode a latitude/longitude pair to get a location name.
     *
     * @param latitude the latitude
     * @param longitude the longitude
     * @return location suggestion data, or null if reverse geocoding fails
     * @throws IOException if the request fails
     * @throws InterruptedException if the request is interrupted
     */
    LocationSuggestionData reverse(double latitude, double longitude) 
            throws IOException, InterruptedException;
}

