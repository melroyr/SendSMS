package com.example.broadcastsmsapiwithclicksend.model;

import java.util.List;

public class ClickSendData {

        private double total_price;
        private int total_count;
        private int queued_count;
        private List<ClickSendText> messages;
        private ClickSendCurrency currency;
        private int blocked_count;
        
		public double getTotal_price() {
			return total_price;
		}
		public void setTotal_price(double total_price) {
			this.total_price = total_price;
		}
		public int getTotal_count() {
			return total_count;
		}
		public void setTotal_count(int total_count) {
			this.total_count = total_count;
		}
		public int getQueued_count() {
			return queued_count;
		}
		public void setQueued_count(int queued_count) {
			this.queued_count = queued_count;
		}
		public List<ClickSendText> getMessages() {
			return messages;
		}
		public void setMessages(List<ClickSendText> messages) {
			this.messages = messages;
		}
		public ClickSendCurrency getCurrency() {
			return currency;
		}
		public void setCurrency(ClickSendCurrency currency) {
			this.currency = currency;
		}
		public int getBlocked_count() {
			return blocked_count;
		}
		public void setBlocked_count(int blocked_count) {
			this.blocked_count = blocked_count;
		}
}
