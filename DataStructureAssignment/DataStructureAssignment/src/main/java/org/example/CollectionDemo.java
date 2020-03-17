package org.example;

import java.util.*;

/**
 *
 *
 */
public class CollectionDemo
{

    public static void main( String[] args )
    {
        mapDemo();
        setDemo();
        listDemo();

    }

    public static void mapDemo(){
        //Map
        Map m1 = new HashMap();
        Student student = new Student(51234, "Johnston", "Yaseen", 11011);
        Student student1 = new Student(98765, "Anderson", "Andy", 56245);
        int age;
        m1.put(student.getFirstNames() + " age ", age = 21);
        m1.put(student1.getFirstNames() + " age ", age = 20);
        System.out.print( "Map Elements: " + m1);
    }

    public static void setDemo(){
        //Set
        Set s1 = new HashSet();
        Student st1 = new Student(98765, "Anderson", "Andy", 56245);
        Student st2 = new Student(45678, "Jacobs", "Jake", 55058);
        Student st3 = new Student(51234, "Johnston", "Yaseen", 11011);
        s1.add(st1.getLastName());
        s1.add(st2.getLastName());
        s1.add(st3.getLastName());

        System.out.print("\n\nSet Elements: " + s1);
    }

    public static void listDemo(){
        //List
        List l1 = new ArrayList();
        Student stud1 = new Student(98765, "Anderson", "Andy", 56245);
        Student stud2 = new Student(45678, "Jacobs", "Jake", 55058);
        Student stud3 = new Student(51234, "Johnston", "Yaseen", 11011);
        l1.add(stud1.getStudentNum());
        l1.add(stud2.getStudentNum());
        l1.add(stud3.getStudentNum());

        System.out.print("\n\nList Elements: " + l1);
    }
}
