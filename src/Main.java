import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Giovanni Giorgi", 20));
        students.add(new Student("Mario Rossi", 21));
        students.add(new Student("Luigi Verdi", 22));
        students.add(new Student("Giuseppe Neri", 23));
        students.add(new Student("Alberto Bianchi", 24));
        students.add(new Student("Marco Lupi", 20));
        students.add(new Student("Valeria Voraci", 18));
        students.add(new Student("Paolo Blu", 19));
        students.add(new Student("Marisa Venier", 27));
        students.add(new Student("Matteo Corto", 19));
        students.add(new Student("Angelica No", 15));
        students.add(new Student("Sabrina Si", 25));
        students.add(new Student("Claudio Forse", 22));

        students.sort(Comparator.comparing(Student::getName));

        for (Student student : students) {
            System.out.println(student);
        }

    }
}