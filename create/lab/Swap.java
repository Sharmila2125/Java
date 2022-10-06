class Swap
{

static void swapValuesUsingThirdVariable(double m, int n)
  
  {
        // Swapping the values
        double temp = m;
        m =  (int)n;
         n =  (int )temp;
        System.out.println("Value of m is " + m
                           + " and Value of n is " + n);
    }
 public static void main(String[] args)
    {
        // Random integer values
        double m = 9.5, n = 5;
 
        // Calling above function to
        // reverse the numbers
        swapValuesUsingThirdVariable(m,  (int)n);
    }
}