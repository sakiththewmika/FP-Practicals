object evenSum {
    def sum(integers :List[Int]) : Int = {
        integers.filter(_%2==0).sum
    }

    def main(args :Array[String]) : Unit = {
        val numList = List(1,2,3,4,5,6,7,8,9,10);
        println("The list of integers : " + numList);
        println("The sum of even numbers : " + sum(numList));
    }
}