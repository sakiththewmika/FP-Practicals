object LetterCount extends App {
    def countLetterOccurences(words: List[String]): Int = {
        val wordLengths = words.map(_.length)
        val totalLetterCount = wordLengths.reduce((x, y) => x + y)
        return totalLetterCount
    }

    val words = List("apple", "banana", "cherry", "date")
    println("Total letter count: " + countLetterOccurences(words))
}