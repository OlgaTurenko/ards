package com.devsoft.contacts.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 30.04.2016.
 */
public class ContactLogic {
    public static boolean isValidRegex(String str, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
