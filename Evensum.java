import java.io.*;
 class Evensum {
static int calculateEvenSum(int n)
{
    if (n <= 0)
        return 0;
 
    int fibo[] = new int[2 * n + 1];
    fibo[0] = 0; fibo[1] = 1;
    int sum = 0;
    for (int i = 2; i <= 2 * n; i++) {
        fibo[i] = fibo[i - 1] + fibo[i - 2];
        if (i % 2 == 0)
            sum += fibo[i];
    }
    return sum;
}
 public static void main (String[] args) {
            
    int n = 4;
    System.out.println("Even indexed Fibonacci Sum upto "
        + n + " terms: "+
        + calculateEvenSum(n));
 
    }
}
