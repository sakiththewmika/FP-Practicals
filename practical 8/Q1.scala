object CaeaserCipher {
    def encrypt (text: String, shift: Int): String = {
        text.map{
            case c if c.isLetter =>
                val base = if (c.isUpper) 'A' else 'a'
                ((c - base + shift + 26) % 26 + base).toChar
            case x => x
        }
    }

    def decrypt (text: String, shift: Int): String = {
        return encrypt(text, -shift);
    }

    def cipher (text: String, shift: Int): (String, String) = {
        val encrypted = encrypt(text, shift);
        val decrypted = decrypt(encrypted, shift);
        return (encrypted, decrypted);
    }

    def main(args: Array[String]): Unit = {
        print("Enter a text: ");
        val text = scala.io.StdIn.readLine();
        print("Enter a shift: ");
        val shift = scala.io.StdIn.readInt();
        val (encrypted, decrypted) = cipher(text, shift);
        println(s"Encrypted: $encrypted");
        println(s"Decrypted: $decrypted");
    }
}