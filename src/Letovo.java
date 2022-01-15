import java.util.Random;

public class Letovo {

     public static void main(String[] args) {
        int[] a = new int[6]; // 0 0 0 0 0 0
        double x = Math.random();
        System.out.println(x);
        Random r = new Random();
        for(int i=0;i<a.length;i++) {
            a[i] = r.nextInt(100);
        }
        //printArray(a);

      /*  Car bmw = new Car();
        int aa = bmw.a; // 0
         // System.out.println(bmw.flag);
         Intellij IDEA shortcuts
       */
    }
    public static void printArray(int[] x) {
        for(int i=0;i<x.length;i++) {
            System.out.print(x[i] + " ");
        }
    }

}
