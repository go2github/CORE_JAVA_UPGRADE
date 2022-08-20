package org.upgrade.comman_programs;

import java.util.Arrays;
import java.util.List;

public class StringExamples {
    public static void main(String[] args) {



        List<String> stringList= Arrays.asList("sheik","abdulla");
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

        try {
            test();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        String str = "ONE" + 1 + 2;
        System.out.println(str);
        str = 1 + 1 + "kl";
        System.out.println(str);
        foo(null);
        System.out.println(100 + 100 + "Simplilearn");

        System.out.println("E-Learning Company" + 100 + 100);
    }

    public static void foo(Object o) {
        System.out.println("Object argument");
    }

    public static void foo(String s) {
        System.out.println("String argument");
    }

    public static void test() {

        try {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("eeeeeeeeeeeeeeeeee");
            throw new RuntimeException("k");
        } finally {
            System.out.println("finally");
        }
    }
}
