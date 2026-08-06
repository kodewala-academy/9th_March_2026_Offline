package com.rapido.request;

public class BookingRequest 
{
	private String mobile;
	private String source;
	private String destination;
	private String ridetype;
	private String amount;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getRidetype() {
		return ridetype;
	}

	public void setRidetype(String ridetype) {
		this.ridetype = ridetype;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
