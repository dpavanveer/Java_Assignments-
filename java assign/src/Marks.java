
public class Marks {
public static void main(String[] args) {
	int s1=56,s2=30,s3=67;
	if(s1>60 && s2>60 && s3>60) {
		System.out.println("Passed");
	}
	else if(s1>60 && s2>60 || s2>60 && s3>60 || s3>60 && s1>60) {
		System.out.println("Promoted");
	}
		else if(s1>60 || s2>60 || s3>60 || s1>60 && s2>60 && s3>60) {
			System.out.println("Failed");
		
	}
}
}
