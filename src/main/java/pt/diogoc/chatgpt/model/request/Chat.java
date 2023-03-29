package pt.diogoc.chatgpt.model.request;

import java.util.ArrayList;
import java.util.List;

public class Chat {
	private String prompt; 
	private List<Message> messages;
	
	// CONSTRUTOR
	public Chat() {
		this.messages = new ArrayList<>();
	}
	
	
	// GETTERS AND SETTERS
	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public List<Message> getMessage() {
		return messages;
	}
	
	public void setMessage(List<Message> message) {
		if (messages == null) {
			throw new IllegalArgumentException("messages list cannot be null");
		}
		this.messages = message;
	}

	public void addMessage(Message message) {
		if (this.messages == null) {
			this.messages = new ArrayList<>();
		}
		this.messages.add(message);
	}
	
	
}
