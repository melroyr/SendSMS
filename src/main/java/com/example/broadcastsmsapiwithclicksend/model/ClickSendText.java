package com.example.broadcastsmsapiwithclicksend.model;

public class ClickSendText {

    private String source;

    private String body;

    private String to;

    private String customStering;
    
    private String schedule;
    private String message_id;
    private int message_parts;
    private double message_price;
    private boolean is_shared_system_number;
    private String country;
    private String carrier;
    private String status;

    public ClickSendText() {
    }

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getCustomStering() {
		return customStering;
	}

	public void setCustomStering(String customStering) {
		this.customStering = customStering;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getMessage_id() {
		return message_id;
	}

	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}

	public int getMessage_parts() {
		return message_parts;
	}

	public void setMessage_parts(int message_parts) {
		this.message_parts = message_parts;
	}

	public double getMessage_price() {
		return message_price;
	}

	public void setMessage_price(double message_price) {
		this.message_price = message_price;
	}

	public boolean isIs_shared_system_number() {
		return is_shared_system_number;
	}

	public void setIs_shared_system_number(boolean is_shared_system_number) {
		this.is_shared_system_number = is_shared_system_number;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
    
}
