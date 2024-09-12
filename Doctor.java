
package main;
public abstract class Doctor {
    private String name;
    private String specialization;
    private String availability;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.availability = "Not set"; // Default availability
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public abstract void displayAvailability();
}
