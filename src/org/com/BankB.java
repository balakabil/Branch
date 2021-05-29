package org.com;

public class BankB extends BankA {
@Override
public void account() {
System.out.println("customer account");	

}public static void main(String[] args) {
	BankB b= new BankB();
	b.account();
	b.saving();
}
}
