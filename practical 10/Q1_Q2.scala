class Rational(x: Int, y: Int) {
    def numer = x;
    def denom = y;
    def neg = new Rational(-this.numer, this.denom);
    def sub (r: Rational) = new Rational(this.numer * r.denom - r.numer * this.denom, this.denom * r.denom);
}

object Rational extends App {
    val x = new Rational(3, 4);
    val y = new Rational(5, 8);
    val z = new Rational(2, 7);
    println("Negative of " + x.numer + "/" + x.denom + " is " + x.neg.numer + "/" + x.neg.denom);
    val result = x.sub(y).sub(z);
    println(x.numer + "/" + x.denom + " - " + y.numer + "/" + y.denom + " - " + z.numer + "/" + z.denom + " = " + result.numer + "/" + result.denom);
}