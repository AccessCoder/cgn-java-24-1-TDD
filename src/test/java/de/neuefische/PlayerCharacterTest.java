package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerCharacterTest {


    @BeforeEach
    void resetXY() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
    }

    @Test
    void getX_returnNull_whenTheGameStarted() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getY_returnNull_whenTheGameStarted() {
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void move_shouldSetYTo1_whenCalledWithW(){
        // GIVEN
        String input = "W";
        int expected = 1;
        // WHEN
        PlayerCharacter.move(input);
        int actual = PlayerCharacter.getY();
        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void move_shouldSetYToMinus1_whenCalledWithS(){
        // GIVEN
        String input = "S";
        int expected = -1;
        // WHEN
        PlayerCharacter.move(input);
        int actual = PlayerCharacter.getY();
        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void move_shouldSetXToMinus1_whenCalledWithA(){
        // GIVEN
        String input = "A";
        int expected = -1;
        // WHEN
        PlayerCharacter.move(input);
        int actual = PlayerCharacter.getX();
        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void move_shouldSetXTo1_whenCalledWithD(){
        // GIVEN
        String input = "D";
        int expected = 1;
        // WHEN
        PlayerCharacter.move(input);
        int actual = PlayerCharacter.getX();
        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void move_shouldNotChangeXOrY_whenCalledWithInvalidInput(){
        // GIVEN
        String input = "R";
        int expected = 0;
        // WHEN
        PlayerCharacter.move(input);
        int actualX = PlayerCharacter.getX();
        int actualY = PlayerCharacter.getY();
        // THEN
        Assertions.assertEquals(expected, actualX);
        Assertions.assertEquals(expected, actualY);
    }
}