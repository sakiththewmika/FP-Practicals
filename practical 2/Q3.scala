def NT(hr : Int) : Int = hr * 250

def OT(hr : Int) : Int = hr * 85

def Income(hrs : Int, ot : Int) : Int = NT(hrs) + OT(ot)

def tax (income : Int) : Double = income * 0.12

def takeHome(hrs : Int, ot : Int) : Double = Income(hrs, ot) - tax(Income(hrs, ot))

def main(args: Array[String]): Unit = {
    println("Take home salary is: " + takeHome(40 , 30))
}