/*
 * Class: CMSC203 
 * Instructor: Professor Thai.
 * Description: Project 2
 * Due: 10/04/2024
 * Platform/compiler: Visual Studio Code.
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Johan Mbouwa Fokoua
*/

import java.util.Scanner; // Import the Scanner class for user input

public class Patient {
    // Declare private instance variables for Patient class
    private String firstName, lastName, middleName;
    private String streetAddress, city, state; 
    private String emergencyContactName, emergencyContactPhoneNumber, phoneNumber;
    private int zipCode;

    // Default constructor that initializes patient information with default values
    public Patient() {
        this.firstName = "";
        this.lastName = "";
        this.middleName = "";
        this.streetAddress = "";
        this.city = "";
        this.state = "";
        this.phoneNumber = "";
        this.emergencyContactPhoneNumber = "";
        this.emergencyContactName = "";
        this.zipCode = 0;
    }

    // Constructor for initializing a patient with first, middle, and last names
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Constructor for initializing a patient with all details
    public Patient(String firstName, String middleName, String lastName, 
                   String streetAddress, String city, String state, int zipCode, 
                   String phoneNumber, String emergencyContactName, String emergencyContactPhoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
    }

    // Getter methods for accessing private instance variables
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getEmergencyContactPhoneNumber() {
        return emergencyContactPhoneNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    // Setter methods for modifying private instance variables
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    // Method to build and return the full name of the patient
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build and return the complete address of the patient
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    // Method to build and return the emergency contact information
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhoneNumber;
    }

    // Overriding the toString method to provide a string representation of the Patient object
    public String toString() {
        return "Full name: " + buildFullName() + 
                "\nAddress: " + buildAddress() +
                "\nEmergency Contact: " + buildEmergencyContact();
    }
}
