package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		
		    System.out.println("");
		    KatoTaro_Chapter18 taro = new KatoTaro_Chapter18(); 
	        taro.familyName = "加藤"; 
	        taro.setGivenName();
	        taro.address = "東京都千代田区"; 
	        taro.execIntroduce(); 
		
	        
	        System.out.println("");
	        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18(); 
	        ichiro.familyName = "加藤"; 
	        ichiro.setGivenName(); 
	        ichiro.address = "神奈川県横浜市"; 
	        ichiro.execIntroduce(); 


	        System.out.println("");
	        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18(); 
	        hanako.familyName = "加藤"; 
	        hanako.setGivenName(); 
	        hanako.address = "東京都渋谷区"; 
	        hanako.execIntroduce();       
}
}