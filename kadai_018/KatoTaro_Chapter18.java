package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{

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
