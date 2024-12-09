public class StudentStack {
    private Student[] stack;
    private int top;

    public StudentStack(int capacity) {
        stack = new Student[capacity];
        top = -1;
    }

    public void push(Student student) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        stack[++top] = student;
    }

    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stack[top--];
    }

    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }
}
