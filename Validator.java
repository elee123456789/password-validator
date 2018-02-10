package com.example.eric.password_validator;

/**
 * Created by Eric on 2018-02-09.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class Validator
{
    @Test
    public void Validator
    {
        String pw = "";
        String bad = "password";
        String errResponse = "Invalid password";

        if (pw.equalsIgnoreCase(bad)) //check if the password is password, invalid if yes
        {System.out.println(errResponse);}
        else if (pw.length()<8) //check if password is less than 8, invalid if yes
        {System.out.println(errResponse);}
        else //passed the other rules
        {System.out.println("good");}

    }
}
