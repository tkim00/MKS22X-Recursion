public class Recursion {
  public static void main(String[] args) {
    //sqrt testing
    System.out.println(sqrt(2,.00001));
    System.out.println(sqrt(2,.01));
    System.out.println(sqrt(5,.00001));
    System.out.println(sqrt(100,.00001));
    System.out.println(sqrt(.2,.00001));
    System.out.println(sqrt(.25,.00001));
    //fib testing
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(2));
    System.out.println(fib(3));
    System.out.println(fib(4));

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

  public static int fib(int n) {
    if (n > 1) {
      return fib(n-1) + fib(n-2);
    } else {
      return 1;
    }
  }
}
