public class MainApp {
    public static void main(String[] args) {
        // Create department objects using the constructor
        Department cs = new Department("Computer Science", 300, 250);
        Department ce = new Department("Computer Engineering", 400, 300);
        Department it = new Department("Information Technology", 250, 200);

        Department[] departments = {cs, ce, it};

        int totalStudents = 0;
        int totalAttendance = 0;

        // Process and display department-specific stats
        for (Department dept : departments) {
            totalStudents += dept.getCapacity();
            totalAttendance += dept.getAttendance();

            System.out.println("Total number of students in " + dept.getName() + ": " + dept.getCapacity());
            System.out.println("Percentage of students attendance in " + dept.getName() + ": " + dept.getAttendancePercentage() + "%");
        }

        // Calculate overall university attendance percentage
        float overallPercentage = ((float) totalAttendance / totalStudents) * 100;

        // Display university totals
        System.out.println("Total number of students in the University: " + totalStudents);
        System.out.println("Total number of students Attendance: " + totalAttendance);
        System.out.println("Percentage of students Attendance: " + overallPercentage + "%");
    }

}
