import java.util.Random;//乱数用import

class StartValue{

	public void startPoint(){	//戻り値int のステータス初期値決定メソッド
		System.out.println("サイコロを一つ振り、原戦力ポイントの初期値を決定します");
		int r = new Random().nextInt(6);	//乱数で６種類の数値を決定
		int dais1 = r+1;				//＋１で１～6の数値に変換
		Gamedata.playerState.put("原戦力ポイント　", dais1);//playerStateの値を変更

		System.out.println("サイコロの値は"+dais1+"です");
		System.out.println("原戦力ポイントの初期値は"+dais1+"です");
		System.out.println("");
		
		
		System.out.println("サイコロを一つ振り、原防御ポイントの初期値を決定します");
		r = new Random().nextInt(6);	//乱数で６種類の数値を決定
		int dais2 = r+1;				//＋１で１～6の数値に変換
		Gamedata.playerState.put("原防御力ポイント", dais2);//playerStateの値を変更
		System.out.println("サイコロの値は"+dais2+"です");
		System.out.println("原防御ポイントの初期値は"+dais2+"です");
		System.out.println("");
		

		System.out.println("原体力ポイントの初期値は、15から原戦力ポイントと原防御力ポイントを引いた値を２倍した数値です");
		int vaital = (15-dais1-dais2)*2;		//原体力の計算
		Gamedata.playerState.put("原体力ポイント　", vaital);//playerStateの値を変更
		System.out.println("原体力ポイントの初期値は"+vaital+"になります");
		System.out.println("");
		
	}
	

}
