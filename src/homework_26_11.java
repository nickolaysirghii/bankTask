public class homework_26_11 {
    public static void main(String[] args) {


        int p = 10;  // percentage per year.
        int k = 5;  // the number of years the money is kept.
        int x = 1000;  // the amount of money .
        //
        int a = 0;
        //
        for (int i = x; a < k; x += (x / 100) * p) {
            a++;
        }
        System.out.println(x + " This is the amount of money you will receive if you" +
                " keep your money in our Bank for " + k + " years.");


    }
}








