package com.example.broadcastsmsapiwithclicksend.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.broadcastsmsapiwithclicksend.model.ClickSendCurrency;
import com.example.broadcastsmsapiwithclicksend.model.ClickSendData;
import com.example.broadcastsmsapiwithclicksend.model.ClickSendRequest;
import com.example.broadcastsmsapiwithclicksend.model.ClickSendResponse;
import com.example.broadcastsmsapiwithclicksend.model.ClickSendText;
import com.example.broadcastsmsapiwithclicksend.model.MessageDetails;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Java2JSON {
	
	public static void main(String[] args) throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		
//		MessageDetails messageDetails = new MessageDetails();
//		messageDetails.setMessageBody("Alarm");
//		messageDetails.setContactListOfMultipleNumbers(0);
//		messageDetails.setSendingSource("MyCo");
//		messageDetails.setSmsCampaignName("Spam");
		
//		List<ClickSendText> messages = new ArrayList<>();
//		ClickSendRequest request = new ClickSendRequest();
//		messages.add(new ClickSendText());
//		request.setMessages(messages);
		
		ClickSendResponse response = new ClickSendResponse();
		ClickSendData data = new ClickSendData();
		data.setCurrency(new ClickSendCurrency());
		List<ClickSendText> messages = new ArrayList<>();
		ClickSendText message = new ClickSendText();
		messages.add(message);
		data.setMessages(messages);
		response.setData(data);
		
		String json = ow.writeValueAsString(response);
		
		System.out.println("JSON: " + json);
	}

}
