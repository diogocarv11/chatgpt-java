package pt.diogoc.chatgpt.model.request;

public class Message {
	private String subject;
	private String content;
	
	public Message() {
		
	}
	
	public Message (String subject, String content) {
		this.subject = subject;
		this.content = content;
	}
	
	//####################
	// GETTERS AND SETTERS
	//####################
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
