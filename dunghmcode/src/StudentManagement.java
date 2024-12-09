public class StudentManagement {
    private StudentLinkedListStack stack;

    public StudentManagement(int capacity) {
        this.stack = new StudentLinkedListStack();
    }

    public void addStudent(String id, String name, double marks) {
        Student student = new Student(id, name, marks);
        stack.push(student);
    }

    public void removeStudent() {
        Student removedStudent = stack.pop();
        if (removedStudent != null) {
            System.out.println("Removed Student: " + removedStudent);
        }
    }

    public void searchStudent(String id) {
        Student[] students = getAllStudents();
        boolean found = false;

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Found Student: " + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void updateStudent(String id, String newName, double newMarks) {
        Student[] students = getAllStudents();
        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                students[i] = new Student(id, newName, newMarks);
                System.out.println("Student updated: " + students[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void sortStudentsByMarks() {
        Student[] students = getAllStudents();

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getMarks() > students[j].getMarks()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("Students sorted by marks:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayAllStudents() {
        stack.display();
    }

    private Student[] getAllStudents() {
        Node current = stack.top;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        Student[] students = new Student[size];
        current = stack.top;

        for (int i = 0; i < size; i++) {
            students[i] = current.student;
            current = current.next;
        }

        return students;
    }
}
