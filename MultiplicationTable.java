public class MultiplicationTable {

    public static void main(String[] args) {
        int num = 4, i = 1;
        while(i <= 5)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}