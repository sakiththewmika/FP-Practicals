object filterLength {
    def filterLength(strings :List[String]) : List[String] = {
        strings.filter(_.length>5);
    }

    def main(args: Array[String]) : Unit = {
        val stringList = List("Toyota","Nissan","BMW","Audi","Mercedes");
        println(filterLength(stringList));
    }
}