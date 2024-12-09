class Node {
    Student student;
    Node next;

    public Node(Student student) {
        this.student = student;
        this.next = null;
    }
}

public class StudentLinkedListStack {
    Node top;

    public StudentLinkedListStack() {
        this.top = null;
    }

    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
    }

    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        Student poppedStudent = top.student;
        top = top.next;
        return poppedStudent;
    }

    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return top.student;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
}
