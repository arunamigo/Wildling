import java.util.*;
public class StrinChap{
	

	public static void main(String[] args) {
	
	int[] NumArray = new int [] {1,2,3,4,5};	//Creates an array of Length 0
	int[] NumArray2 = {5,4,3,2,1};
	System.out.println();
	for (int t=0;t<NumArray.length ; t++)
		System.out.println(NumArray[t] +"\t"+ NumArray2[t]);
	
	int ids[]={1,2,3},types=2; //Legal dcelaration of an array and an int
	for (int a:ids)
		System.out.println(a);
	System.out.println(types);

	System.out.println(Arrays.toString(ids)); //Converts Array into string and prints

	String[] mammals = {"Monkey", "Chimp", "Donkey"};
	System.out.println(Arrays.toString(mammals));
	System.out.println("Length of mammals is " + mammals.length);
	Arrays.sort(mammals);
	System.out.println("After Sort");
	System.out.println(Arrays.toString(mammals));

	String multiDimArray [][] = new String [3][2];
	for (int row=0;row<multiDimArray.length ; row++) {
		for (int col=0;col<multiDimArray[row].length;col++) {
			System.out.println(multiDimArray[row][col]);
		}System.out.println();
	}

	//Another way to create Multi Dim Assymetric array

	int [] [] multiDim2 = new int[3] [];
	multiDim2[0] = new int[3];
	multiDim2[1] = new int[4];
	multiDim2[2] = new int[5];
	for (int row=0;row<multiDim2.length ; row++) {
		for (int col=0;col<multiDim2[row].length;col++) {
			multiDim2[row][col]=row+col;
			System.out.print(multiDim2[row][col]+ "\t" );
		}System.out.println();
		}

		//Using ForEach
		for (int[] u:multiDim2) {
			for (int o: u) {
				System.out.println(o);
			}System.out.println();
			
		}
	}
}