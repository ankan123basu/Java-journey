class School {
    public void createStudent(String studentName) {
        class Student {
            public void showStudent() {
                System.out.println("Student Name: " + studentName);
            }
        }
        Student student = new Student();
        student.showStudent();
    }
    public static void main(String[] args) {
        School school = new School();
        school.createStudent("Alice Johnson");
        school.createStudent("Bob Smith");
    }
}
