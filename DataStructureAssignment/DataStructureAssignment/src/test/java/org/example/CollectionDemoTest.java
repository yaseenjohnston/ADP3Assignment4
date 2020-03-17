package org.example;

import org.example.CollectionDemo;
import org.example.Student;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionDemoTest
{

    @Test
    public void mapEqualsTest()
    {
        /*Student s1 = new Student(987123, "Lee", "Stan", 12256);
        Student s2 = s1;
        assertEquals(s1, s2);*/
        //Map
        Map m1 = new HashMap();
        Student student = new Student(51234, "Johnston", "Yaseen", 11011);
        Student student1 = new Student(98765, "Anderson", "Andy", 56245);
        int age;
        m1.put(student.getFirstNames() + " ", age = 21);
        m1.put(student1.getFirstNames() + " ", age = 20);
        Map m2 = m1;
        assertEquals(m1, m2);
    }

    @Test
    public void setEqualsTest(){
        /*Student s1 = new Student(458666, "Bing", "Chandler", 556287);
        assertNotSame("Should not have the same value", s1, new Student(115236, "Bing", "Chandler", 774526));*/

        //Set
        Set s1 = new HashSet();
        Student st1 = new Student(98765, "Anderson", "Andy", 56245);
        Student st2 = new Student(45678, "Jacobs", "Jake", 55058);
        Student st3 = new Student(51234, "Johnston", "Yaseen", 11011);
        s1.add(st1.getLastName());
        s1.add(st2.getLastName());
        s1.add(st3.getLastName());

        Set s2 = s1;
        assertEquals(s1, s2);
    }

    @Test
    public void listEqualsTest(){

        //List
        List l1 = new ArrayList();
        Student stud1 = new Student(98765, "Anderson", "Andy", 56245);
        Student stud2 = new Student(45678, "Jacobs", "Jake", 55058);
        Student stud3 = new Student(51234, "Johnston", "Yaseen", 11011);
        l1.add(stud1.getStudentNum());
        l1.add(stud2.getStudentNum());
        l1.add(stud3.getStudentNum());

        List l2 = l1;
        assertEquals(l1, l2);
    }
}
