object cipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val Encrypt = (c: Char, key: Int, alph: String) =>
    alph((alph.indexOf(c.toUpper) + key) % alph.size)

  val Dcrypt = (c: Char, key: Int, alph: String) =>
    alph((alph.indexOf(c.toUpper) - key) % alph.size)


  val cipher = (algo: (Char, Int, String) =>
    Char, s: String, key: Int, alph: String) =>
    s.map(algo(_, key, alph))


  val cipherText=cipher(Encrypt,"harini",1,alphabet)
  println("Encrypted message: "+cipherText)

  println("Original message: "+cipher(Dcrypt,cipherText,1,alphabet));
}

