import java.io.*;

class SellandBuy {
	private void sell(){
		try{
			System.out.println("売るアイテムを選んでください");
			System.out.println("1:未装備の武器\n 2:未装備の防具\n 3:黄金のガーゴイル\n 4:黒騎士の髪飾り\n 5:紫水晶\n 6:ブラックオニキス\n 7:売るのをやめる\n");

			String str;
			int num;
			Output opt = new Output(); //Outputクラスのインスタンス化
			
			
			BufferedReader br =	
					new BufferedReader(new InputStreamReader(System.in));
			do{
				str = br.readLine();
				num = Integer.parseInt(str);

				if(num<1 | num>5){
					System.out.println("正しい数字を入力してください");
					continue;
				}
				else{
					switch (num){

						//未装備所持武器の表示
						case 1:
						opt.weaponOutput();	
						System.out.println("売却する武器の名前を入力してください");
						
						str = br.readLine();	//入力値をstrに代入し、
						int myhave = Gamedata.weaponPos.get(str);	//strのキー値から引き出したvalue値を変数に代入

						System.out.println("所持個数は"+mayhave);
						
						System.out.println("いくつ売りますか？");
						str = br.readLine();
						int calc = Integer.parseInt(str);

						//売却計算
						if(mayhave < calc){	//入力値が実際の所持数よりも多い場合はエラー
							System.out.println("所持している個数より多い数が入力されています");
							continue;
						}
						else if(calc < 1){	//１未満の数字が入力されている場合はエラー
							System.out.println("１以上の数字を入力してください");
							continue;
						}
						else {
							Gamedata.playerState2[2][0] += calc * 2;	//武器１つあたり金貨２枚で売却　所持金に追加
							myhave -= calc;					//所持武器の数を減らす

							if(myhave == 0) {				//所持数が0になったらキーを削除
								Gamedata.weaponPos.remove(str);
								System.out.println(calc*2+"枚で売れました。所持金は"+Gamedata.playerState2[2][0]+"になりました");
								System.out.println(str+"の個数は0です");
								System.out.println("\n");
							}
							else {
								Gamedata.weaponPos(str) = myhave;	//所持数が0以外ならvalue値を変更
								System.out.println(calc*2+"枚で売れました。所持金は"+Gamedata.playerState2[2][0]+"になりました");
								System.out.println(str+"の個数は"+myhave+"です");
								System.out.println("\n");
							}

						}
						break;
					
						//未装備所持防具の表示
						case 2:
						opt.armorPos();	
						System.out.println("売却する防具の名前を入力してください");
						
						str = br.readLine();	//入力値をstrに代入し、
						int myhave = Gamedata.armorPos.get(str);	//strのキー値から引き出したvalue値を変数に代入

						System.out.println("所持個数は"+mayhave);
						
						System.out.println("いくつ売りますか？");
						str = br.readLine();
						int calc = Integer.parseInt(str);

						//売却計算
							
						if(mayhave < calc){	//入力値が実際の所持数よりも多い場合はエラー
							System.out.println("所持している個数より多い数が入力されています");
							continue;
						}
						else if(calc < 1){	//１未満の数字が入力されている場合はエラー
							System.out.println("１以上の数字を入力してください");
							continue;
						}
						else {
							Gamedata.playerState2[2][0] += calc * 2;	//武器１つあたり金貨２枚で売却　所持金に追加
							myhave -= calc;					//所持武器の数を減らす

							if(myhave == 0) {				//所持数が0になったらキーを削除
								Gamedata.armorPos.remove(str);
								System.out.println(calc*2+"枚で売れました。所持金は"+Gamedata.playerState2[2][0]+"になりました");
								System.out.println(str+"の個数は0です");
								System.out.println("\n");
							}
							else {
								Gamedata.armorPos(str) = myhave;	//所持数が0以外ならvalue値を変更
								System.out.println(calc*2+"枚で売れました。所持金は"+Gamedata.playerState2[2][0]+"になりました");
								System.out.println(str+"の個数は"+myhave+"です");
								System.out.println("\n");
							}

						}
						break;
 
						//未装備所持防具の表示
						case 3:
							 
						break; 
							
 						//未装備所持防具の表示
						case 4:
							 
						break; 
							
						//未装備所持防具の表示
						case 5:
							 
						break; 
							
						//未装備所持防具の表示
						case 6:
							 
						break; 
				}



			}while(num !== 7);	//7が入力されたら終了

		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}

	}

}
