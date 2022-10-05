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

  @Test
  public void testEmailContainsRequiredCharacter_thenHappy() {
    assertTrue(reg.email("markmanson@gmail.co.in"));
  }

  @Test
  public void testEmailDoestContainRequiredCharacter_thenSad() {
    assertFalse(reg.email("jack.sdf.com"));
  }

  @Test
  public void testPhoneNumContainsCountryCodeAndSpace_thenHappy() {
    assertTrue(reg.phone("91 8723476236"));
  }

  @Test
  public void testPhoneNumDoestContainCountryCodeAndSpace_thenSad() {
    assertFalse(reg.phone("8347234823"));
  }

  @Test
  public void testPasswordAtLeastEightCharacters_thenHappy() {
    assertTrue(reg.password("jhfbalsb"));
  }

  @Test
  public void testPasswordDoestContainEightCharacters_thenSad() {
    assertFalse(reg.password("zcdhv"));
  }

}
