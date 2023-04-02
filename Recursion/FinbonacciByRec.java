// fibonacci series upto required number by recursion..

// what is fibonacci series.
// FT = 0, ST = 1, TT = FT+ST = 0+1 = 1.. contineu..

// for going to recursive approach..
// 1. what input is given.. a=0 & b=1 , n=> upto nth term
// what is work... c = a+b
// base case ==> if n == 0... return...
public class FinbonacciByRec {

    public void printFibSeries(int a, int b, int n) {

        // base condition
        if ( n == 0){
            return;
        }
        // purpose or work TT = FT + ST;
        int c = a + b;
        System.out.println(c);
        // here we call method for next term.. but the 
        // input term is last two term.. and go for n-1 calculation
        printFibSeries(b , c , n-1);

    }

    public static void main(String[] args) {

        FinbonacciByRec fbr = new FinbonacciByRec();
        // first declare two term'
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 8;
        // we need to print first two term and we go for n-2 method call
        fbr.printFibSeries(a , b, n-2);

    }

}