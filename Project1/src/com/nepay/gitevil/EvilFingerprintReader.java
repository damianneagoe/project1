package com.nepay.gitevil;

public class EvilFingerprintReader {
    byte[] fingerprint;
    private String name;

    public byte[] getFingerprint() {
	return fingerprint;
    }

    public void setFingerprint(byte[] fingerprint) {
	this.fingerprint = fingerprint;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public EvilFingerprintReader(String name) {
	this.name = name;
    }

    public String callOut() {
	System.out.println("Call me Finger!");
	return name;
    }
}
