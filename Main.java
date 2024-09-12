package main;

import java.time.ZoneOffset;  

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoctorAppointmentSystem system = new DoctorAppointmentSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDoctor Appointment System");
            System.out.println("1. Register Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. Display Doctor Availability");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerPatient(system, scanner);
                    break;
                case 2:
                    addDoctor(system, scanner);
                    break;
                case 3:
                    bookAppointment(system, scanner);
                    break;
                case 4:
                    displayDoctorAvailability(system, scanner);
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    scanner.close(); // Close the scanner
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerPatient(DoctorAppointmentSystem system, Scanner scanner) {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact info: ");
        String contactInfo = scanner.nextLine();
        Patient patient = new Patient(name, contactInfo);
        system.registerPatient(patient);
        System.out.println("Patient registered successfully.");
    }

    private static void addDoctor(DoctorAppointmentSystem system, Scanner scanner) {
        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter specialization: ");
        String specialization = scanner.nextLine();
        System.out.print("Is the doctor a Specialist? (yes/no): ");
        String isSpecialist = scanner.nextLine();

        Doctor doctor;
        if (isSpecialist.equalsIgnoreCase("yes")) {
            doctor = new Specialist(name, specialization);
        } else {
            doctor = new GeneralPractitioner(name, specialization);
        }

        system.addDoctor(doctor);
        System.out.println("Doctor added successfully.");
    }

    private static void bookAppointment(DoctorAppointmentSystem system, Scanner scanner) {
        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();
        Doctor doctor = system.findDoctorByName(doctorName);
        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();
        Patient patient = system.findPatientByName(patientName);
        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        System.out.print("Enter appointment date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.print("Enter appointment time (HH:mm:ss): ");
        LocalTime time = LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_TIME);

        Appointment appointment = new Appointment(doctor, patient, Date.from(date.atStartOfDay().toInstant(ZoneOffset.UTC)), Time.valueOf(time));
        system.bookAppointment(appointment);
        System.out.println("Appointment booked successfully.");
    }

    private static void displayDoctorAvailability(DoctorAppointmentSystem system, Scanner scanner) {
        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();
        Doctor doctor = system.findDoctorByName(name);
        if (doctor != null) {
            system.displayDoctorAvailability(doctor);
        } else {
            System.out.println("Doctor not found.");
        }
    }
}
