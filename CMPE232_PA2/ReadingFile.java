import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class ReadingFile {

	public static void main (String[] args)
	{
		//see no path
		int numbers[] = readFiles("integers.txt");
		int n = numbers.length;
		// you need to use Integer[] not int[] in order to use Comparable[]
		Integer[] arr = new Integer[n]; 
		//filling the array with integers coming from the txt file
		for(int i=0; i < n; i++)
		{
			arr[i] = numbers[i];
		}
		printArray(arr);

	}
	private static int[] readFiles(String file) {
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int n = 0;

			while(s.hasNextInt())
			{
				n++;
				s.nextInt();
			}
			int S[] = new int[n];

			Scanner s1 = new Scanner(f);

			for(int i =0; i < S.length; i++)
				S[i] = s1.nextInt();

			return S;

		}
		catch(Exception e) {
			return null;
		}
	}
	public static void printArray(Integer[] arr)

	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
	}
}
