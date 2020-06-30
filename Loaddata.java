import java.io.*;
import java.util.HashMap;	//HashMap用インポート
import java.util.Map;		//HashMap用インポート
import java.util.LinkedHashMap;	//LinkedHashMap用インポート
import java.util.ArrayList;

class Loaddata{
	public void loadPlayerState(){			//PlayerStateのデータ読み込み。data_PS.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_PS.txt"));		//ファイル読み込みのためのインスタンス化 data_PS.txtを読みこむ
			
			String str;			//ファイル文字列仮読み込みのための変数
			int[] input = new int[8];	//データを一時的に保存するための一次元配列
				
			for(int i =0; i < input.length; i++){
				str = br.readLine();			//ファイルを一行ずつ読み込む
				input[i] =  Integer.parseInt(str);	//文字列をint化したデータを配列に入力
			}
			Gamedata.playerState.put("原戦力ポイント　",input[0]);Gamedata.playerState.put("武器ポイント　　",input[1]);Gamedata.playerState.put("攻撃力　　　　　",input[2]);
			Gamedata.playerState.put("原防御力ポイント",input[3]);Gamedata.playerState.put("防具ポイント　　",input[4]);Gamedata.playerState.put("防御力　　　　　",input[5]);
			Gamedata.playerState.put("原体力ポイント　",input[6]);Gamedata.playerState.put("体力ポイント　　",input[7]);

			br.close();
			System.out.println("PSデータをロードしました");

		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
	}

	public void loadFlagState(){			//FlagStateのデータ読み込み。data_FS.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_FS.txt"));		//ファイル読み込みのためのインスタンス化 data_FS.txtを読みこむ
			
			String str;			//ファイル文字列仮読み込みのための変数
			int[] input = new int[70];	//データを一時的に保存するための一次元配列 70要素
				
			for(int i =0; i < input.length; i++){
				str = br.readLine();				//ファイルを一行ずつ読み込む
				input[i] =  Integer.parseInt(str);	//文字列をint化したデータを配列に入力
			}

			Gamedata.flagState.put("A1",input[0]);Gamedata.flagState.put("A2",input[1]);Gamedata.flagState.put("A3",input[2]);Gamedata.flagState.put("A4",input[3]);Gamedata.flagState.put("A5",input[4]);Gamedata.flagState.put("A6",input[5]);Gamedata.flagState.put("A7",input[6]);
			Gamedata.flagState.put("B1",input[7]);Gamedata.flagState.put("B2",input[8]);Gamedata.flagState.put("B3",input[9]);Gamedata.flagState.put("B4",input[10]);Gamedata.flagState.put("B5",input[11]);Gamedata.flagState.put("B6",input[12]);Gamedata.flagState.put("B7",input[13]);
			Gamedata.flagState.put("C1",input[14]);Gamedata.flagState.put("C2",input[15]);Gamedata.flagState.put("C3",input[16]);Gamedata.flagState.put("C4",input[17]);Gamedata.flagState.put("C5",input[18]);Gamedata.flagState.put("C6",input[19]);Gamedata.flagState.put("C7",input[20]);
			Gamedata.flagState.put("D1",input[21]);Gamedata.flagState.put("D2",input[22]);Gamedata.flagState.put("D3",input[23]);Gamedata.flagState.put("D4",input[24]);Gamedata.flagState.put("D5",input[25]);Gamedata.flagState.put("D6",input[26]);Gamedata.flagState.put("D7",input[27]);
			Gamedata.flagState.put("E1",input[28]);Gamedata.flagState.put("E2",input[29]);Gamedata.flagState.put("E3",input[30]);Gamedata.flagState.put("E4",input[31]);Gamedata.flagState.put("E5",input[32]);Gamedata.flagState.put("E6",input[33]);Gamedata.flagState.put("E7",input[34]);
			Gamedata.flagState.put("F1",input[35]);Gamedata.flagState.put("F2",input[36]);Gamedata.flagState.put("F3",input[37]);Gamedata.flagState.put("F4",input[38]);Gamedata.flagState.put("F5",input[39]);Gamedata.flagState.put("F6",input[40]);Gamedata.flagState.put("F7",input[41]);
			Gamedata.flagState.put("G1",input[42]);Gamedata.flagState.put("G2",input[43]);Gamedata.flagState.put("G3",input[44]);Gamedata.flagState.put("G4",input[45]);Gamedata.flagState.put("G5",input[46]);Gamedata.flagState.put("G6",input[47]);Gamedata.flagState.put("G7",input[48]);
			Gamedata.flagState.put("H1",input[49]);Gamedata.flagState.put("H2",input[50]);Gamedata.flagState.put("H3",input[51]);Gamedata.flagState.put("H4",input[52]);Gamedata.flagState.put("H5",input[53]);Gamedata.flagState.put("H6",input[54]);Gamedata.flagState.put("H7",input[55]);
			Gamedata.flagState.put("I1",input[56]);Gamedata.flagState.put("I2",input[57]);Gamedata.flagState.put("I3",input[58]);Gamedata.flagState.put("I4",input[59]);Gamedata.flagState.put("I5",input[60]);Gamedata.flagState.put("I6",input[61]);Gamedata.flagState.put("I7",input[62]);
			Gamedata.flagState.put("J1",input[63]);Gamedata.flagState.put("J2",input[64]);Gamedata.flagState.put("J3",input[65]);Gamedata.flagState.put("J4",input[66]);Gamedata.flagState.put("J5",input[67]);Gamedata.flagState.put("J6",input[68]);Gamedata.flagState.put("J7",input[69]);
			br.close();
			System.out.println("FSデータをロードしました");
		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
	}
	
