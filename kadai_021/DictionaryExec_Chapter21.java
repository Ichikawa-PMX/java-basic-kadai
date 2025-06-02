package kadai_021;

import java.util.ArrayList;
import java.util.List;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 myDictionary = new Dictionary_Chapter21();
		
		 List<String> searchWords = new ArrayList<>();
		 searchWords.add("apple");
		 searchWords.add("banana");
		 searchWords.add("grape");
		 searchWords.add("orange");
		 
		 for (String word : searchWords) {
	            String japaneseMeaning = myDictionary.searchWord(word);
	            
	          if (japaneseMeaning != null) {
	              System.out.println(word + "の意味は" + japaneseMeaning);
	          } else {
	                System.out.println(word + "は辞書に存在しません");
	            }
	        }
	}

}
