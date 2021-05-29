package org.com;

public class OverallTenth implements TenthA,TenthB {

	@Override
	public void scinece() {
System.out.println("science:96");		
	}

	@Override
	public void social() {
System.out.println("social:98");		
	}

	@Override
	public void tamil() {
System.out.println("tamil:99");		
	}

	@Override
	public void english() {
System.out.println("english:91");		
	}

	@Override
	public void maths() {
System.out.println("maths:90");		
	}
public static void main(String[] args) {
	OverallTenth t=new OverallTenth();
			t.tamil();
	t.english();
	t.maths();
	t.scinece();
	t.social();
}
}
