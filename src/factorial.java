public class factorial {
    static int n = 4;
    public static void main(String[] args) {
    System.out.println(factorial( n));
    }

    static int factorial(int n){
      if(n==1){
          return 1;
      }

      return n*factorial(n-1);
    }
}
