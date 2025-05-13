package model;

import javax.xml.stream.Location;
import java.time.LocalDateTime;


public class Incident {

    //Attributes y relaxations
    private String id;
    private String description;
    private IncidentType type;
    private Location location;
    private IncidentStatus status;
    public LocalDateTime dateTime;

    //Constructor
    public Incident(String id, String description, IncidentType type, Location location, IncidentStatus status, LocalDateTime dateTime) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.location = location;
        this.status = status;
        this.dateTime = dateTime;


    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IncidentType getType() {
        return type;
    }

    public void setType(IncidentType type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public IncidentStatus getStatus() {
        return status;
    }

    public void setStatus(IncidentStatus status) {
        this.status = status;
    }

    //toString
    @Override
    public String toString() {
        return String.format(
                "🚨 Incident ID: %s\n📝 Description: %s\n📌 Type: %s\n📍 Location: %s\n🔄 Status: %s\n📅 Date and Time : %s",
                id, description, type, location, status, dateTime
        );
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

}
