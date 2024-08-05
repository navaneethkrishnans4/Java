package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student student = new Student("John",23,500);
        Student student1 = new Student("Bob",26,545);
        Student student2 = new Student("William",15,400);
        Student student3 = new Student("Kevin",29,489);
        Student student4 = new Student("Johnson",30,578);
        Student student5 = new Student("Catherine",25,490);
        //create HashSet object and add all the students object inside it
        Set<Student> studentSet = new HashSet<>();
        //return the HashSet object

        studentSet.add(student);
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);

        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        Set<String> treeSet = new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //get all the name and add it inside the TreeSet object
        while(iterator.hasNext())
        {
            treeSet.add(iterator.next().getName());
        }
      //return the TreeSet object;
        return treeSet;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        Map<String, Integer> averageMarks = new HashMap<>();
        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //retrieve the Student object from the iterator
        while(iterator.hasNext()) {
            Student student = iterator.next();
            //Use getter method to get TotalMarks of each student. calculate the average
            int average = student.getTotalMarks() / studentSet.size();
            //add the student name and average marks in the HashMap object created in the
            //first line and return the map
            averageMarks.put(student.getName(), average);

        }
        return averageMarks;
    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
