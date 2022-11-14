
public class Interest {

	public static void main(String args[]) {
		double si,p,r,ci,t;
		
		p=20000;
		r=10;
		t=5;
		si=(p*r*t)/100;
		System.out.println("Simple Interest: "+ si);
		ci=(p*(Math.pow((1+(r/100)),t)))-p;
		String formattedCI=String.format("%.02f",ci);
		System.out.println("Compound Interest: "+formattedCI);
				

	}

}
