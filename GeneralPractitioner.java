
package main;


public class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void displayAvailability() {
        System.out.println("Walk-in patients welcome! Availability: " + getAvailability());
    }
}
