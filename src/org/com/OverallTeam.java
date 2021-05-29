package org.com;

public class OverallTeam implements TeamA,TeamB{

	@Override
	public void fixed() {
System.out.println("fixed is 3%");		
	}

	@Override
	public void saving() {
System.out.println("savings is 5%");		
	}

	@Override
	public void deposit() {
System.out.println("deposit is 6%");		
	}
public static void main(String[] args) {
	OverallTeam t=new OverallTeam();
			t.fixed();
	t.saving();
	t.deposit();
}
}
