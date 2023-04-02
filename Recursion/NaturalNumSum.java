class NaturalNumSum {

    // we need input parameter
    public void SumNatNum(int i, int numUpto, int sum) {
        // base condition
        if (i == numUpto) {
            // first add numbers in sum then print..
            sum = sum + i;
            System.out.println(sum);
            return;
        }

        sum = sum + i;
        // Purspose
        SumNatNum(i + 1, numUpto, sum);

        // this statement excecute after all recursive call happpens 
        System.out.println(i);

    }

    public static void main(String[] args) {
        
        NaturalNumSum nns = new NaturalNumSum();

        System.out.println("Sum of numbers form 1 to 5");
        nns.SumNatNum(1, 5, 0);
    }
}