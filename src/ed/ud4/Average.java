package ed.ud4;

import java.util.Random;

public class Average {
    static final int COUNT=20;
    static final int MAX=100;
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        int count = r.nextInt(COUNT);
        int total = 0;

        for (int i=0; i<count; i++){
            int a = r.nextInt(MAX) +1;
            total+= a;
            System.out.println(a + " ");
        }         
        System.out.println("Count = " + count);
        System.out.println("Total = " + total);
        double average = (double) total / count;
        System.out.println("Average = " + average);
        System.out.println("End of program");
        
    }
}