package HomeWork3;

import java.util.Comparator;
import java.util.List;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().split(" ")[1].compareTo(o2.getFullName().split(" ")[1]);
    }




}
