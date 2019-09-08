This assignment takes a practical example for the El Gamal public key cryptosystem.


Task:  Given a unique set of data (JSON file)

{
 "srn": "555555",
 "name": "Anastasia Rizzo",
 "exercise1": {
  "p": "2685735181983467",
  "g": "2",
  "a": "3628323521",
  "b": "5915667893",
  "cipherText": {
   "encoded": "1580593562655238",
   "base64": "BZ2KndYaBg=="
  }
 }
}

Question 4 
Verify whether g is a generator for p. Provide a brief explanation
and include the method from your code, as well as the runtime. 

Question 5 
Considering that a is Alice’s private key and b is Bob’s private
key, compute their public keys and show how they can generate the same shared
key. Include a brief explanation and the relevant code snippet.

Question 6 
Decrypt the provided cipher text which has been encrypted with
the shared key that you computed in Question 5. Include a brief explanation
and the relevant code snippet.

Question 7 
Suppose Alice and Bob want to generate a new set of keys. They
decide that they should use a 17-digit prime instead. How would they go on
about generating a new p and a corresponding generator g? Provide a brief
explanation and include the relevant code snippet, as well as its runtime.

Question 8 
Generate a new set of private and public keys for Alice and Bob,
using the p and g you generated in Question 7. Include a brief explanation and the relevant code snippet.
