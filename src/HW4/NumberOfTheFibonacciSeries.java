package HW4;

    class NumberOfTheFibonacciSeries {
    private static int getNumberOfFibonacciSeries(int n){
        int previous = 0;
        int next = 0;
        int fibo = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i == 0) {
                next = 1;
                fibo = previous + next;
                continue;
            }
            fibo = previous + next;
            previous = next;
            next = fibo;
        }
        return fibo;
    }
    public static void main(String args[])
    {
        int n = 12;
        System.out.println(getNumberOfFibonacciSeries(n));
    }
}


