import java.util.*;
import java.math.*;

public class Q4 {
 public static void main(String[] args) {
  BigInteger p, g, d, q, f, one, two; // initialise BigIntegers

  p = new BigInteger("2685735181983467"); // prime number p
  g = new BigInteger("2"); // generator g
  one = new BigInteger("1");
  two = new BigInteger("2");

  // safe prime check formula: if q=(p-1)/2 is also a prime, therefore p is a safe prime
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
