import java.math.*;
import java.util.*;
import java.io.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Q8Part2 {

 public static void main(String[] args) throws IOException {

  BigInteger p, g, a, b, x, y, kA, kB, m, r, z, c, xd, xInverse, md; // initialising BigIntegers

  p = new BigInteger("7216142699972837"); // prime number p
  g = new BigInteger("3"); // generator g
  a = new BigInteger("300889"); // Alice's private key
  b = new BigInteger("288293"); // Bob's private key
  x = g.modPow(a, p); // Alice's public key x calculations
  y = g.modPow(b, p); // Bob's public key y calculations

  System.out.println("Prime number p: " + p); // print prime number
  System.out.println("Generator g: " + g); // print generator
  System.out.println("Alice's private key a: " + a); // print Alice's private key
  System.out.println("Bob's private key b: " + b); // print Bob's private key
  System.out.println(" ");
  System.out.println("Alice's public key x: " + x); // print Alice's public key 
  System.out.println("Bob's public key y: " + y); // print Bob's public key

  // ENCRYPTION
  System.out.println(" ");
  System.out.println("Encryption:");
  System.out.println(" ");
  kA = y.modPow(a, p); // Alice's shared key k calculations
  kB = x.modPow(b, p); // Bob's shared key k calculations
  m = new BigInteger("140359547"); // message m = my SRN number 140359547

  System.out.println("Alice's shared key: " + kA); // print Alice's shared key
  System.out.println("Bob's shared key: " + kB); // print Bob's shared key
  System.out.println("Original message: " + m); // print message m 

  r = g.modPow(kA, p); // r=g^kA mod p calculations; for further calculations, Alice's shared key "kA" will be used as a shared key
  z = x.modPow(kA, p); // z=x^kA mod p calculations
  c = m.multiply(z).mod(p); // c=(m*z)mod p; cypher text calculations 

  System.out.println("Encrypted cypher text c: " + c);

  // DECRYPTION
  System.out.println(" ");
  System.out.println("Decryption:");
  System.out.println(" ");
  xd = r.modPow(a, p); // xd=r^a mod p calculations
  xInverse = xd.modInverse(p); // inverse of x=x mod p=x^-1 calculations
  md = xInverse.multiply(c).mod(p); // md=(x^-1 * c) mod p calculations

  System.out.println("Decrypted message: " + md);

  // Base64 Encoding
  Base64.Encoder encoder = Base64.getEncoder();
  byte[] bigIntegerBytes = BigInteger.valueOf(2261795017164508 L).toByteArray();
  String base64EncodedBigIntegerBytes = encoder.encodeToString(bigIntegerBytes);
  System.out.println("Plain text base64: " + base64EncodedBigIntegerBytes);

  // Base64 Decoding
  Decoder decoder1 = Base64.getDecoder();
  byte[] bytes = decoder1.decode(base64EncodedBigIntegerBytes);
  String decodedString = new String(bytes, UTF_8);
  // System.out.println("Plain text base64: "+ decodedString);
 }
}
