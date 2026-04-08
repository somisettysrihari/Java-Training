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
        studentlinklist list = new studentlinklist();

        list.addStudent(1, "Hari", 85);
        list.addStudent(2, "somisetty", 90);
        list.addStudent(3, "royal", 88);

        System.out.println("\nAll Students:");
        list.display();

        System.out.println("\nSearch Student:");
        list.search(2);
    }
}