package array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] Num= {10,3,5,6,89};
	    int largest = Num[0];
	    for(int i=0;i<Num.length;i++) {
	    	if(Num[i]>largest) {
	    		largest=Num[i];
	    	}
	    }
		System.out.println(largest);
		

	}

}
