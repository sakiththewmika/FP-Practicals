import scala.io.StdIn.readDouble

object InterestCalculator {
    def calculateInterest(deposit: Double): Double = {
        val interestRate = deposit match {
            case d if d <= 20000 => (amount: Double) => amount * 0.02
            case d if d <= 200000 => (amount: Double) => amount * 0.04
            case d if d <= 2000000 => (amount: Double) => amount * 0.035
            case _ => (amount: Double) => amount * 0.065
        }
        interestRate(deposit)
    }

    def main(args: Array[String]): Unit = {
        print("Enter the deposit amount: ")
        val deposit = readDouble()
        println(s"Interest per year for the deposit amount of Rs.$deposit is : ${calculateInterest(deposit)}")
    }
}
