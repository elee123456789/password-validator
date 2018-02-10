package com.example.eric.password_validator;

/**
 * Created by Eric on 2018-02-09.
 */

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class Validator
{
    String pw = "";
    String bad = "password";
    String errResponse = "Invalid password";

    public boolean Validator(String pw)
    {

        Pattern digits = Pattern.compile("[0-9]");

        if (pw.equalsIgnoreCase(bad)) //check if the password is password, invalid if yes
        {
            return false;
        }
        else if (pw.length() < 8) //check if password is less than 8, invalid if yes
        {
            return false;
        }
        else if (!digits.matcher(pw).find()) //check if password has a digit
        {
            return false;
        }
        else //passed the other rules
        {
            return true;
        }


    }
    @Test
    public void containDigit()
    {

        assertTrue(Validator("123qwE"));

        assertFalse(Validator("Password"));
        assertFalse(Validator("qwop0987"));
        assertFalse(Validator("123qwE"));
    }
}
