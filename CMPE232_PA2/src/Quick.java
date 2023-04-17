//-----------------------------------------------------
// Title: Quick sort class
// Author: Mustafa Baran Ercan
// ID: 28810555206
// Section: 6
// Assignment: 2
// Description: This class defines the Quick Sort algorithm.
//-----------------------------------------------------
public class Quick {

    public static void sort(Comparable[] a) {                                   // sort() method which we use in the main class and which takes an array as an input.
        StdRandom.shuffle(a);                                                   // Eliminate dependence on input.
        sort(a, 0, a.length - 1);                                               // Calls another method named sort() which takes 3 inputs this time.
     }
    private static void sort(Comparable[] a, int lo, int hi) {                  // 
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);                                                           // Sort left part a[lo .. j-1].
        sort(a, j+1, hi);                                                           // Sort right part a[j+1 .. hi].
    }

    private static int partition(Comparable[] a, int lo, int hi) {                  // Partition into a[lo..i-1], a[i], a[i+1..hi].
        int i = lo, j = hi+1;                                                       // left and right scan indices
        Comparable v = a[lo];                                                        // partitioning item
        while (true) {                                                              // Scan right, scan left, check for scan complete, and exchange.
            while (less(a[++i], v))         if (i == hi) break;
            while (less(v, a[--j]))         if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);                                                             // Put v = a[j] into position
        return j;                                                                   // with a[lo..j-1] <= a[j] <= a[j+1..hi].
    }
    private static boolean less(Comparable v, Comparable w) {                   // Checks if the given element v is lesser than w or not.
            return v.compareTo(w) < 0;                                              // If lesser return T, else F.
    }

    private static void exch(Comparable[] a, int i, int j) {
            Comparable temp = a[i]; a[i] = a[j]; a[j] = temp; 
    }
    
    //** DESCENDING ORDER **//
    public static void sortDesc(Comparable[] a) {
        StdRandom.shuffle(a);                                                       // Eliminate dependence on input.
        sortDesc(a, 0, a.length - 1);
     }
    private static void sortDesc(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partitionDesc(a, lo, hi);
        sortDesc(a, lo, j-1);                                                           // Sort left part a[lo .. j-1].
        sortDesc(a, j+1, hi);                                                           // Sort right part a[j+1 .. hi].
    }
    
    private static int partitionDesc(Comparable[] a, int lo, int hi) {                  // Partition into a[lo..i-1], a[i], a[i+1..hi].
        int i = lo, j = hi+1;                                                       // left and right scan indices
        Comparable v = a[lo];                                                        // partitioning item
        while (true) {                                                              // Scan right, scan left, check for scan complete, and exchange.
            while (high(a[++i], v))         if (i == hi) break;
            while (high(v, a[--j]))         if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);                                                             // Put v = a[j] into position
        return j;                                                                   // with a[lo..j-1] <= a[j] <= a[j+1..hi].
    }
    
    private static boolean high(Comparable v, Comparable w) {                   // Checks if the given element v is lesser than w or not.
        return v.compareTo(w) > 0;                                              // If lesser return T, else F.
    }
    
    
    public static void sortWithDepth(Comparable[] a, int depth){
        
    }
}
