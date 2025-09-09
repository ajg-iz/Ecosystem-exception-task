public class Main {

    public static void main(String[] args) {
        try {
            StudentService studentService = new StudentService();

            Student newStudent = Student.builder()
                    .name("Florian")
                    .subject("Geschichte")
                    .build();

            Student savedStudent = studentService.addNewStudent(newStudent);

            System.out.println("Student saved: " + savedStudent);
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}
