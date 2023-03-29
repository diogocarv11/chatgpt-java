package pt.diogoc.chatgpt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.diogoc.chatgpt.model.request.*;

public class Main {

	public static void main(String[] args) {
		
		OpenAIRequest req = new OpenAIRequest();
		req.setModel("text-davinci-003");
		req.setPrompt("You are and AI\nAI:");
		req.setTemperature(0.5f);
		req.setMaxTokens(60);
		req.setTopP(1.0f);
		req.setFrequencyPenalty(0.5f);
		req.setPresencePenalty(0.5f);
		req.setStop(new String[] { "AI:" });
		
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonPayload = null;
		try {
			jsonPayload = mapper.writeValueAsString(req);
		} catch (JsonProcessingException e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println(jsonPayload);
		
	}

}
