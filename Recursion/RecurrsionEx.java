/* ========= Recursion Program for Print number 1-5 and 5-1 ========= */

public class RecurrsionEx {

    // ex 1. print number 5 to 1

    // 1. input parameter need to known
    public void printNum(int num) {

        // 2. base conditon is must in case of recurrsion
        if (num == 0) {
            return;
        }

        // 3. Purpose of work..

        // excecuting statement ..
        System.out.println(num);

        // calling recurrsively itself
        printNum(num - 1);
    }

    public void printNum1to5(int num) {

        // 2. base conditon is must in case of recurrsion
        if (num == 6) {
            return;
        }
        // 3. Purpose of work..

        // excecuting statement ..
        System.out.println(num);

        // calling recurrsively itself
        printNum1to5(num + 1);
    }

    public static void main(String[] args) {

        RecurrsionEx rc = new RecurrsionEx();

        System.out.println("Print numbers 5 to 1");
        // input is given 5.
        rc.printNum(5);

        System.out.println("Another print 1 to 5");
        // input is given 1..
        rc.printNum1to5(1);

    }
}

