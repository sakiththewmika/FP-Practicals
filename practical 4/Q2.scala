import scala.io.StdIn.readInt;

object patternMatching{
    def pattern(x : Int) : Unit = x match{
        case x if(x <= 0) => println("Negative/zero");
        case x if(x %2 == 0) => println("Even Number");
        case x if(x %2 != 0) => println("Odd Number");
    }

    def main(args: Array[String]) : Unit = {
        print("Enter an Integer : ");
        val num = readInt();
        pattern(num);
    }
}