//-----------------------------------------------------
// Title: Insertion sort class
// Author: Mustafa Baran Ercan
// ID: 28810555206
// Section: 6
// Assignment: 2
// Description: This class defines the Insertion sort algorithm.
//-----------------------------------------------------
public class Insertion {
    
    public static void sort(Comparable[] a) {                                   // Sort a[] into increasing order.
        int len = a.length;
        for (int i = 1; i < len ; i++){                                         // For each i from 0 to N-1, exchange a[i] with the entries 
            for (int j = i; j > 0 && less(a[j], a[j-1]) ; j--) {                 // that are smaller in a[0] through a[i-1].
                exch(a, j, j-1);
            }
        }
    }

     // *IN DECREASING ORDER AND BACKWARDS* //  
    public static void sortDesc(Comparable[] a) {                               // Sort a[] into descending order.
        int len = a.length;
        for (int i = len-2 ; i >= 0 ; i--){                                     // For each i from 0 to N-1, exchange a[i] with the entries 
            for (int j = i; j < len-1 && high(a[j+1], a[j]) ; j++) {            // that are smaller in a[0] through a[i-1].
                exch(a, j, j+1);
            }
        }
    }
    
    private static boolean less(Comparable v, Comparable w) {                   // Checks if the given element v is lesser than w or not.
        return v.compareTo(w) < 0;                                              // If lesser return T, else F.
    } 
    
    private static boolean high(Comparable v, Comparable w) {                   // Checks if the given element v is lesser than w or not.
        return v.compareTo(w) > 0;                                              // If lesser return T, else F.
    }
    
        private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i]; a[i] = a[j]; a[j] = temp; 
    }
}

