package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	private HashMap<String, String> dictionaryMap;
	
	public Dictionary_Chapter21() {
        this.dictionaryMap = new HashMap<String, String>();
		 
		 dictionaryMap.put("apple","りんご");
		 dictionaryMap.put("peach","桃");
		 dictionaryMap.put("banana","バナナ");
		 dictionaryMap.put("lemon","レモン");
		 dictionaryMap.put("pear","梨");
		 dictionaryMap.put("kiwi","キウィ");
		 dictionaryMap.put("strawberry","いちご");
		 dictionaryMap.put("grape","ぶどう");
		 dictionaryMap.put("muscat","マスカット");
		 dictionaryMap.put("cherry","さくらんぼ");
		 


		     
	
}

	public String searchWord(String word) {
		// TODO 自動生成されたメソッド・スタブ
		return dictionaryMap.get(word); 
	}
}