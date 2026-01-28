class Student {
private int id;
private String name;
private double cgpa;
public Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    setCgpa(cgpa); 
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
          System.out.println("Invalid CGPA for " + name + "! Must be between 0.0 and 4.0. Setting CGPA to 0.0 by default.");
            this.cgpa = 0.0;
        }
    }
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", CGPA: " + cgpa);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "Kabir", 3.7);
        Student s2 = new Student(2, "Santo", 4.5); 
        Student s3 = new Student(3, "Masum", 3.2);
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s2.setCgpa(3.9);
        System.out.println("\nAfter updating Santo's CGPA:");
        s2.displayInfo();
    }
}
