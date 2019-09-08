import java.math.*;
import java.util.*;

public class Q8Part1 {

 public static void main(String args[]) {

  // generate private key random 6-digit number
  Random random = new Random(); // random
  int numDigits = 6; // number of digits(6)
  double LOG_2 = Math.log(10) / Math.log(2);
  int numBits = (int)(numDigits * LOG_2);
  BigInteger n = new BigInteger(numBits, random); // random number n 

  long a = n.longValue(); // converting BigInteger n to long a; BigInteger n = long a

  System.out.println("New private key is: " + a);
  System.out.println(" ");
  System.out.println("Let's check if a is a prime number:");

  OSQRTNMethod(a); // Time complexity method O(√N) 
 }

 // Time Complexity: O(√N)
 static void OSQRTNMethod(long a) {
  long current_local_time = System.currentTimeMillis(); //runtime
  boolean isPrime = true; // boolean

  // if a is not a prime
  for (int i = 2; i <= Math.sqrt(a); i++) {
   if (a % i == 0) {
    System.out.println("Number " + a + " is not a prime ");
    isPrime = false;
    break;
   }
  }
  // if a is a prime
  if (isPrime)
   System.out.println("Number " + a + " is a prime ");
  System.out.println(" ");
  System.out.println("Runtime: " + (System.currentTimeMillis() - current_local_time) + " millisecond/s"); // print runtime
 }
}