	public void loadPlayerState2(){			//PlayerState2のデータ読み込み。data_PS2.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_PS2.txt"));		//ファイル読み込みのためのインスタンス化 data_PS2.txttを読みこむ
			
			String str;			//ファイル文字列仮読み込みのための変数
			
			for(int x =0; x < Gamedata.playerState2.length; x++){		//二次元配列の1次元目の繰り返し処理
				for(int y =0; y < Gamedata.playerState2[x].length; y++){	//二次元配列の2次元目の繰り返し処理
					str = br.readLine();								//ファイルを一行ずつ読み込む
					Gamedata.playerState2[x][y] =  Integer.parseInt(str);	//文字列をint化したデータを配列に入力
				}
			}
			br.close();
			System.out.println("PS2データをロードしました");
		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
		
	}
	
	public void loadPatyState(){			//PatyStateのデータ読み込み。data_PT.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_PT.txt"));		//ファイル読み込みのためのインスタンス化 data_PT.txtを読みこむ
			
			String str;			//ファイル文字列仮読み込みのための変数
			int[] input = new int[21];	//データを一時的に保存するための一次元配列 21要素 B,D戦士8、魔術師５
				
			for(int i =0; i < input.length; i++){
				str = br.readLine();				//ファイルを一行ずつ読み込む
				input[i] =  Integer.parseInt(str);	//文字列をint化したデータを配列に入力
			}
			//B戦士(盗賊）
			Gamedata.fighterBState.put("原戦力ポイント　",input[0]);Gamedata.fighterBState.put("武器ポイント　　",input[1]);Gamedata.fighterBState.put("攻撃力　　　　　",input[2]);
			Gamedata.fighterBState.put("原防御力ポイント",input[3]);Gamedata.fighterBState.put("防具ポイント　　",input[4]);Gamedata.fighterBState.put("防御力　　　　　",input[5]);
			Gamedata.fighterBState.put("原体力ポイント　",input[6]);Gamedata.fighterBState.put("体力ポイント　　",input[7]);
			
			//魔術師
			Gamedata.magiState.put("原防御力ポイント",input[8]);Gamedata.magiState.put("防具ポイント　　",input[9]);Gamedata.magiState.put("防御力　　　　　",input[10]);
			Gamedata.magiState.put("原体力ポイント　",input[11]);Gamedata.magiState.put("体力ポイント　　",input[12]);
			
			//D戦士
			Gamedata.fighterDState.put("原戦力ポイント　",input[13]);Gamedata.fighterDState.put("武器ポイント　　",input[14]);Gamedata.fighterDState.put("攻撃力　　　　　",input[15]);
			Gamedata.fighterDState.put("原防御力ポイント",input[16]);Gamedata.fighterDState.put("防具ポイント　　",input[17]);Gamedata.fighterDState.put("防御力　　　　　",input[18]);
			Gamedata.fighterDState.put("原体力ポイント　",input[19]);Gamedata.fighterDState.put("体力ポイント　　",input[20]);
			
			br.close();
			System.out.println("PTデータをロードしました");

		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
	}
		
	public void loadOth(){			//その他のデータ読み込み。data_OTH.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_OTH.txt"));		//ファイル読み込みのためのインスタンス化 data_OTH.txtを読みこむ
			
			String str;			//ファイル文字列仮読み込みのための変数
			str = br.readLine();
			Gamedata.mapDataLv = Integer.parseInt(str);
			
			str = br.readLine();
			Gamedata.mapDataPara = Integer.parseInt(str);
			
			for(int i =0; i < Gamedata.partyMember.length; i++){
				str = br.readLine();
				Gamedata.partyMember[i] = Integer.parseInt(str);
			}
			br.close();
			System.out.println("OTHデータをロードしました");
		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
	}
		
