import java.util.Map;

class Output {			//表示機能
	public void mapOutput() {		//現在の階層を表示
 		System.out.println("\n");
		switch(Gamedata.mapDataLv){		//GamedataクラスのmapData参照
			case 0:System.out.println("あなたは現在、ウトロ街にいます\n");break;
			case 1:System.out.println("あなたは現在、レベル1のダンジョンにいます\n");break;
			case 2:System.out.println("あなたは現在、レベル2のダンジョンにいます\n");break;
			case 3:System.out.println("あなたは現在、レベル3のダンジョンにいます\n");break;
			case 4:System.out.println("あなたは現在、レベル4のダンジョンにいます\n");break;
			case 5:System.out.println("あなたは現在、レベル5のダンジョンにいます\n");break;
		}
		System.out.println("\n");
 	}

	
	public void playerOutput() {		//プレイヤーのステータスと装備武器防具を表示
		System.out.println("\n");
		System.out.println("あなたの現在のステータス");		//GamedataクラスのplayerState参照
		
		for (Map.Entry<String, Integer> entry : Gamedata.playerState.entrySet()) {		//HushMapのget処理
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
							
		System.out.println("あなたが所持している武器は\t"+Gamedata.playerWeapon);
		System.out.println("あなたが所持している防具は\t"+Gamedata.playerArmor);
		System.out.println("\n");
	}
	
	
	public void partyOutput() {		//パーティメンバーのステータスと装備武器防具を表示
		System.out.println("\n");
		if(Gamedata.partyMember[0]==0){		//GamedataクラスのpartyMemberを使った仲間判定
			System.out.println("あなたには、まだ仲間がいません\n");
			System.out.println("\n");
		}				
							
		else if(Gamedata.partyMember[2]==1){		//3人仲間がいる
			System.out.println("パーティメンバーのステータス\n");
			System.out.println("盗賊のステータス");
			for (Map.Entry<String, Integer> entry : Gamedata.fighterBState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("盗賊が所持している武器は,"+Gamedata.bWeapon);
			System.out.println("盗賊が所持している防具は,"+Gamedata.bArmor);
			System.out.println("\n");
		
			System.out.println("魔術師のステータス");
			for (Map.Entry<String, Integer> entry : Gamedata.magiState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("魔術師が所持している武器は,"+Gamedata.cWeapon);
			System.out.println("魔術師が所持している防具は,"+Gamedata.cArmor);
			System.out.println("\n");
		
			System.out.println("タラミスのステータス");
			for (Map.Entry<String, Integer> entry : Gamedata.fighterDState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("タラミスが所持している武器は,"+Gamedata.dWeapon);
			System.out.println("タラミスが所持している防具は,"+Gamedata.dArmor);
			System.out.println("\n");
		}
		else if(Gamedata.partyMember[1]==1){		//2人仲間がいる
			System.out.println("パーティメンバーのステータス\n");
			System.out.println("盗賊のステータス");
			for (Map.Entry<String, Integer> entry : Gamedata.fighterBState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("盗賊が所持している武器は,"+Gamedata.bWeapon);
			System.out.println("盗賊が所持している防具は,"+Gamedata.bArmor);
			System.out.println("\n");
		
			System.out.println("魔術師のステータス");
			for (Map.Entry<String, Integer> entry : Gamedata.magiState.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("魔術師が所持している武器は,"+Gamedata.cWeapon);
			System.out.println("魔術師が所持している防具は,"+Gamedata.cArmor);
					System.out.println("\n");
			}
		else if(Gamedata.partyMember[0]==1){		//一人仲間がいる
			System.out.println("盗賊のステータス");
			for (Map.Entry<String, Integer> entry : Gamedata.fighterBState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("盗賊が所持している武器は,"+Gamedata.bWeapon);
			System.out.println("盗賊が所持している防具は,"+Gamedata.bArmor);
			System.out.println("\n");
		}
	}
	
	
	public void moneyOutput() {		//所持金表示
		System.out.println("\n");
		System.out.println("金貨は"+Gamedata.playerState2[2][0]+"枚、所有しています\n");		//金貨枚数
		System.out.println("\n");
	}

	
	public void dateOutput() {		//日付表示
		System.out.println("\n");
		System.out.println("今日の日付は10月"+Gamedata.playerState2[1][0]+"日です\n");			//日付表示
		System.out.println("\n");
	}
	
	
	public void itemOutput() {			//所持アイテム、武器防具を表示
		System.out.println("\n");
		System.out.println("あなたの所持アイテム");		//GamedataクラスのmyItem参照
		for (Map.Entry<String, Integer> entry : Gamedata.myItem.entrySet()) {		//HushMapのget処理
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("\n");
		System.out.println("誰も装備していない所持武器");		//GamedataクラスのmyItem参照
		for (Map.Entry<String, Integer> entry : Gamedata.weaponPos.entrySet()) {		//HushMapのget処理
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("\n");
		System.out.println("誰も装備していない所持防具");		//GamedataクラスのmyItem参照
		for (Map.Entry<String, Integer> entry : Gamedata.armorPos.entrySet()) {		//HushMapのget処理
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("\n");
	}
}