object average {
    def getAvg(num1:Int,num2:Int) : Double = (num1+num2) / 2.0

    def main(args:Array[String]) : Unit = {
        println(f"Arithmetic mean of 8 and 9 is : ${getAvg(8,9)}%.2f")
    }
}