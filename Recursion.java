public class Recursion {
  public static void main(String[] args) {
    //sqrt testing
    System.out.println(sqrt(2,.00001));
    System.out.println(sqrt(2,.01));
    System.out.println(sqrt(5,.00001));
    System.out.println(sqrt(100,.00001));
    System.out.println(sqrt(.2,.00001));
    System.out.println(sqrt(.25,.00001));

  }

  public static double sqrt(double n, double tolerance){
    double guess = 1.0;
    return sqrtH(n, tolerance, guess);
  }
  public static double sqrtH(double n, double tolerance, double guess){
    if (((1+tolerance) * guess < ( n / guess + guess) / 2) ||
    ((1-tolerance) * guess > ( n / guess + guess) / 2)){
      return sqrtH(n, tolerance, ( n / guess + guess) / 2);
    } else {
      return guess;
    }
  }
}
