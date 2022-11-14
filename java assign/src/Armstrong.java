
public class Armstrong {
	public static void main(String args[]) {
		int num=153, temp=0,sum=0,rem;
		temp=num;
		while(num>0) {
			
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		
if(temp==sum) {
	System.out.println(sum +" "+ "is a Armstrong Number");
}

	}
}
