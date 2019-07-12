package com.thoughtworks.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("should return 1 when convert given 1")
    public void should_return_1_when_convert_given_1(){
        //Given
        int number=1;
        //when
        String result=new FizzBuzz().convert(number);
        //Then
        assertEquals(result,"1");
    }
}
