package org.com;

public class Statebank implements Rbibank {
@Override
public void saving() {
System.out.println("Saving:2%");	
}@Override
	public void deposit() {
System.out.println("deposit:3%");	
	}
private void fixed() {
System.out.println("fixed is 4%");
}
public static void main(String[] args) {
	Statebank s= new Statebank();
	s.saving();
	s.deposit();
	s.fixed();

}
}
