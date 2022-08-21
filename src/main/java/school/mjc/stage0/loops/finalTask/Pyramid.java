package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
       
 
        int rowCount = 1;
 
        System.out.println("Here Is Your Pyramid");
 
        //Implementing the logic
 
        for (int i = cathetusLength; i > 0; i--)
        {
            //Printing i*2 spaces at the beginning of each row
 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j value where j value will be from 1 to rowCount
 
            for (int j = 1; j <= rowCount; j++)          
            {
                System.out.print(j+" ");
            }
 
            //Printing j value where j value will be from rowCount-1 to 1
             
            for (int j = rowCount-1; j >= 1; j--)
            {               
                System.out.print(j+" ");            
            }                       
             
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
