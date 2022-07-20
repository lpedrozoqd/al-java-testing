package edu.clarape.al.testing;

public class PasswordUtil {

    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG;
    }

    public static SecurityLevel accessPassword(String password){
        return SecurityLevel.WEAK;
    }

}
