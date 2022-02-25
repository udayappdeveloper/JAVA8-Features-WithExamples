package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
 
public class Java8PredicateStudentExample {
 
    public static void main(String[] args) {
        List<Student> studentList = createStudentList();
 
        // Filter all male student who have age > 18
        Predicate<Student> predicate1 = s -> s.getGender().equalsIgnoreCase("M") && s.getAge() > 18;
        List<Student> students1 = filterStudents(studentList, predicate1);
        System.out.println("Male students having age > 18 are :" + students1);
 
        // Filer all female student who have age < 18
        Predicate<Student> predicate2 = s -> s.getGender().equalsIgnoreCase("F") && s.getAge() < 18;
        List<Student> students2 = filterStudents(studentList, predicate2);
        System.out.println("Female students having age < 18 are :" + students2);
    }
 
    public static List<Student> filterStudents(List<Student> students, Predicate<Student> predicate) {
        return students.stream().filter(predicate).collect(Collectors.toList());
    }
 
    public static List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1, "Arpit", "M", 19);
        Student s2 = new Student(2, "John", "M", 17);
        Student s3 = new Student(3, "Mary", "F", 14);
        Student s4 = new Student(4, "Martin", "M", 21);
        Student s5 = new Student(5, "Monica", "F", 16);
        Student s6 = new Student(6, "Ally", "F", 20);
 
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        return studentList;
    }
}