//-----------------------------------------------------
// Title: Merge class
// Author: Mustafa Baran Ercan
// ID: 28810555206
// Section: 6
// Assignment: 2
// Description: This class is for Merge sort algorithm
//-----------------------------------------------------
public class Merge {                                                            // Merge sort in descending order.
    
    private static Comparable[] aux;
    
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];                                         // Allocate space just once.
        sort(a, 0, a.length - 1);
    }
    
    private static void sort(Comparable[] a, int lo, int hi) {                  // Sort a[lo..hi].
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid);                                                       // Sort left half.
        sort(a, mid+1, hi);                                                     // Sort right half.
        merge(a, lo, mid, hi);                                                  // Merge results.
 } 
    
    public static void merge(Comparable[] a, int lo, int mid, int hi) {         // Merge a[lo..mid] with a[mid+1..hi].
        int i = lo, j = mid+1;
        
        for (int k = lo; k <= hi; k++)                                          // Copy a[lo..hi] to aux[lo..hi].
            aux[k] = a[k];
        
        for (int k = lo; k <= hi; k++)                                          // Merge back to a[lo..hi].
            if (i > mid)                            a[k] = aux[j++];
            else if (j > hi )                       a[k] = aux[i++];
            else if (high(aux[j], aux[i]))          a[k] = aux[j++];
            else                                    a[k] = aux[i++];
    }
    
    private static boolean high(Comparable v, Comparable w) {                   // Checks if the given element v is lesser than w or not.
        return v.compareTo(w) > 0;                                              // If lesser return T, else F.
    }
    
}
