// this is Lab0 Intro to java and For loop (Self-Study)
public class Intro2JavaNForLoop {
    
    /*Exercise 1: Complete the method makeMultTable(int M) that generates a multiplication table from an input number M, 
    it shows values of 1M until 12M in this form. Use tab(\t) to make a tab in java.
    X M
    1 M
    2 2M
    ...
    12 12M
    
    */
    public static void makeMultTable(int M)
     {  
        System.out.println("X\tM");
        for(int i = 1; i <= 12; i++){
            System.out.println(i +"\t"+ i*M);
        }
        System.out.println("Done");
    }
    
  /* Exercise 2 Complete the method deductK(int M, iny k) that generates a sequence of positive number 
   M M-k M-2k M-3k ... .      */
    
    public static void deductK(int M, int k)
    {  
        for(int i=0; M-(i*k) >= 0 ; i++ ){
            System.out.print(M-(i*k)+" ");
        }
        System.out.println("Done");
    }
    
  /* Exercise 3 Complete the method makeUpwardRightTriangle(int w) that generates an upward right triangle made by * characters.
    An example of output when w = 4 is as follows.
    *
    **
    ***
    ****
   
    */
    public static void makeUpwardRightTriangle(int w)
    {  
        for(int i=0; i < w ; i++){
            System.out.println(("*").repeat(i+1));
        }
        System.out.println("Done");
    }
    
 /* Exercise 4 Complete the method makeDownwardRightTriangle(int w) that generates a downward right triangle made by * characters.
    An example of output when w = 4 is as follows.
   ****
   ***
   **
   *
   
    */
    
     public static void makeDownwardRightTriangle(int w)
    { 
        for(int i=0; i < w ; i++){
            System.out.println(("*").repeat(w-i));
        }
        System.out.println("Done");
    }
    
/* Exercise 5 Complete the method makeUpwardIsosceles(int w) that generates an upward isosceles made by * characters.
   The shape of the output when w = 4 is as follows.
     
    *
   ***
  *****
 *******
*********
    */
     
    public static void makeUpwardIsosceles(int w)
    {
        for(int i = 0 ; i <= w ; i++) 
        {
            
            String space = ((w-i) > 0) ? ((" ").repeat(w-i)) : "";
            System.out.print(space);
        
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");    
            }
          
            // int j = 0;  
            // String main = (j <= i ) ? (("*").repeat(i+1)) : "";
            // System.err.print(main);

            String mirror = (i > 0 ) ? (("*").repeat(i)) : "";
            System.err.print(mirror);

            System.out.println();
        }
        System.err.println("Done \n");
    } 
    public static void main(String[] args) {
        
    /* Checking Ex1: Remove the below block comment to test your makeMultTable method */
        
        System.out.println("Exercise 1\n");
        System.out.println("makeMultTable(63)");
        System.out.println("Your answer is ");
        makeMultTable(63);
        System.out.println("The Correct answer is ");
        System.out.println( "X\t63\n1\t63\n2\t126\n3\t189\n4\t252\n5\t315\n6\t378\n7\t441\n8\t504\n9\t567\n10\t630\n11\t693\n12\t756");
        System.out.println(); 
  

      
 /* Checking Ex2: Remove the below block comment to test your deductByK method  */
        
        System.out.println("Exercise 2  deductK(105,8)");
        System.out.println("Your answer is ");
        deductK(105,8); 
        System.out.println("The Correct answer is ");
        System.out.println("105 97 89 81 73 65 57 49 41 33 25 17 9 1");
        System.out.println(); 
   
  
/* Checking Ex3: Uncomment the below block comment to test your deductByK method  */
        System.out.println("Exercise 3 makeUpwardRightTriangle(6)");
        System.out.println("Your answer is ");
        makeUpwardRightTriangle(6);
        System.out.println("The Correct answer is ");   
        System.out.println("*\n**\n***\n****\n*****\n******\n");
            

/* Checking Ex4: Remove the below block comment to test your deductByK method  */

        System.out.println("Exercise 4 makeDownwardRightTriangle(5)"); 
        System.out.println("Your answer is ");
        makeDownwardRightTriangle(5);
        System.out.println("The Correct answer is ");   
        System.out.println("*****\n****\n***\n**\n*\n");
         
       
      /* Checking Ex5: Remove the below block comment to test your deductByK method */ 

        System.out.println("Exercise 5 makeUpwardIsosceles(4)");
        System.out.println("Your answer is ");
        makeUpwardIsosceles(4);
        System.out.println("The Correct answer is ");   
        System.out.println("    *\n   ***\n  *****\n *******\n*********\n");  

        
        
    }
    
}