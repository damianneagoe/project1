package com.nepay.gitevil;

public class Starter {

    public static void main(String[] args) {
	EvilFingerprintReader fingerprint = new EvilFingerprintReader("Julia");
	String response = fingerprint.callOut();
	System.out.println("The callout said:" + response + " here!");
	System.out.println("This has been added");
    }

}
