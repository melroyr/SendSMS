package com.example.broadcastsmsapiwithclicksend.util;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.example.broadcastsmsapiwithclicksend.model.ClickSendRequest;
import com.example.broadcastsmsapiwithclicksend.model.ClickSendResponse;
import com.example.broadcastsmsapiwithclicksend.model.ClickSendText;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class SendSMS {
	
	private String url = "https://rest.clicksend.com/v3/sms/send";
	
	public void sendSMS(ClickSendRequest request) throws JsonProcessingException {
		
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String requestJson = ow.writeValueAsString(request);
		
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    // create auth credentials
	    String authStr = "melroyr@yahoo.com:1F34839E-DABD-915D-241E-27AAA1F7D4B7";
	    String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());
	    headers.add("Authorization", "Basic " + base64Creds);
	    
	    HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
	    RestTemplate restTemplate = new RestTemplate();
	    ClickSendResponse response = restTemplate.postForObject(url, entity, ClickSendResponse.class);
	    System.out.println("HTTP Code: " + response.getHttp_code());
	    System.out.println("Status: " + response.getData().getMessages().get(0).getStatus());
	    
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		SendSMS sms = new SendSMS();
		
		List<ClickSendText> messages = new ArrayList<>();
		ClickSendRequest request = new ClickSendRequest();
		ClickSendText text = new ClickSendText();
		text.setBody("Alarm");
		text.setCustomStering("Str");
		text.setSource("MyCo");
		text.setTo("+15713242339");
		messages.add(text);
		request.setMessages(messages);
		
		sms.sendSMS(request);
	}

}
