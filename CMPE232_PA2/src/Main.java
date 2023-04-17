//-----------------------------------------------------
// Title: Main class
// Author: Mustafa Baran Ercan
// ID: 28810555206
// Section: 6
// Assignment: 2
// Description: This class defines the Route object class we want to create in Main class.
//-----------------------------------------------------
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Integer numbers1[] = readFilesInt("integers.txt");
	Double numbers2[] = readFilesDouble("doubles.txt");
        
        int len1 = numbers1.length;
	int len2 = numbers2.length;
	
        Integer[] arr1 = new Integer[len1];                                     // arr1 for Integer related parts.
	Double[] arr2 = new Double[len2];                                       // arr2 for Double related parts.
	
        for(int i=0; i < len1; i++) {
            arr1[i] = numbers1[i];
            }
        
	for(int i=0; i < len2; i++) {
            arr2[i] = numbers2[i];
            }
                                                                                // Up to now, we opened and read the files and stored them in arr1 and arr2.
        System.out.println("Integers are reading from the integers.txt file, the array is:");
        printArray(arr1);
        
        Insertion.sort(arr1);
        System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm:");
        printArray(arr1);   System.out.println("Step 1 has been completed.\n");
        
        Insertion.sortDesc(arr1);
        System.out.println("The array of integers that has been sorted in decreasing order by using the insertion sort algorithm:");
        printArray(arr1);   System.out.println("Step 2 has been completed.\n");
        
        System.out.println("Doubles are reading from the doubles.txt file, the array is:");
        printArray(arr2);
        
        Insertion.sort(arr2);
        System.out.println("The array of double values has been sorted in increasing order by using the insertion sort algorithm:");
        printArray(arr2);   System.out.println("Step 3 has been completed.\n");
        
        System.out.println("The original array is:");
        for(int i=0; i < len1; i++) {                                           // Turn arr1 to original form.
            arr1[i] = numbers1[i];
            } printArray(arr1);
        
        Merge.sort(arr1);
        System.out.println("The array of integer values has been sorted in descending order by using the merge sort algorithm is:");
        printArray(arr1);   System.out.println("Step 4 has been completed.\n");
        
        Route[] rArr = new Route[10];                                           // Instantiate Route objects.
        rArr[0] = new Route("Ankara", "Antalya");
        rArr[1] = new Route("Ankara", "Istanbul");
        rArr[2] = new Route("Istanbul", "Izmir");
        rArr[3] = new Route("Izmir", "Antalya");
        rArr[4] = new Route("Antalya", "Ankara");
        rArr[5] = new Route("Ankara", "Izmir");
        rArr[6] = new Route("Izmir", "Ankara");
        rArr[7] = new Route("Istanbul", "Ankara");
        rArr[8] = new Route("Istanbul", "Antalya");
        rArr[9] = new Route("Antalya", "Izmir");
        
        Quick.sort(rArr);
        for (Route route : rArr) {
            System.out.println(route);
        }System.out.println("\nStep 6 has been completed.");

    }
    
    private static Integer[] readFilesInt(String file) {                        // Method to read files.
	try {                                                                   // It needs a string filename as input and returns and Integer array.
            File f = new File(file);
            Scanner s = new Scanner(f);
            int n = 0;
            while(s.hasNextLine()) {
		n++;
		s.nextLine();
		}
            Integer S[] = new Integer[n];
            
            Scanner s1 = new Scanner(f);            
            for(int i =0; i < S.length; i++)
                S[i] = s1.nextInt();            
            return S;

	} catch(FileNotFoundException e) {
            System.out.println("File Not Found!!!");
            return null;
		}
	}
    
    private static Double[] readFilesDouble(String file) {                      // Method to read files.
	try {                                                                   // It needs a string filename as input and returns and Double array.
            File f = new File(file);
            Scanner s = new Scanner(f);
            int n = 0;
            while(s.hasNextLine()) {
		n++;
		s.nextLine();
		}
            Double S[] = new Double[n];
            
            Scanner s1 = new Scanner(f);            
            for(int i =0; i < S.length; i++)
                S[i] = s1.nextDouble();    
            return S;

	} catch(FileNotFoundException e) {
            System.out.println("File Not Found!!!");
            return null;
		}
	}

	public static void printArray(Object[] arr) {
            for (int i = 0; i < arr.length; i++)
		System.out.print(arr[i] + " ");
            System.out.println();
	}
    }
