package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
       
   int i = 1;

   while (i <= cathetusLength)
    {
        int j = 1;
        while (j<=(cathetusLength-i)*2)
        {
            System.out.print(" ");
            j++;
        }
        int k = i;
        while (k >= 1)
        {
            System.out.print(" "+k);
            k--;
        }
        int l = 2;
        while (l<=i)
        {
            System.out.print(" "+l);
            l++;
        }
        System.out.println();
        i++;
    }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
