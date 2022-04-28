package sdet31;

public class Prime {

	public static void main(String[] args) {
	int[] a= {2,1,3,4,5,1};//1,2
	int fmin=a[0];
	int smin=a[0];
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]<=fmin)
		{
			if(a[i]!=fmin) 
			{
				smin=fmin;
			}
			fmin=a[i];
		}else if(fmin==smin || smin<fmin)
		{
			smin=a[i];
		}
	}
	System.out.println(fmin+" "+smin);
	}
}

	
