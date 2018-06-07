package com.timcoville.phone;

public class PhoneTest {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring");
		IPhone iPhone10 = new IPhone("X", 100, "ATT", "ZING");
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		iPhone10.displayInfo();
		System.out.println(iPhone10.ring());
		System.out.println(iPhone10.unlock());
	}
}
