import java.util.Scanner;

class Student {
    int id;
    String name;
    float marks;
    Student next;

    Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.next = null;
    }
}

class studentlinklist {
    Student head;

    public void addStudent(int id, String name, float marks) {
        Student newStudent = new Student(id, name, marks);

        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }

        System.out.println("Student Added!");
    }

    public void display() {
        if (head == null) {
            System.out.println("No students found!");
            return;
        }

        Student temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id +
                               " Name: " + temp.name +
                               " Marks: " + temp.marks);
            temp = temp.next;
        }
    }

    public void search(int id) {
        Student temp = head;

        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Found: " + temp.name + " - " + temp.marks);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentlinklist list = new studentlinklist();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Marks: ");
            float marks = sc.nextFloat();

            list.addStudent(id, name, marks);
        }

        System.out.println("\nAll Students:");
        list.display();

        System.out.print("\nEnter ID to search: ");
        int searchId = sc.nextInt();
        list.search(searchId);
    }
}