package org.upgrade.exception;

import java.io.*;
import java.text.ParseException;

public class ExceptionExample {
    public static void main(String[] args) {

        Child child = new Child();

        try {
            test1();
        } catch (Exception e) {
            System.out.println("kkkkkkkkk");
          e.printStackTrace();
        }
        child.test();
        try {
            child.test1();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void test1()throws Exception{
        try {
            throw new Exception();
        }catch (Exception e){
            System.out.println("llllllllll");
            throw new Exception();
        }finally {
            System.out.println("ppppppppppp");
        }
    }
}

class Base {

    public void testMethod1() throws IOException {
        File file = new File("test.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }

        }

    }
    public void t2(){

    }

    public void test() throws IOException {
        System.out.println("test");
    }
    public void test1()throws IOException{
        System.out.println("welcccccccccc");
    }
}

class Child extends Base {
    public void sample() {
        System.out.println("this is sample method from child class");
    }

    public void test() {

        System.out.println("welcome");
        throw new NullPointerException();

    }

    @Override
    public void t2() {
        super.t2();
    }

    public void test1()throws IOException{
        throw  new IOException();
    }
    class Parent {
        void doSomething() throws IOException, ParseException {
            // ...
        }

        void doSomethingElse() throws IOException {
            // ...
        }
    }

    class Child1 extends Parent {
        void doSomething() throws IOException {
            // ...
        }


        void doSomethingElse() throws FileNotFoundException, EOFException {
            // ...
        }
    }
}