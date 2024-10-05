import java.util.Scanner;
// Main class to run the patient management application
public class PatientDriverApp {
    
    public static void main(String[] args) {
        // Initialize a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for patient's first name
        System.out.println("Enter patient first name:");
        String firstName = input.nextLine();

        // Prompt user for patient's middle name
        System.out.println("Enter patient middle name:");
        String middleName = input.nextLine();

        // Prompt user for patient's last name
        System.out.println("Enter patient last name:");
        String lastName = input.nextLine();

        // Additional inputs for address and contact
        System.out.println("Enter street address:");
        String streetAddress = input.nextLine();

        System.out.println("Enter city:");
        String city = input.nextLine();

        System.out.println("Enter state:");
        String state = input.nextLine();

        System.out.println("Enter zip code:");
        int zipCode = input.nextInt(); // Note: Change this to handle non-integer inputs as needed

        System.out.println("Enter phone number:");
        input.nextLine(); // Consume newline left-over
        String phoneNumber = input.nextLine();

        System.out.println("Enter emergency contact name:");
        String emergencyContactName = input.nextLine();

        System.out.println("Enter emergency contact phone number:");
        String emergencyContactPhoneNumber = input.nextLine();

        // Close the input scanner
        input.close();

        // Create a Patient object with the gathered information
        Patient patient = new Patient(firstName, middleName, lastName);
        displayPatient(patient); // Display patient's information

        // Create three Procedure objects with sample data
        Procedure procedure1 = new Procedure("X-ray", "06/12/2023", "Dr. Smith", 200.00);
        Procedure procedure2 = new Procedure("Blood Test", "07/12/2023", "Dr. Brown", 150.00);
        Procedure procedure3 = new Procedure("MRI", "08/12/2023", "Dr. White", 500.00);

        // Display procedures' information
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate total charges for the procedures
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total charges: $%,.2f%n", totalCharges); // Display total charges
        System.out.println("The program was developed by a Student: Johan Mbouwa <04/10/24>")
    }

    /**
     * Method to display the patient's information.
     * 
     * @param patient The patient object whose information needs to be displayed.
     */
    public static void displayPatient(Patient patient) {
        // Print the patient's information using the toString() method of the Patient class
        System.out.println(patient);
    }

    /**
     * Method to display the procedure's information.
     * 
     * @param procedure The procedure object whose information needs to be displayed.
     */
    public static void displayProcedure(Procedure procedure) {
        // Print the procedure's information using the toString() method
        System.out.println(procedure);
    }

    /**
     * This method takes three procedures and returns the total charges.
     * 
     * @param proc1 The first procedure
     * @param proc2 The second procedure
     * @param proc3 The third procedure
     * @return The total charges of the three procedures
     */
    public static double calculateTotalCharges(Procedure proc1, Procedure proc2, Procedure proc3) {
        // Sum the costs of the three procedures and return
        return proc1.getProcedureCharge() + proc2.getProcedureCharge() + proc3.getProcedureCharge();
    }
    
}
