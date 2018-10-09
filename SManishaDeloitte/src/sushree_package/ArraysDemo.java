package sushree_package;

public class ArraysDemo {
	public static void main(String[] args)
	{
		Marker[] m;
		m=new Marker[3];
	System.out.println(m[2].getPrice());
		
	}
public static void main1(String[] args)
{
	int[] a={10,9,7,12,6};
	int size=a.length;
	for(int i=size;i>0;i--)
		for(int j=0;j<size-1;j++)
			
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			
			}
		}
	for(int k=0;k<a.length;k++)
		System.out.println(a[k]+" ");
	System.out.println();
}
}