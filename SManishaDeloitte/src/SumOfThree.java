
public class SumOfThree {

	public static void main(String[] args) {
		int n=51673,sum=0,d;
		while(n!=0)
		{
			d=n%10;
			if(d%2==0)
				sum+=d;
			n=n/10;
		}
		System.out.println("Sum: "+sum);

	}

}
