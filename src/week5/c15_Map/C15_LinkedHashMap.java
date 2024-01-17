package week5.c15_Map;

import week5.c08_TreeSet.Student;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class C15_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap <Integer, Student> students = new LinkedHashMap<>();
        students.put(102, new Student("Nehir",12));
        students.put(143,new Student("Ahmet", 100));
        students.put(356,new Student("Bihter", 100));
        students.put(136,new Student("Zehra", 67));
        students.put(839, new Student("Zehra", 23));

        for (Student stu:students.values()) {
            System.out.println(stu.getName());
        }
        System.out.println("-----------------");

        TreeMap <Integer,Student> studentTreeMap = new TreeMap<>(new OrderByNoComparator());
        studentTreeMap.putAll(students);

        for (Student s:studentTreeMap.values() ) {
            System.out.println(s.getName());
        }
    }

}
