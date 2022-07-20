package edu.clarape.al.testing;

import org.junit.jupiter.api.Test;

import static edu.clarape.al.testing.PasswordUtil.SecurityLevel.MEDIUM;
import static edu.clarape.al.testing.PasswordUtil.SecurityLevel.WEAK;
import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {
    @Test
    public void weak_when_has_less_than_8_letters(){
       assertEquals(WEAK, PasswordUtil.accessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordUtil.accessPassword("abcdefgh"));
    }

    @Test
    public void weak_when_has_letters_and_numbers(){
        assertEquals(MEDIUM, PasswordUtil.accessPassword("abcdefgh123"));
    }






}