# SwingTripPlanner

SwingTripPlanner is a Java Swing desktop application for planning trips on an
interactive map. It follows Clean Architecture to keep use cases independent of
the UI and infrastructure layers while supporting the following five core user
stories:

1. **Search Location** – center the map on a city via the OpenStreetMap
   Nominatim API.
2. **Add Marker** – append a stop to the itinerary by coordinates.
3. **Remove Marker** – delete a stop from the itinerary by index.
4. **Reorder Itinerary** – move a stop up or down to change the visit order.
5. **Generate Route** – request an ordered route for all markers from the OSRM
   routing service.

The stop list shared by these use cases is managed through an
`ItineraryDataAccessInterface` gateway and an in-memory implementation. This
gateway is a supporting contract, not a separate use case; it simply provides a
single source of truth for stop positions so the five stories can collaborate
without embedding storage concerns in the UI.
