package com.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public int[] range = IntStream.iterate(1, n -> n + 1).limit(100).toArray();

    public boolean contains3 (int number){
      while(number > 0)
      {
          if(number % 10 == 3)
              return true;

          number = number/10;
      }
      return false; 
} 

    public boolean contains5 (int number){
      while(number > 0)
      {
          if(number % 10 == 5)
              return true;

          number = number/10;
      }
      return false; 
} 

    public String replaceNumber(int number) {

        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        String stringNumber = String.valueOf(number);

        if (isDivisibleBy3 && isDivisibleBy5) return "FizzBuzz";

        if (isDivisibleBy3 || contains3(number)) return "Fizz";

        if (isDivisibleBy5 || contains5(number)) return "Buzz";

        if (!isDivisibleBy3 && !isDivisibleBy5) return stringNumber;

        return null;

    }
    
}
