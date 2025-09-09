import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void findById_shouldThrowInvalidIdException_whenIdDoesntExists() {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);
        assertThrows(InvalidIdException.class, () -> studentService.findById("lalalala"));
    }
}