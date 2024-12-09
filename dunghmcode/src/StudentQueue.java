public class StudentQueue {
    private Node front;
    private Node rear;

    public StudentQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(Student student) {
        Node newNode = new Node(student);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
    }

    public Student dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        Student student = front.student;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return student;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
}
