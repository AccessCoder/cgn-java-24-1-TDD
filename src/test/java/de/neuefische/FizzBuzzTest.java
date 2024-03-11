package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    /**
     * Methode die einen int übergeben bekommt und einen String returned.
     * - int teilbar durch 3 = "FIZZ" V
     * - int teilbar durch 5 = "BUZZ" V
     * - int teilbar durch 3 & 5 = "FIZZBUZZ" V
     * - Sonst int als String 4 = "4" V
     *
     * Test Driven Development gibt uns die Möglichkeit eine gut getestete
     * Anwendung zu entwickeln.
     * Wir sind dazu gezwungen uns immer wieder mit der Funktionsweise unserer
     * noch nicht existenten Methode auseinander zu setzen und diese anzupassen.
     *
     * Am Ende des ganzen Entwicklungsprozesses haben wir dann eine rundum
     * abgetestete Anwendung.
     */

    @Test
    void play_shouldReturnGivenIntAsString_WhenGiven4(){
        //GIVEN
        int input = 4;
        String expected = "4";
        //WHEN
        String actual = FizzBuzz.play(input);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizz_WhenGiven3(){
        //GIVEN
        int input = 3;
        String expected = "FIZZ";
        //WHEN
        String actual = FizzBuzz.play(input);
        //THEN
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void play_shouldReturnFizz_WhenGiven6(){
        //GIVEN
        int input = 6;
        String expected = "FIZZ";
        //WHEN
        String actual = FizzBuzz.play(input);
        //THEN
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void play_shouldReturnBuzz_WhenGiven5(){
        //GIVEN
        int input = 5;
        String expected = "BUZZ";
        //WHEN
        String actual = FizzBuzz.play(input);
        //THEN
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void play_shouldReturnFizzBuzz_WhenGiven15(){
        //GIVEN
        int input = 15;
        String expected = "FIZZBUZZ";
        //WHEN
        String actual = FizzBuzz.play(input);
        //THEN
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void play_shouldReturnFizz_WhenGivenMinus6(){
        //GIVEN
        int input = -6;
        String expected = "FIZZ";
        //WHEN
        String actual = FizzBuzz.play(input);
        //THEN
        Assertions.assertEquals(expected, actual);

    }

}