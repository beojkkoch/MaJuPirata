package model;

public abstract class Vehicle {
    //Attributes y relaxations
    private String id;
    private String plate;
    



    //Constructor
    public Vehicle(String id, String plate, VehicleType type) {
        this.id = id;
        this.plate = plate;

    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }


    //toString
    public String toString() {
        return String.format(
                "🚗 Vehicle ID: %s\n📌 Place: %s\n🔹 Type: %s",
                id, plate
        );
    }
}




