import java.io.*;

class DataMeth{
	//ステータス一覧表示処理 Gamedataクラスのデータを入力値によって表示する機能
	public void outState() {
		try{			//例外処理
			int b = 0;
			while(b != 7){			//入力値が7の時終了。1から6ならば以下のcaseの処理を行う
				System.out.println("何を確認しますか？\n 1/現在の場所を確認\n 2/あなたのステータスを確認\n 3/パーティメンバーのステータスを確認\n 4/所持金確認\n 5/日付を確認\n 6/所持アイテムを確認する\n 7/終了する\n 番号を入力してください");
					BufferedReader br =
						new BufferedReader(new InputStreamReader(System.in));
					String str = br.readLine();
					b = Integer.parseInt(str);
					
					if(1>b | b >7) {
							System.out.println("1～7の数字を入力してください");
						continue;
					}
					Output otp = new Output();//Outputクラスのインスタンス化
					switch(b){
						case 1://現在の階層を表示
							otp.mapOutput();
							break;					
						case 2://プレイヤーのステータスと装備武器防具を表示
							otp.playerOutput();
							break;
						case 3://パーティメンバーのステータスと装備武器防具を表示
							otp.partyOutput();
							break;
						case 4://所持金表示
							otp.moneyOutput();
							break;
						case 5://日付表示
							otp.dateOutput();
							break;
						case 6://所持アイテム、武器防具を表示
							otp.itemOutput();
							break;
						}				
					
				}
				System.out.println("ステータス確認を終了します");
				System.out.println("\n");
			
		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
	}
}