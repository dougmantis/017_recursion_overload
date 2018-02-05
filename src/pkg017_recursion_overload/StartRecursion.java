
package pkg017_recursion_overload;

/**
 *
 * @author dougm
 * 
 * 
 */
public class StartRecursion {
    
    public static void main(String[] args) {
       
        int n = 0;
        recurseUp(n);
        n = 10;
        recurse(n);
        
        System.out.println();
        int startValue = 0, stopValue = 50;
        recurseEvens(startValue, stopValue);
    }
    
    /**
     * Recurse down to 0
     * 
     * @author dougm
     * 
     * 
     * @param n 
     */
    private static void recurse(int n) {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("This will run " + n + " more times");
        n--;
        if (n >= 0) {
            recurse(n);
        }
    }
        
    /**
     * Recurse up to 10
     * 
     * @author dougm
     * 
     * 
     * @param n 
     */
    private static void recurseUp(int n) {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("This has run " + n + " times");
        n++;
        if (n <= 10) {
            recurseUp(n);
        }
        //System.out.println("This has finished instance number " + n);
    }
        

/**
 * Display evens from start value inclusive to stop value exclusive 
 * 
 * 
 * @param CVal  Start (current) Value
 * @param SVal  Stop Value
 */    
    private static void recurseEvens(int CVal, int SVal) {
                
        if (CVal % 2 != 0) {
            recurseEvens(CVal + 1, SVal);
        } else if (CVal < SVal) {
            System.out.println(CVal);
            recurseEvens(CVal + 2, SVal);
        } else {
            System.out.println("finished");
        }
        
    }
    /**
     * Recurse up by a specific number
     * 
     * @param CVal  Current/start value
     * @param SVal  Stop value
     * @param Step  How many it counts by
     */
    private static void recurseBy(int CVal, int SVal, int Step) {
                
        if (CVal % Step != 0) {
            recurseEvens(CVal + 1, SVal);
        } else if (CVal < SVal) {
            System.out.println(CVal);
            recurseEvens(CVal + Step, SVal);
        } else {
            System.out.println("finished");
        }
        
    }
    /**
     * Recurse by up a specific number, starting from a point other than 0.
     * 
     * @Overload
     * 
     * @param CVal      Current/start value
     * @param SVal      Stop value
     * @param Step      How many it counts by
     * @param Nudge     How much off by 0 it starts from
     */
    private static void recurseBy(int CVal, int SVal, int Step, int Nudge) {
                
        if (CVal % (Step + Nudge) != 0) {
            recurseEvens(CVal + 1, SVal);
        } else if (CVal < SVal) {
            System.out.println(CVal);
            recurseEvens(CVal + Step, SVal);
        } else {
            System.out.println("finished");
        }
        
    }
    

    /*

    @Overload is used when you have two methods with the same name, but different pass parms.
    If I have two 'recurseBy' methods, they still work if they have different parms.
    One could take two ints, and the other could take 3.
    As long as you call the right one with the right paramaters, they will act correctly.
    
    */
}
