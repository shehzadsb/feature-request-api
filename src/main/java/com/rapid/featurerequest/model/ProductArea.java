package com.rapid.featurerequest.model;

public enum ProductArea {
	Policies ("P"),
	Billing ("B"),
	Claims ("C"),
	Reports("R");
	
	private String value;

	ProductArea(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
