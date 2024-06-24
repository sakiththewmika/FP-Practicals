var a = 2
var b = 3
var c = 4
var d = 5
var k = 4.3f
var g = 0

def main(args: Array[String]): Unit = {
    b -= 1
    val exp1 = b * a + c * d
    d -= 1
    val exp2 = a
    a += 1
    val exp3 = -2 * (g - k) + c
    val exp4 = c
    c += 1
    c += 1
    c = c * a
    a += 1
    println("--b * a + c * d-- : " + exp1)
    println("a++ : " + exp2)
    println("-2 * (g - k) + c : " + exp3)
    println("c = c++ : " + exp4)
    println("c = ++c * a++ : " + c)
}