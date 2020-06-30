//基本になるゲームデータ。ゲーム中はメモリに常駐し、他のクラスから頻繁に参照されたりデータを書き換えられたりするため、staticの修飾子を付けている

import java.util.HashMap;	//HashMap用インポート
import java.util.Map;		//HashMap用インポート
import java.util.LinkedHashMap;	//LinkedHashMap用インポート

class Gamedata{
	//プレイヤーのステータス管理用　LinkedHashMap
	static Map<String,Integer> playerState = new LinkedHashMap<>();		//表示順番が変わらないようにLinkedHashMapを使用。staticイニシャライザを使った初期化
	static{
		playerState.put("原戦力ポイント　",0);playerState.put("武器ポイント　　",0);playerState.put("攻撃力　　　　　",0);
		playerState.put("原防御力ポイント",0);playerState.put("防具ポイント　　",0);playerState.put("防御力　　　　　",0);
		playerState.put("原体力ポイント　",0);playerState.put("体力ポイント　　",2);
	}
	
	//フラグ管理用　LinkedHashMap
	static Map<String,Integer> flagState = new LinkedHashMap<>();
	static{
		flagState.put("A1",0);flagState.put("A2",0);flagState.put("A3",0);flagState.put("A4",0);flagState.put("A5",0);flagState.put("A6",0);flagState.put("A7",0);
		flagState.put("B1",0);flagState.put("B2",0);flagState.put("B3",0);flagState.put("B4",0);flagState.put("B5",0);flagState.put("B6",0);flagState.put("B7",0);
		flagState.put("C1",0);flagState.put("C2",0);flagState.put("C3",0);flagState.put("C4",0);flagState.put("C5",0);flagState.put("C6",0);flagState.put("C7",0);
		flagState.put("D1",0);flagState.put("D2",0);flagState.put("D3",0);flagState.put("D4",0);flagState.put("D5",0);flagState.put("D6",0);flagState.put("D7",0);
		flagState.put("E1",0);flagState.put("E2",0);flagState.put("E3",0);flagState.put("E4",0);flagState.put("E5",0);flagState.put("E6",0);flagState.put("E7",0);
		flagState.put("F1",0);flagState.put("F2",0);flagState.put("F3",0);flagState.put("F4",0);flagState.put("F5",0);flagState.put("F6",0);flagState.put("F7",0);
		flagState.put("G1",0);flagState.put("G2",0);flagState.put("G3",0);flagState.put("G4",0);flagState.put("G5",0);flagState.put("G6",0);flagState.put("G7",0);
		flagState.put("H1",0);flagState.put("H2",0);flagState.put("H3",0);flagState.put("H4",0);flagState.put("H5",0);flagState.put("H6",0);flagState.put("H7",0);
		flagState.put("I1",0);flagState.put("I2",0);flagState.put("I3",0);flagState.put("I4",0);flagState.put("I5",0);flagState.put("I6",0);flagState.put("I7",0);
		flagState.put("J1",0);flagState.put("J2",0);flagState.put("J3",0);flagState.put("J4",0);flagState.put("J5",0);flagState.put("J6",0);flagState.put("J7",0);
	}	

	//プレイヤーのステータス管理用　二次元配列
	static int[][] playerState2 ={
		{0,0,0,0},				//playerState[2]:経験値管理用。A～Dの4要素
		{1},					//playerState[3]:日付管理用。20日間
		{0}					//playerState[4]:所持金管理用。金貨枚数要素１
	};

	
	//B戦士（盗賊）のステータス管理用　LinkedHashMap
	static Map<String,Integer> fighterBState = new LinkedHashMap<>();		
	static{
		fighterBState.put("原戦力ポイント　",0);fighterBState.put("武器ポイント　　",0);fighterBState.put("攻撃力　　　　　",0);
		fighterBState.put("原防御力ポイント",0);fighterBState.put("防具ポイント　　",0);fighterBState.put("防御力　　　　　",0);
		fighterBState.put("原体力ポイント　",0);fighterBState.put("体力ポイント　　",2);
	}
	
	//魔術師のステータス管理用　LinkedHashMap
	static Map<String,Integer> magiState = new LinkedHashMap<>();
	static{
		magiState.put("原防御力ポイント",0);magiState.put("防具ポイント　　",0);magiState.put("防御力　　　　　",0);
		magiState.put("原体力ポイント　",0);magiState.put("体力ポイント　　",2);
	}
	
	//D戦士用ステータス　LinkedHashMap
	static Map<String,Integer> fighterDState = new LinkedHashMap<>();
	static{
		fighterDState.put("原戦力ポイント　",0);fighterDState.put("武器ポイント　　",0);fighterDState.put("攻撃力　　　　　",0);
		fighterDState.put("原防御力ポイント",0);fighterDState.put("防具ポイント　　",0);fighterDState.put("防御力　　　　　",0);
		fighterDState.put("原体力ポイント　",0);fighterDState.put("体力ポイント　　",2);
	}
	
	
	//初めは以下のような三次元配列で考えていたが、ステータスの標準出力に手間がかかるのでHashMapに変更
	//static short[][][] playerState1 ={
	//	{	{0,0,0,0},							//戦力ポイント(現戦力ポイント:0/武器:1/武器ポイント:2/攻撃力:3)
	//		{0,0,0,0},							//防御力ポイント(現防御力ポイント:0/防具:1/防具ポイント:2/防御力:3) 
	//		{0,0}								//現体力ポイント:0/体力:1
	//	},			
	//	{	{0,0,0,0,0,0,0},					//playerState[1]:フラグ管理用。playerState[1][行：A～Jの10行][列:１～７の7列]
	//		{0,0,0,0,0,0,0},
	//		{0,0,0,0,0,0,0},
	//		{0,0,0,0,0,0,0},
	//		{0,0,0,0,0,0,0},
	//		{0,0,0,0,0,0,0},
	//		{0,0,0,0,0,0,0},
	//		{0,0,0,0,0,0,0},
	//		{0,0,0,0,0,0,0},
	//		{0,0,0,0,0,0,0}
	//	},    
	//};

	//現在地データ
	static int mapDataLv =0;
	static int mapDataPara =0;						//所在階層：１、パラグラフ:2
	
	//パーティ判別用　一次元配列
	static int[] partyMember = {0,0,0};				//パーティメンバー確認用 盗賊、魔術師、女戦士の順　未加入:0　加入:1
	
	//所持アイテムデータ　LinkedHashMap
	static Map<String,Integer> myItem = new LinkedHashMap<>();
	

	//装備武器
	static String playerWeapon = "なし";
	static String bWeapon = "なし";
	static String cWeapon = "なし";
	static String dWeapon = "なし";

	//所持武器
	static Map<String,Integer> weaponPos = new LinkedHashMap<>();


	//装備防具
	static String playerArmor = "なし";
	static String bArmor = "なし";
	static String cArmor = "なし";
	static String dArmor = "なし";

	//所持防具
	static Map<String,Integer> armorPos = new LinkedHashMap<>();

}