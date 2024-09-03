public class Question5 {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String caretaker;
    private String patientId;
    private int firstTimeVisits;
    private int daysAdmitted;

    public Question5(String firstName, String lastName, String email, String telephone, String caretaker, String patientId, int firstTimeVisits, int daysAdmitted) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.caretaker = caretaker;
        this.patientId = patientId;
        this.firstTimeVisits = firstTimeVisits;
        this.daysAdmitted = daysAdmitted;
    }

    public double calculateConsultancyFee() {
        return firstTimeVisits * 50000;
    }

    public double calculateBedFee() {
        return daysAdmitted * 60000;
    }

    public void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Telephone: " + telephone);
        System.out.println("Caretaker: " + caretaker);
        System.out.println("Consultancy Fee: " + calculateConsultancyFee());
        System.out.println("Bed Fee: " + calculateBedFee());
        System.out.println("Total Fee: " + (calculateConsultancyFee() + calculateBedFee()));
        System.out.println();
    }

    public static void main(String[] args) {
        Question5 patient1 = new Question5("John", "Doe", "john.doe@example.com", "1234567890", "Jane Doe", "P001", 3, 5);
       Question5 patient2 = new Question5("Alice", "Smith", "alice.smith@example.com", "0987654321", "Bob Smith", "P002", 2, 7);
        Question5 patient3 = new Question5("Michael", "Johnson", "michael.johnson@example.com", "1122334455", "Sarah Johnson", "P003", 1, 10);
        Question5 patient4 = new Question5("Emily", "Davis", "emily.davis@example.com", "5566778899", "Tom Davis", "P004", 4, 2);

        patient1.displayDetails();
        patient2.displayDetails();
        patient3.displayDetails();
        patient4.displayDetails();
    }
}