package com.basicstrong.oops;
import java.util.*;
class College{
    String name;
    private List<Teacher> teacher;
    public College(String name,List<Teacher> teacher){
        this.name = name;
        this.teacher = teacher;
    }
    public List<Teacher> getTeacher(){
        return teacher;
    }
}
class Teacher{
    String name;
    String subject;
    Teacher(String name,String sub){
        this.name = name;
        this.subject = sub;
    }
    @Override
    public String toString(){
        return "[Teacher : "+name+",Subject : "+subject+"]";
    }
}
public class AggregationDemo {
    public static void main(String[] args){
        ArrayList <Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Rohn","Java"));
        teachers.add(new Teacher("John","Python"));
        College college = new College("MyCollege",teachers);
        System.out.println(college.getTeacher());
    }

}
