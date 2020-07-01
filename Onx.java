import java.io.*;


class Onx{		//mainメソッド
	public static void main(String[] args) {
		try{
			
		/*ゲーム開始処理　セーブデータの読み込み、ステータス決定*/
			
			int i;	//whileの終了条件でもあるため、繰り返し処理の外側で変数intを宣言
			
			do{
				System.out.println("セーブデータを読み込み続きからスタートする:1\n"+
						"新しくゲームを始める：2\n"+
						"数字を入力してください\n");

				BufferedReader br =							//標準入力
					new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				i = Integer.parseInt(str);						//外部宣言のiに代入

			//1が入力された時の処理
				if( i == 1){					
					Loaddata ldd = new Loaddata();					//データのロード　Loaddataクラスのインスタンス化、以下メソッドを実行				
					ldd.loadPlayerState();
					ldd.loadFlagState();
					ldd.loadPlayerState2();
					ldd.loadPatyState();
					ldd.loadOth();
					ldd.loadItem();
					ldd.loadWeaponAndArmor();

					String str1;	//whileの終了条件でもあるため、繰り返し処理の外側で変数strを宣言
				
					do{			//入力処理ミス対応。入力値がｙかｎになるまで繰り返し処理を行う
						System.out.println("\n");
						System.out.println("データを確認しますか？Y/N");
						str1 = br.readLine();
				
						if("Y".equals(str1) ^ "y".equals(str1)){	//排他的論理和　Yでもｙでも真になる　A.equals(B)　A,Bの値は互換可能
							DataMeth od = new DataMeth();		//DataMethクラスのインスタンス化
							od.outState();				//ステータス一覧表示処理のメソッドを呼び出す
						}

						else if(str1.equals("N") ^ str1.equals("n")){	//排他的論理和　Nでもnでも真になる
							System.out.println("ゲームを開始します");
						}
						else {
							System.out.println("YかNを入力してください");
						}
					
					}while(!("Y".equals(str1) ^ "y".equals(str1))&!(str1.equals("N") ^ str1.equals("n")));　//y、Y、n、Nのいづれかが入力されたら繰り返し終了
　				
				}

			//2が入力された時の処理
				else if(i == 2){	//新規ゲーム。キャラクターの初期値を決定
					System.out.println("ステータスの初期値を１～6の乱数で決定します");	
					StartValue sv = new StartValue();
					sv.startPoint();
				}

			//1と2以外が入力された時の処理
				else System.out.println("1か2を入力してください");
				System.out.println("\n");
			}while(!(i==1)&!(i==2));	//iが１か２でない限りくり返す

		/*ゲーム開始処理ここまで*/

		}
		catch(IOException e){
			System.out.println("入出力エラーが起きました");
		}
			
	}
	
}


