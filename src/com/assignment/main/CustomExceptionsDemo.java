package com.assignment.main;

import com.assignment.exceptions.InvalidAgeException;
import com.assignment.exceptions.InvalidIdException;
import com.assignment.exceptions.InvalidNameException;
import com.assignment.exceptions.Student;

public class CustomExceptionsDemo {
    public static void main(String[] args) {
        Student student = new Student();

        try{
            student.validateStudent(555,"",20);
        }
        catch (InvalidIdException | InvalidNameException | InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally block!");
        }
    }
}
