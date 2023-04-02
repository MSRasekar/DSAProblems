/* ========= Factorial by Recursion ========= */
// factorial formula will be.
// 5! = 5 * 4 * 3 * 2 * 1 = 120
// n * (n-1) * (n-2) * (n-3) * (n-4) * 1

public class FactorialByRecursion {

    // calculate factorial of number
    public int FactorialOfNum(int num) {

        // base condition
        // 1! = 1 also 0! = 1. so base case return 1..
        if (num == 0 || num == 1) {
            return 1;
        }
        // purpose
        // get first num and give another factorial calculation to method for 1 lesser
        // num..
        // 5 * (5-1)! .. i.e 5 * 4!
        return num * FactorialOfNum(num - 1);
    }

    public static void main(String[] args) {

        FactorialByRecursion factorial = new FactorialByRecursion();

        System.out.println("Factorial is: " + factorial.FactorialOfNum(5));

    }
}