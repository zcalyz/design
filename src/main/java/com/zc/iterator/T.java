package com.zc.iterator;

public class T {
	public static void main(String[] args) {
		Client client = new Client();
		Client client1 = client;
		System.out.println(client + "\n" + client1);
	}
}
