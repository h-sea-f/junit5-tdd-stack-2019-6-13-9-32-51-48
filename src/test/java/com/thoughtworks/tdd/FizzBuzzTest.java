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

    @Test
    @DisplayName("should return 2 when convert given 2")
    public void should_return_2_when_convert_given_2(){
        //Given
        int number=2;
        //when
        String result=new FizzBuzz().convert(number);
        //Then
        assertEquals(result,"2");
    }

    @Test
    @DisplayName("should return Fizz when convert given 3")
    public void should_return_Fizz_when_convert_given_3(){
        //Given
        int number=3;
        //when
        String result=new FizzBuzz().convert(number);
        //Then
        assertEquals(result,"Fizz");
    }

    @Test
    @DisplayName("should return Buzz when convert given 5")
    public void should_return_Buzz_when_convert_given_5(){
        //Given
        int number=5;
        //when
        String result=new FizzBuzz().convert(number);
        //Then
        assertEquals(result,"Buzz");
    }

    @Test
    @DisplayName("should return Fizz when convert given 6")
    public void should_return_Fizz_when_convert_given_6(){
        //Given
        int number=6;
        //when
        String result=new FizzBuzz().convert(number);
        //Then
        assertEquals(result,"Fizz");
    }
}
