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
        assertTrue(reg.password_rule1("jhfbalsb"));
    }

    @Test
    public void testPasswordDoestContainEightCharacters_thenSad() {
        assertFalse(reg.password_rule1("zcdhv"));
    }

    @Test
    public void testPasswordContainsAtLeastOneUpperCaseCharacter_thenHappy() {
        assertTrue(reg.password_rule2("asdhDfbslsb"));
    }

    @Test
    public void testPasswordDoestContainUpperCaseCharacter_thenSad() {
        assertFalse(reg.password_rule2("ascsdfsdfdhv"));
    }

    @Test
    public void testPasswordContainsAtLeastOneNumber_thenHappy() {
        assertTrue(reg.password_rule3("asd8hDfbCslsb"));
    }

    @Test
    public void testPasswordDoestContainNumber_thenSad() {
        assertFalse(reg.password_rule3("ascdsKfsdMfdhv"));
    }

    @Test
    public void testPasswordContainsSpecialCharacters_thenHappy() {
        assertTrue(reg.password_rule4("asd8hDfbCsl%sb"));
    }

    @Test
    public void testPasswordDoestContainSpecialCharacter_thenSad() {
        assertFalse(reg.password_rule4("ascdsAKfsd35MfdHhv"));
    }

}
