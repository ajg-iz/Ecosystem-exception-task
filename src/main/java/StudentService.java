import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student findById(String id) throws InvalidIdException {
        Optional<Student> optionalStudent = repo.findStudentById(id);
        Student student = optionalStudent.orElse(null);
        if (student == null) {
            throw new InvalidIdException("Student with id " + id + " not found");
        } else {
            return student;
        }
    }
}
