package com.java.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

  String regex;
  public boolean name(String name) {
    regex = "^[A-Z]{1}[a-z]{2,}$";
    return (validate(regex, name));
  }

  public boolean email(String email) {
    regex = "^[a-zA-Z]+[\\w]*([.|\\-|+][a-zA-Z0-9]+)*@[\\w]{1,5}[.][a-z]{2,3}(.[a-z]{2,3})?$";
    return (validate(regex, email));

  }

  private static boolean validate(String regex, String input) {
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(input);
    return m.matches();
  }
}
