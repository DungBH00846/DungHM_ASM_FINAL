public class Main {
    public static void main(String[] args) {
        // Initialize the management system with a capacity of 5
        StudentManagement management = new StudentManagement(5);

        // Add 5 students
        management.addStudent("101", "Ha-neul", 6.8);
        management.addStudent("102", "Min-joo", 5.3);
        management.addStudent("103", "Su-rin", 8.1);
        management.addStudent("104", "Yoon-ah", 4.6);
        management.addStudent("105", "Nan-hee", 7.1);

        // Display all students
        System.out.println("List of all students:");
        management.displayAllStudents();

        // Search for a student by ID
        System.out.println("\nSearching for student with ID 103:");
        management.searchStudent("103");

        // Update a student's information
        System.out.println("\nUpdating student with ID 103:");
        management.updateStudent("103", "Su-min", 9.6);
        management.displayAllStudents();

        // Sort students by marks
        System.out.println("\nSorting students by marks:");
        management.sortStudentsByMarks();

        // Remove the first student
        System.out.println("\nRemoving the top student:");
        management.removeStudent();
        management.displayAllStudents();
    }
}
