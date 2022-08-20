package org.upgrade.java8;

import org.upgrade.pojo.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamApi {
    public static void main(String[] args) {
        List<Student> students= Arrays.asList(new Student(1,"sheik"),new Student(2,"abdulla"),new Student(2,"raja"));

        Map<Integer,List<Student>> listMap=students.stream().collect(Collectors.groupingBy(Student::getId));

        System.out.println(listMap);
    }
}
