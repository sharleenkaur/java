
public class Odd {

	public static void main(String[] args) {
		

int c=0;
for(int i=1;i<=50;i++){
	for(int j=2;j<i;j++){
		if(i%j==0)
			c++;
	}
	if(c==0 && i!=1)
		System.out.println(i);
	c=0;
}
}
}