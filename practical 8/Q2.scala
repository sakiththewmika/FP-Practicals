import scala.io.StdIn.readInt

object NumberCategorizer {
    def categorizer (num: Int): String = {
        (num % 3, num % 5) match {
            case (0, 0) => "Multiple of both 3 and 5"
            case (0, _) => "Multiple of 3"
            case (_, 0) => "Multiple of 5"
            case (_, _) => "Not a multiple of 3 or 5"
        }
    }

    def main(args: Array[String]): Unit = {
        print("Enter a number: ")
        val num = readInt()
        println(categorizer(num))
    }
}