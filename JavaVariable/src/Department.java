public class Department {
    private String name;
    private int capacity;
    private int attendance;

    // Constructor to initialize department details
    public Department(String name, int capacity, int attendance) {
        this.name = name;
        this.capacity = capacity;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAttendance() {
        return attendance;
    }

    // Method to calculate department attendance percentage
    public float getAttendancePercentage() {
        return ((float) attendance / capacity) * 100;
    }
}
