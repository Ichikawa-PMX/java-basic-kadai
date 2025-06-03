package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{

// コンストラクタで姓と住所を受け取り、スーパークラスに渡します。
	public KatoHanako_Chapter18(String familyName, String address) {
		super(familyName, address); // スーパークラスのコンストラクタを呼び出す
		setGivenName(); // 名を設定
	}
		
//	名を表すフィールドの値をセットする
	public void setGivenName() {
		givenName = "花子";
	}
	
//	個別の紹介
	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
