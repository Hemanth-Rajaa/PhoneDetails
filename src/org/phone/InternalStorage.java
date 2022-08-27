package org.phone;

public class InternalStorage {
private void processorName() {
	System.out.println("Peocessor - Snapdragon");
}
private void ramSize() {
	System.out.println("Ram Size is 6GB");
}
public static void main(String[] args) {
	InternalStorage ins = new InternalStorage();
	ins.processorName();
	ins.ramSize();
	
	ExternalStorage exs = new ExternalStorage();
	exs.size();
}
}
