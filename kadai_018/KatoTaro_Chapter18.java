package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{

// コンストラクタで姓と住所を受け取り、スーパークラスに渡します。
	public KatoTaro_Chapter18(String familyName, String address) {
		super(familyName, address); // スーパークラスのコンストラクタを呼び出す
		setGivenName(); // 名を設定
	}
	
//	名を表すフィールドの値をセットする
	public void setGivenName() {
		givenName = "太郎";
	}
	
//	個別の紹介
	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

}
