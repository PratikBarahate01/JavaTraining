package Interfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String str = "welcome to java and java welcome you";
		
		Map<String, Integer> map = new HashMap<>();
		List<String> list = Arrays.asList(str.split(" "));
		
		for (String word : list) {
			 if(map.containsKey(word)) {//Check for the key(word) is there or not in map.
				 int count = map.get(word);//if present, then get the value(count) for that key.
				 count++;//increase that count
				 map.put(word, count);//use put to replace new count
			 }
			 else {
				 map.put(word, 1);//first time adding
			 }
		}
		
		map.forEach((key, value)->{
			System.out.println(key+":"+value);
		});
		
	}
}
