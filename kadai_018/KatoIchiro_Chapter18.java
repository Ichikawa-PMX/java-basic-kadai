package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{

//	名を表すフィールドの値をセットする
	public void setGivenName() {
		givenName = "一郎";
	}
	
//	個別の紹介
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}


}
