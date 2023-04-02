/* ===== X to Power n by Recursion ===== */
 
public class PowerCalByRec {

    // when Stack height is n
    // input parameter will be x and n
    public int calPower(int x, int n) {

        // if power is zero the value becomes 1
        if (n == 0) {
            return 1;
        }
        // zero power anything will be zero..
        if (x == 0) {
            return 0;
        }

        // purpose
        int CalPower = calPower(x, n - 1);
        int Res = x * CalPower;
        return Res;
    }

        // when Stack height is log n
    public int calPowerLogn(int x , int n){

        // if power is zero the value becomes 1
        if (n == 0) {
            return 1;
        }
        // zero power anything will be zero..
        if (x == 0) {
            return 0;
        }

        if( n % 2 == 0){ //if n is even
            return calPower(x, n/2) * calPower(x, n/2);
        }
        else{ // if n is odd
            return calPower(x, n/2) * calPower(x, n/2) * x; 
        }

    }

    public static void main(String[] args) {

        PowerCalByRec pcr = new PowerCalByRec();

        System.out.println("Result of X to the power n (when Stack Height = n) is : "+pcr.calPower(2, 5)); 

        System.out.println("Result of X to the power n (when Stack Height = log n) is : "+pcr.calPower(2, 5)); 

        
    }
}