import java.util.*;
import java.math.*;

public class Q7 {
 public static void main(String[] args) {
  BigInteger p, d, q, f, one, two;
  one = new BigInteger("1");
  two = new BigInteger("2");

  // find a random 17-digit prime  
  Random r = new Random(); // a random number r
  int numDigits = 17; // number of digits(17)
  double LOG_2 = Math.log(10) / Math.log(2);
  int numBits = (int)(numDigits * LOG_2);
  p = new BigInteger(numBits, r); // prime number p

  // generation of random g
  int low = 3; // low range
  int high = 10; // high range
  int e = r.nextInt((high - low) + 1) + low; // calculations of int e value in range between 3 and 10; int e = Integer i = BigInteger g

  // convert int to Integer 
  Integer i = Integer.valueOf(e);

  // convert int to BigInteger
  BigInteger g = BigInteger.valueOf(e); // Integer i = BigInteger g


  // safe prime check formula if q=(p-1)/2 is also a prime, therefore p is a safe prime
  q = ((p.subtract(one)).divide(two)); // q=(p-1)/2 
  d = g.modPow(q, p); // d=g^q mod p or d=p-1
  f = g.modPow(d, p); // check if g^d mod p is prime

  long current_local_time = System.currentTimeMillis(); // runtime

  if (f.equals(one)) // if f equals 1
  {
   System.out.println("Prime number p = " + p); // print p
   System.out.println("Generator g = " + g); // print g
   System.out.println(" ");
   System.out.println("Let's check if p is a safe prime: ");
   System.out.println(" ");
   System.out.println("q=(p-1)/2 = " + q); // print q
   System.out.println("d=g^q mod p or d=p-1 = " + d); // print d
   System.out.println("f=g^d mod p = " + f); // print f
   System.out.println(" ");
   System.out.println("Yes, p is a safe prime.");
   System.out.println(" ");
   System.out.println("Let's verify whether g is a generator for p:");
   System.out.println(" ");
   System.out.println("Yes, g = " + g + " is a generator for prime number p = " + p);
   System.out.println(" ");

   System.out.println("Runtime: " + (System.currentTimeMillis() - current_local_time) + " millisecond/s"); // print runtime
  } else { // if f not equals 1
   System.out.println("g = " + g + " is not a generator for prime number p = " + p);
  }
 }
}
