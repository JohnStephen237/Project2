import java.util.Scanner;
// Procedure class to store medical procedure details
public class Procedure {
    // Declare private instance variables for Procedure class
    private String procedureName, procedureDate, practitionerName;
    private double procedureCharge;

    // Default constructor that initializes procedure information with default values
    public Procedure() {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitionerName = "";
        this.procedureCharge = 0;
    }

    // Constructor for initializing procedure name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Constructor for initializing all procedure details
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharge = procedureCharge;
    }

    // Getter methods for accessing private instance variables
    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getProcedureCharge() {
        return procedureCharge;
    }

    // Setter methods for modifying private instance variables
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setProcedureCharge(double procedureCharge) {
        this.procedureCharge = procedureCharge;
    }

    // Overriding the toString method to provide a string representation of the Procedure object
    public String toString() {
        return String.format("Procedure name: %s\nProcedure date: %s\nProcedure charge: $%,.2f", 
                             this.getProcedureName(), 
                             this.getProcedureDate(), 
                             this.getProcedureCharge());
    }
}

