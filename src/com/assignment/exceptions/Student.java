package com.assignment.exceptions;

import com.assignment.exceptions.InvalidAgeException;
import com.assignment.exceptions.InvalidIdException;
import com.assignment.exceptions.InvalidNameException;

public class Student {
    public void validateStudent(int id,String name,int age) throws InvalidIdException,
            InvalidNameException, InvalidAgeException {
        if(id<1 || id>1000){
            throw new InvalidIdException("Id not valid!");
        }

        else if(!name.matches("[a-zA-Z]+")){
            throw new InvalidNameException("Name not valid!");
        }
        else if(age<18){
            throw new InvalidAgeException("Invalid age");
        }
        else{
            System.out.println("Valid student!");
        }
    }
}
