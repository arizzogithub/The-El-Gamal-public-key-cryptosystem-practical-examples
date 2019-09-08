import java.math.*;
import java.util.*;
import java.io.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.math.BigInteger;

public class ElGamal {
 public static void main(String[] args) {

  BigInteger p, g, a, b, x, y, kA, kB, c, xInv, m; // initialising big integers

  p = new BigInteger("2685735181983467"); // prime number p
  g = new BigInteger("2"); // generator g
  a = new BigInteger("3628323521"); // Alice's private key a
  b = new BigInteger("5915667893"); // Bob's private key b
  // Answer to question 5
  x = g.modPow(a, p); // Alice's public key x
  // Answer on question 5
  y = g.modPow(b, p); // Bob's public key y

  System.out.println("Prime number p: " + p); // print prime number
  System.out.println("Generator g: " + g); // print generator
  System.out.println("Alice's private key a: " + a); // print Alice's private key
  System.out.println("Bob's private key b: " + b); // print Bob's private key 
  System.out.println("Alice's public key x: " + x); // print Alice's public key 
  System.out.println("Bob's public key y: " + y); // print Bob's public key

  // ENCRYPTION

  // Answer to question 5
  kA = y.modPow(a, p); // Alice's shared key k 
  // Answer to question 5
  kB = x.modPow(b, p); // Bob's shared key k 

  System.out.println("Alice's shared key: " + kA); // print Alice's shared key
  System.out.println("Bob's shared key: " + kB); // print Bob's shared key

  // DECRYPTION

  // Answer to question 6
  c = new BigInteger("1580593562655238"); // cypher text "encoded"
  xInv = kA.modInverse(p); // Inverse of x in decryption part
  m = c.multiply(xInv).mod(p); // plain text "encoded"

  System.out.println("Plain text encoded: " + m);

  // Base64 

  Base64.Encoder encoder = Base64.getEncoder();
  byte[] bigIntegerBytes = BigInteger.valueOf(495890948466 L).toByteArray();
  String base64EncodedBigIntegerBytes = encoder.encodeToString(bigIntegerBytes);
  System.out.println("Plain text base64: " + base64EncodedBigIntegerBytes);

  Decoder decoder1 = Base64.getDecoder();
  byte[] bytes = decoder1.decode(base64EncodedBigIntegerBytes);
  String decodedString = new String(bytes, UTF_8);

  System.out.println("Plain text: " + decodedString);
 }
}
