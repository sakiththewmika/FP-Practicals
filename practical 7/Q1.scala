object EvenNumberFilter {
    def filterEvenNumbers(numbers : List[Int]) : List[Int] = {
        return numbers.filter(num => num % 2 == 0);
    }

    def main(args : Array[String]) : Unit = {
        // val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var input = List[Int]();
        var continue = true;
        while (continue) {
        print("Enter a number (0 to stop): ")
        val num = scala.io.StdIn.readInt();
        if (num == 0) {
            continue = false;
        } else {
            input = input :+ num;
        }
        }

        val output = filterEvenNumbers(input);
        println("Even numbers : " + output);
    }
}