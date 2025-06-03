package kadai_028;

import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

//	自分のじゃんけんの手を入力する
	public String getMyChoice(){
		Scanner scanner = new Scanner(System.in);
		 String myHand;
		 
		 while (true) { // 有効な入力があるまでループ
	            System.out.println("自分のじゃんけんの手を入力しましょう");
	            System.out.println("グーはrockのrを入力しましょう");
	            System.out.println("チョキはscissorsのsを入力しましょう");
	            System.out.println("パーはpaperのpを入力しましょう");
	            
	            
	            myHand = scanner.next(); // ユーザーの入力を読み込む

	            // 入力が 'r', 's', 'p' のいずれかであることを確認
	            if (myHand.equals("r") || myHand.equals("s") || myHand.equals("p")) {
	                break; // 有効な入力なのでループを抜ける
	            } else {
	                System.out.println("無効な入力です。'r', 's', 'p' のいずれかを入力してください。");
	            }
	        }
		 
		return myHand;
	}
	
	
	
//	対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		  Random random = new Random(); // Randomオブジェクトを作成
	        int randomNumber = random.nextInt(3); // 0, 1, 2 のいずれかの乱数を生成

	        String opponentHand; // 対戦相手の手を格納する変数

	        switch (randomNumber) {
	            case 0:
	                opponentHand = "r"; // 0の場合はグー
	                break;
	            case 1:
	                opponentHand = "s"; // 1の場合はチョキ
	                break;
	            case 2:
	                opponentHand = "p"; // 2の場合はパー
	                break;
	            default:
	                opponentHand = "error"; // 想定外の値の場合（通常は発生しない）
	        }
		
		
		return opponentHand;
	}
	
	
//	じゃんけんを行う
	public 	void playGame() {
		
		// 自分のじゃんけんの手を選ぶ
        String myHand = getMyChoice();
        System.out.println("自分の手は" + convertHandToJapanese(myHand)); // 日本語に変換して表示

        // 対戦相手のじゃんけんの手を乱数で選ぶ
        String opponentHand = getRandom();
        System.out.println("対戦相手の手は" + convertHandToJapanese(opponentHand)); // 日本語に変換して表示
		
        
        // 勝敗判定
        if (myHand.equals(opponentHand)) {
            System.out.println("あいこです");
        } else if ((myHand.equals("r") && opponentHand.equals("s")) ||
                   (myHand.equals("s") && opponentHand.equals("p")) ||
                   (myHand.equals("p") && opponentHand.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
        
        
	}
	
	 // 手を日本語表記に変換するヘルパーメソッド (privateで良い)
    private String convertHandToJapanese(String hand) {
        switch (hand) {
            case "r":
                return "グー";
            case "s":
                return "チョキ";
            case "p":
                return "パー";
            default:
                return "不明";
        }
    }
        public static void main(String[] args) {
	}

}
