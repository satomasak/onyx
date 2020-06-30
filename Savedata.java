import java.io.*;
import java.util.HashMap;	//HashMap用インポート
import java.util.Map;		//HashMap用インポート
import java.util.LinkedHashMap;	//LinkedHashMap用インポー

class Savedata{

	public void savePlayerState(){			//savePlayerStateメソッド　playerStateをdata_PS.txtに保存
		try{
			
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_PS.txt")));		//プレイヤー情報の保存 data_PS.txtに書き込む
		
				for (Map.Entry<String, Integer> entry : Gamedata.playerState.entrySet()) {		//HushMapのget処理 playerStateの値をすべて書き出す
						pw.println(entry.getValue());
				}
			pw.close(); //以上、data_PS.txtに入力されたデータ
			System.out.println("PSデータのセーブが終わりました");
		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
	}

	public void saveFlagState(){			//saveFlagStateメソッド　flagStateをdata_FS.txtに保存
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_FS.txt")));		//プレイヤー情報の保存 data_FS.txtに書き込む	

				for (Map.Entry<String, Integer> entry : Gamedata.flagState.entrySet()) {		//HushMapのget処理 flagStateの値をすべて書き出す
						pw.println(entry.getValue());
				}
			pw.close(); //以上、data_FS.txtに入力されたデータ
			System.out.println("FSデータのセーブが終わりました");
		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		
		}
	}

	public void savePlayerState2(){			//savePlayerState2メソッド　playerState2をdata_PS2.txtに保存
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_PS2.txt")));		//プレイヤー情報の保存 data_PS2.txtに書き込む


				for (int[] array :Gamedata.playerState2) {						//二次元配列のファイル出力処理 多次元配列の拡張for文を使いplayerState2の値をすべて書き出す
					for(int element :array ){
						pw.println(element);
					}
				}
			pw.close(); //以上、data_PF.txtに入力されたデータ
			System.out.println("PS2データのセーブが終わりました");
		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		
		}
	}

	public void savePatyState(){			//savePatyStateメソッド　パーティメンバーのデータををdata_PT.txtに保存
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_PT.txt")));		//パーティメンバー情報の保存　data_PT.txtに書き込む
		
				for (Map.Entry<String, Integer> entry : Gamedata.fighterBState.entrySet()) {		//HushMapのget処理 B戦士用fighterBStateの値をすべて書き出す
						pw.println(entry.getValue());
				}
			
				for (Map.Entry<String, Integer> entry : Gamedata.magiState.entrySet()) {		//HushMapのget処理 魔術師用magiStateの値をすべて書き出す
							pw.println(entry.getValue());
				}

				for (Map.Entry<String, Integer> entry : Gamedata.fighterDState.entrySet()) {		//HushMapのget処理 D戦士用fighterDStateの値をすべて書き出す
						pw.println(entry.getValue());
				}
		
			pw.close(); //以上、data_PTYF.txtに入力されたデータ
			System.out.println("PTデータのセーブが終わりました");

		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		
		}
	}
	
	public void saveOth(){			//saveOthメソッド　その他のデータををdata_OTH.txtに保存
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_OTH.txt")));		//その他情報の保存　data_OTH.txtに書き込む

				pw.println(Gamedata.mapDataLv);		//所在階層のデータ出力
				pw.println(Gamedata.mapDataPara);	//パラグラフ番号のデータ出力
		
				for(int p :Gamedata.partyMember) pw.println(p);		//パーティメンバー判別用一次元配列のデータ出力　拡張for文

			pw.close(); //以上、data_OTH.txtに入力されたデータ/s
			System.out.println("OTHデータのセーブが終わりました");

		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		
		}
	}
	
	public void saveItrm(){			//saveItrmメソッド　その他のデータををdata_Itrm.txtに保存
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_Itrm.txt")));		//その他情報の保存　data_OTH.txtに書き込む
			
				for (String str : Gamedata.myItem.keySet()) {		//HushMapのget処理 アイテム用myItemのkey値をすべて書き出す
						pw.println(str);
				}
				pw.println("終");//キー値の最終判定のための書き込み
			
				for (int num : Gamedata.myItem.values()) {		//HushMapのget処理 アイテム用myItemのvalue値をすべて書き出す
						pw.println(num);
				}
				pw.println(99);//キー値の最終判定のための書き込み
			
			pw.close();
			System.out.println("Itemデータのセーブが終わりました");

		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		
		}
	}

	public void saveWeaponAndArmor() {			//装備武器、所持武器・装備防具、所持防具のセーブ
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_WeapArm.txt")));		//その他情報の保存　data_WeapArm.txtに書き込む
			
			pw.println(Gamedata.playerWeapon);		//装備武器のデータ出力
			pw.println(Gamedata.bWeapon);
			pw.println(Gamedata.cWeapon);
			pw.println(Gamedata.dWeapon);
		
			pw.println(Gamedata.playerArmor);		//装備防具のデータ出力
			pw.println(Gamedata.bArmor);
			pw.println(Gamedata.cArmor);
			pw.println(Gamedata.dArmor);

			for (String str : Gamedata.weaponPos.keySet()) {		//HushMapのget処理 所持武器用weaponPosのkey値をすべて書き出す
				pw.println(str);
			}
			pw.println("終");//キー値の最終判定のための書き込み
			
			for (int num : Gamedata.weaponPos.values()) {		//HushMapのget処理 所持武器用weaponPosのvalue値をすべて書き出す
				pw.println(num);
			}
			pw.println(99);//キー値の最終判定のための書き込み

			for (String str : Gamedata.armorPos.keySet()) {		//HushMapのget処理 所持防具用armorPosのkey値をすべて書き出す
				pw.println(str);
			}
			pw.println("終");//キー値の最終判定のための書き込み
			
			for (int num : Gamedata.armorPos.values()) {		//HushMapのget処理 所持防具用armorPosのvalue値をすべて書き出す
				pw.println(num);
			}
			pw.println(99);//キー値の最終判定のための書き込み
			
			pw.close();
			System.out.println("WeapArmデータのセーブが終わりました");

		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
	}

}
