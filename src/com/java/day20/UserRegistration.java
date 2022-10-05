package com.java.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

  public boolean name(String name) {
    String regex = "^[A-Z]{1}[a-z]{2,}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(name);
    return matcher.matches();
  }

}
