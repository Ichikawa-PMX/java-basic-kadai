package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {

		    System.out.println("");
		    // インスタンス作成時に姓と住所をコンストラクタに渡します。
		    KatoTaro_Chapter18 taro = new KatoTaro_Chapter18("加藤", "東京都千代田区");
	        taro.execIntroduce();


	        System.out.println("");
	        // インスタンス作成時に姓と住所をコンストラクタに渡します。
	        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18("加藤", "神奈川県横浜市");
	        ichiro.execIntroduce();


	        System.out.println("");
	        // インスタンス作成時に姓と住所をコンストラクタに渡します。
	        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18("加藤", "東京都渋谷区");
	        hanako.execIntroduce();
	}
}