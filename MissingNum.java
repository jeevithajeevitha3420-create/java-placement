package missing;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] arr= {1,2,3,5,6};
	    int Num = 1;
	    for(int i=0;i<=arr.length;i++ )
	    {
	    if(arr[i]!=Num) {
	    	System.out.println(Num);
	    	break;
	    }
	    Num ++;
	    }
	    }
	    


	}
