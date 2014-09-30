/**
 * Created by Dekey on 30.09.2014.
 */
public class Skl {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
         System.out.print("Первый массив x: ");
          for (int v : x)
           {
            System.out.print(v);
 }
        System.out.println();
         int[]y= {1,2,3};
             System.out.print(" Второй массив y: ");
                 for (int v : y){
                    System.out.print(v);
        }
        System.out.println();
        int []z = {x[0], x[1], x[2], x[3],x[4],y[0],y[1],y[2]};
        System.out.print("Массив x+y: ");
        for (int v:z){
            System.out.print(v);
        }


    }
}