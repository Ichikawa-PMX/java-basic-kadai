package kadai_018;

public abstract class Kato_Chapter18 {

		//姓を表す
			public String familyName;
//			名を表す
			public String givenName;
//			住所を表す
			public String address;
			
			// コンストラクタを追加し、姓と住所を初期化できるようにします。
			public Kato_Chapter18(String familyName, String address) {
				this.familyName = familyName;
				this.address = address;
			}
			
			
		//  共通の紹介を出力する
			public void commonIntroduce() {
				 System.out.println("名前は"+familyName+givenName+"です");
				 System.out.println("住所は"+address+"です");
			}
			
//			個別の紹介を出力する
			public abstract void eachIntroduce();
				
//			紹介を実行する
			public void execIntroduce() {
				commonIntroduce();
				eachIntroduce();
			}
	}
