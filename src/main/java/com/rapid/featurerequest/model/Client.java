package com.rapid.featurerequest.model;

public enum Client {
	CLIENT_A ("A"),
	CLIENT_B ("B"),
	CLIENT_C ("C");
	
	private String value;

	Client(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
