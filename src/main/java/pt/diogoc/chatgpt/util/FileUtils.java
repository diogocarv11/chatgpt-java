package pt.diogoc.chatgpt.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	
	public static List<String> readLines(String filePath) throws IOException{
		List<String> result = new ArrayList<>();
		
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		
		String line;
		
		try {
			while ((line = reader.readLine()) != null) {
				result.add(line);
			}
		} catch (IOException e) {
			//catch e opcional neste caso
			throw e;
		} finally /*sempre executado, quer haja erros ou nao */{
			// libertar memoria
			reader.close();
		}
	
		return result;
	}
}
