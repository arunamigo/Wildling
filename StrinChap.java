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
	}
}