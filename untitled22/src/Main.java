import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Alice", 23, 3.5),
                new Student("Bob", 21, 3.8),
                new Student("Charlie", 22, 3.9),
                new Student("David", 24, 3.4),
                new Student("Eve", 20, 3.6)
        ));

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() > 22)
                .collect(Collectors.toList());
        System.out.println("Студенты старше 22 лет:");
        filteredStudents.forEach(System.out::println);

        List<String> studentNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Имена студентов:");
        studentNames.forEach(System.out::println);

        int totalAge = students.stream()
                .map(Student::getAge)
                .reduce(0, Integer::sum);
        System.out.println("Суммарный возраст студентов: " + totalAge);
    }
}