	public void loadItem(){			//アイテムのデータ読み込み。data_Itrm.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_Itrm.txt"));		//ファイル読み込みのためのインスタンス化 data_Itrm.txtを読みこむ
			
			
			String str;			//ファイル文字列仮読み込みのための変数
			ArrayList<String> inputS = new ArrayList<String>();	//String型の配列　キー値を一時的に保存
			ArrayList<Integer> inputi = new ArrayList<Integer>();		//int型の配列　value値を一時的に保存
			int i =0;				//配列添え字用
			int j =0;
						
			str = br.readLine();//初めの一行をstrに入力
							
			while(!("終".equals(str))){		//strの値が"終"の時にループ終了。"終"はデータの最後に必ず記録される終了を意味する文字列
				inputS.add(str);			//配列に格納
				str = br.readLine();		//ファイルを一行ずつ読み込む
			}

			
			str = br.readLine();			//value一行読み込み
			int num  =  Integer.parseInt(str);		//文字列をint変換し変数に入力
			while(num  != 99){						//99の値が来たら終わり。99はデータの最後に必ず記録される終了を意味する整数値
				inputi.add(num);					//配列に変数の値を入力
				str = br.readLine();				//ファイルを一行ずつ読み込む
				num = Integer.parseInt(str);
			}


			j=0;			//value用の配列の添え字に0を代入
			for(i = 0; i < inputS.size(); i++){		//キーの配列の大きさまで繰り返す代入処理
				Gamedata.myItem.put(inputS.get(i),inputi.get(j));
				j++;
			}br.close();
			System.out.println("Itemデータをロードしました");
		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
	}
	
	public void loadWeaponAndArmor(){			//武器防具のデータ読み込み。data_WeapArm.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_WeapArm.txt"));		//ファイル読み込みのためのインスタンス化 data_WeapArm.txtを読みこむ

			
			String str;			//以下装備武器の読み込み
			str = br.readLine();
			Gamedata.playerWeapon = str;
			str = br.readLine();
			Gamedata.bWeapon = str;
			str = br.readLine();
			Gamedata.cWeapon = str;
			str = br.readLine();
			Gamedata.dWeapon = str;

			str = br.readLine();		//以下装備防具の読み込み
			Gamedata.playerArmor = str;
			str = br.readLine();
			Gamedata.bArmor = str;
			str = br.readLine();
			Gamedata.cArmor = str;
			str = br.readLine();
			Gamedata.dArmor = str;



			//以下、所持武器リストの読み込み
			ArrayList<String> inputS = new ArrayList<String>();		//String型の配列　キー値を一時的に保存
			ArrayList<Integer> inputi = new ArrayList<Integer>();		//int型の配列　value値を一時的に保存
			int i =0;				//配列添え字用
			int j =0;
						
			str = br.readLine();//初めの一行をstrに入力
							
			while(!("終".equals(str))){		//strの値が"終"の時にループ終了。
				inputS.add(str);			//配列に格納
				str = br.readLine();		//ファイルを一行ずつ読み込む
			}
			
			str = br.readLine();			//value一行読み込み
			int num  =  Integer.parseInt(str);		//文字列をint変換し変数に入力
			while(num  != 99){						//99の値が来たら終わり
				inputi.add(num);					//配列に変数の値を入力
				str = br.readLine();				//ファイルを一行ずつ読み込む
				num = Integer.parseInt(str);
			}

			j=0;			//value用の配列の添え字に0を代入
			for(i = 0; i < inputS.size(); i++){		//キーの配列の大きさまで繰り返す代入処理
				Gamedata.weaponPos.put(inputS.get(i),inputi.get(j));
				j++;
			}



			//以下、所持防具の読み込み			
			str = br.readLine();//初めの一行をstrに入力
							
			while(!("終".equals(str))){		//strの値が"終"の時にループ終了。
				inputS.add(str);			//配列に格納
				str = br.readLine();		//ファイルを一行ずつ読み込む
			}
			
			str = br.readLine();			//value一行読み込み
			num  =  Integer.parseInt(str);		//文字列をint変換し変数に入力
			while(num  != 99){						//99の値が来たら終わり
				inputi.add(num);					//配列に変数の値を入力
				str = br.readLine();				//ファイルを一行ずつ読み込む
				num = Integer.parseInt(str);
			}

			for(; i < inputS.size(); i++){		//キーの配列の大きさまで繰り返す代入処理
				Gamedata.armorPos.put(inputS.get(i),inputi.get(j));
				j++;
			}

			br.close();
			System.out.println("WeapArmデータをロードしました");
		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
	}
}
