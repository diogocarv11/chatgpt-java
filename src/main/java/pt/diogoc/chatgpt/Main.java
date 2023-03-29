package pt.diogoc.chatgpt;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.diogoc.chatgpt.model.request.*;
import pt.diogoc.chatgpt.util.ConfigParser;
import pt.diogoc.chatgpt.util.FileUtils;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Map<String, String>	config = ConfigParser.parse("application.properties");
		String greeting = config.get("greeting");
		System.out.println(greeting);
		
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
