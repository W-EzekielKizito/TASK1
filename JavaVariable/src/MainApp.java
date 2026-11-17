public class MainApp {
    public static void main(String[] args) {
        // Create department objects using the constructor
        Department cs = new Department("Computer Science", 300, 250);
        Department ce = new Department("Computer Engineering", 400, 300);
        Department it = new Department("Information Technology", 250, 200);

        Department[] departments = {cs, ce, it};

        int totalStudents = 0;
        int totalAttendance = 0;
    }
}
