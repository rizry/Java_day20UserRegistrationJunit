package com.java.day20;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UserRegistrationTest {

  UserRegistration reg = new UserRegistration();

  @Test
  public void testFirstNameStartsWithCapitalLetter_thenHappy() {
    assertTrue(reg.name("Mark"));
  }

  @Test
  public void testFirstNameDoesntStartWithCapitalLetter_thenSad() {
    assertFalse(reg.name("manson"));
  }

  @Test
  public void testLastNameStartsWithCapitalLetter_thenHappy() {
    assertTrue(reg.name("Smith"));
  }

  @Test
  public void testLastNameDoesntStartWithCapitalLetter_thenSad() {
    assertFalse(reg.name("jones"));
  }

}
