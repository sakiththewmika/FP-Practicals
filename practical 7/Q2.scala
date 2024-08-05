object SquareCalculator {
    def calculateSquares(numbers : List[Int]) : List[Int] = {
        return numbers.map(num => num * num);
    }

    def main(args : Array[String]) : Unit = {
        val input = List(1, 2, 3, 4, 5);
        val output = calculateSquares(input);
        println("Squares : " + output);
    }
}