package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MyStudentRecordsMgmtApp {


    public static void main(String[]args){
        Student s1 = new Student("110001","Dave", LocalDate.of(1951,11,18));
        Student s2 = new Student("110002","Anna", LocalDate.of(1990,12,7));
        Student s3 = new Student("110003","Erica", LocalDate.of(1978,1,31));
        Student s4 = new Student("110004","Carlos", LocalDate.of(2009,8,22));
        Student s5 = new Student("110005","Carlos", LocalDate.of(1990,3,5));

        List<Student> st1 = new ArrayList<Student>();

        st1.add(s1);
        st1.add(s2);
        st1.add(s3);
        st1.add(s4);
        st1.add(s5);
        printListOfStudents(st1);

    }
    public static List<Student> printListOfStudents(List<Student> student){
        for (Student student1:student
             ) {
            System.out.println(student1);
        }
        return student;
    }

}
