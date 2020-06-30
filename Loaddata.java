import java.io.*;
import java.util.HashMap;	//HashMap�p�C���|�[�g
import java.util.Map;		//HashMap�p�C���|�[�g
import java.util.LinkedHashMap;	//LinkedHashMap�p�C���|�[�g
import java.util.ArrayList;

class Loaddata{
	public void loadPlayerState(){			//PlayerState�̃f�[�^�ǂݍ��݁Bdata_PS.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_PS.txt"));		//�t�@�C���ǂݍ��݂̂��߂̃C���X�^���X�� data_PS.txt��ǂ݂���
			
			String str;			//�t�@�C�������񉼓ǂݍ��݂̂��߂̕ϐ�
			int[] input = new int[8];	//�f�[�^���ꎞ�I�ɕۑ����邽�߂̈ꎟ���z��
				
			for(int i =0; i < input.length; i++){
				str = br.readLine();			//�t�@�C������s���ǂݍ���
				input[i] =  Integer.parseInt(str);	//�������int�������f�[�^��z��ɓ���
			}
			Gamedata.playerState.put("����̓|�C���g�@",input[0]);Gamedata.playerState.put("����|�C���g�@�@",input[1]);Gamedata.playerState.put("�U���́@�@�@�@�@",input[2]);
			Gamedata.playerState.put("���h��̓|�C���g",input[3]);Gamedata.playerState.put("�h��|�C���g�@�@",input[4]);Gamedata.playerState.put("�h��́@�@�@�@�@",input[5]);
			Gamedata.playerState.put("���̗̓|�C���g�@",input[6]);Gamedata.playerState.put("�̗̓|�C���g�@�@",input[7]);

			br.close();
			System.out.println("PS�f�[�^�����[�h���܂���");

		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
	}

	public void loadFlagState(){			//FlagState�̃f�[�^�ǂݍ��݁Bdata_FS.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_FS.txt"));		//�t�@�C���ǂݍ��݂̂��߂̃C���X�^���X�� data_FS.txt��ǂ݂���
			
			String str;			//�t�@�C�������񉼓ǂݍ��݂̂��߂̕ϐ�
			int[] input = new int[70];	//�f�[�^���ꎞ�I�ɕۑ����邽�߂̈ꎟ���z�� 70�v�f
				
			for(int i =0; i < input.length; i++){
				str = br.readLine();				//�t�@�C������s���ǂݍ���
				input[i] =  Integer.parseInt(str);	//�������int�������f�[�^��z��ɓ���
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
			System.out.println("FS�f�[�^�����[�h���܂���");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
	}
	
	public void loadPlayerState2(){			//PlayerState2�̃f�[�^�ǂݍ��݁Bdata_PS2.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_PS2.txt"));		//�t�@�C���ǂݍ��݂̂��߂̃C���X�^���X�� data_PS2.txtt��ǂ݂���
			
			String str;			//�t�@�C�������񉼓ǂݍ��݂̂��߂̕ϐ�
			
			for(int x =0; x < Gamedata.playerState2.length; x++){		//�񎟌��z���1�����ڂ̌J��Ԃ�����
				for(int y =0; y < Gamedata.playerState2[x].length; y++){	//�񎟌��z���2�����ڂ̌J��Ԃ�����
					str = br.readLine();								//�t�@�C������s���ǂݍ���
					Gamedata.playerState2[x][y] =  Integer.parseInt(str);	//�������int�������f�[�^��z��ɓ���
				}
			}
			br.close();
			System.out.println("PS2�f�[�^�����[�h���܂���");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
		
	}
	
	public void loadPatyState(){			//PatyState�̃f�[�^�ǂݍ��݁Bdata_PT.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_PT.txt"));		//�t�@�C���ǂݍ��݂̂��߂̃C���X�^���X�� data_PT.txt��ǂ݂���
			
			String str;			//�t�@�C�������񉼓ǂݍ��݂̂��߂̕ϐ�
			int[] input = new int[21];	//�f�[�^���ꎞ�I�ɕۑ����邽�߂̈ꎟ���z�� 21�v�f B,D��m8�A���p�t�T
				
			for(int i =0; i < input.length; i++){
				str = br.readLine();				//�t�@�C������s���ǂݍ���
				input[i] =  Integer.parseInt(str);	//�������int�������f�[�^��z��ɓ���
			}
			//B��m(�����j
			Gamedata.fighterBState.put("����̓|�C���g�@",input[0]);Gamedata.fighterBState.put("����|�C���g�@�@",input[1]);Gamedata.fighterBState.put("�U���́@�@�@�@�@",input[2]);
			Gamedata.fighterBState.put("���h��̓|�C���g",input[3]);Gamedata.fighterBState.put("�h��|�C���g�@�@",input[4]);Gamedata.fighterBState.put("�h��́@�@�@�@�@",input[5]);
			Gamedata.fighterBState.put("���̗̓|�C���g�@",input[6]);Gamedata.fighterBState.put("�̗̓|�C���g�@�@",input[7]);
			
			//���p�t
			Gamedata.magiState.put("���h��̓|�C���g",input[8]);Gamedata.magiState.put("�h��|�C���g�@�@",input[9]);Gamedata.magiState.put("�h��́@�@�@�@�@",input[10]);
			Gamedata.magiState.put("���̗̓|�C���g�@",input[11]);Gamedata.magiState.put("�̗̓|�C���g�@�@",input[12]);
			
			//D��m
			Gamedata.fighterDState.put("����̓|�C���g�@",input[13]);Gamedata.fighterDState.put("����|�C���g�@�@",input[14]);Gamedata.fighterDState.put("�U���́@�@�@�@�@",input[15]);
			Gamedata.fighterDState.put("���h��̓|�C���g",input[16]);Gamedata.fighterDState.put("�h��|�C���g�@�@",input[17]);Gamedata.fighterDState.put("�h��́@�@�@�@�@",input[18]);
			Gamedata.fighterDState.put("���̗̓|�C���g�@",input[19]);Gamedata.fighterDState.put("�̗̓|�C���g�@�@",input[20]);
			
			br.close();
			System.out.println("PT�f�[�^�����[�h���܂���");

		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
	}
		
	public void loadOth(){			//���̑��̃f�[�^�ǂݍ��݁Bdata_OTH.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_OTH.txt"));		//�t�@�C���ǂݍ��݂̂��߂̃C���X�^���X�� data_OTH.txt��ǂ݂���
			
			String str;			//�t�@�C�������񉼓ǂݍ��݂̂��߂̕ϐ�
			str = br.readLine();
			Gamedata.mapDataLv = Integer.parseInt(str);
			
			str = br.readLine();
			Gamedata.mapDataPara = Integer.parseInt(str);
			
			for(int i =0; i < Gamedata.partyMember.length; i++){
				str = br.readLine();
				Gamedata.partyMember[i] = Integer.parseInt(str);
			}
			br.close();
			System.out.println("OTH�f�[�^�����[�h���܂���");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
	}
		
	public void loadItem(){			//�A�C�e���̃f�[�^�ǂݍ��݁Bdata_Itrm.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_Itrm.txt"));		//�t�@�C���ǂݍ��݂̂��߂̃C���X�^���X�� data_Itrm.txt��ǂ݂���
			
			
			String str;			//�t�@�C�������񉼓ǂݍ��݂̂��߂̕ϐ�
			ArrayList<String> inputS = new ArrayList<String>();	//String�^�̔z��@�L�[�l���ꎞ�I�ɕۑ�
			ArrayList<Integer> inputi = new ArrayList<Integer>();		//int�^�̔z��@value�l���ꎞ�I�ɕۑ�
			int i =0;				//�z��Y�����p
			int j =0;
						
			str = br.readLine();//���߂̈�s��str�ɓ���
							
			while(!("�I".equals(str))){		//str�̒l��"�I"�̎��Ƀ��[�v�I���B"�I"�̓f�[�^�̍Ō�ɕK���L�^�����I�����Ӗ����镶����
				inputS.add(str);			//�z��Ɋi�[
				str = br.readLine();		//�t�@�C������s���ǂݍ���
			}

			
			str = br.readLine();			//value��s�ǂݍ���
			int num  =  Integer.parseInt(str);		//�������int�ϊ����ϐ��ɓ���
			while(num  != 99){						//99�̒l��������I���B99�̓f�[�^�̍Ō�ɕK���L�^�����I�����Ӗ����鐮���l
				inputi.add(num);					//�z��ɕϐ��̒l�����
				str = br.readLine();				//�t�@�C������s���ǂݍ���
				num = Integer.parseInt(str);
			}


			j=0;			//value�p�̔z��̓Y������0����
			for(i = 0; i < inputS.size(); i++){		//�L�[�̔z��̑傫���܂ŌJ��Ԃ��������
				Gamedata.myItem.put(inputS.get(i),inputi.get(j));
				j++;
			}br.close();
			System.out.println("Item�f�[�^�����[�h���܂���");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
	}
	
	public void loadWeaponAndArmor(){			//����h��̃f�[�^�ǂݍ��݁Bdata_WeapArm.txt
		try{
			BufferedReader br =	
				new BufferedReader(new FileReader("data_WeapArm.txt"));		//�t�@�C���ǂݍ��݂̂��߂̃C���X�^���X�� data_WeapArm.txt��ǂ݂���

			
			String str;			//�ȉ���������̓ǂݍ���
			str = br.readLine();
			Gamedata.playerWeapon = str;
			str = br.readLine();
			Gamedata.bWeapon = str;
			str = br.readLine();
			Gamedata.cWeapon = str;
			str = br.readLine();
			Gamedata.dWeapon = str;

			str = br.readLine();		//�ȉ������h��̓ǂݍ���
			Gamedata.playerArmor = str;
			str = br.readLine();
			Gamedata.bArmor = str;
			str = br.readLine();
			Gamedata.cArmor = str;
			str = br.readLine();
			Gamedata.dArmor = str;



			//�ȉ��A�������탊�X�g�̓ǂݍ���
			ArrayList<String> inputS = new ArrayList<String>();		//String�^�̔z��@�L�[�l���ꎞ�I�ɕۑ�
			ArrayList<Integer> inputi = new ArrayList<Integer>();		//int�^�̔z��@value�l���ꎞ�I�ɕۑ�
			int i =0;				//�z��Y�����p
			int j =0;
						
			str = br.readLine();//���߂̈�s��str�ɓ���
							
			while(!("�I".equals(str))){		//str�̒l��"�I"�̎��Ƀ��[�v�I���B
				inputS.add(str);			//�z��Ɋi�[
				str = br.readLine();		//�t�@�C������s���ǂݍ���
			}
			
			str = br.readLine();			//value��s�ǂݍ���
			int num  =  Integer.parseInt(str);		//�������int�ϊ����ϐ��ɓ���
			while(num  != 99){						//99�̒l��������I���
				inputi.add(num);					//�z��ɕϐ��̒l�����
				str = br.readLine();				//�t�@�C������s���ǂݍ���
				num = Integer.parseInt(str);
			}

			j=0;			//value�p�̔z��̓Y������0����
			for(i = 0; i < inputS.size(); i++){		//�L�[�̔z��̑傫���܂ŌJ��Ԃ��������
				Gamedata.weaponPos.put(inputS.get(i),inputi.get(j));
				j++;
			}



			//�ȉ��A�����h��̓ǂݍ���			
			str = br.readLine();//���߂̈�s��str�ɓ���
							
			while(!("�I".equals(str))){		//str�̒l��"�I"�̎��Ƀ��[�v�I���B
				inputS.add(str);			//�z��Ɋi�[
				str = br.readLine();		//�t�@�C������s���ǂݍ���
			}
			
			str = br.readLine();			//value��s�ǂݍ���
			num  =  Integer.parseInt(str);		//�������int�ϊ����ϐ��ɓ���
			while(num  != 99){						//99�̒l��������I���
				inputi.add(num);					//�z��ɕϐ��̒l�����
				str = br.readLine();				//�t�@�C������s���ǂݍ���
				num = Integer.parseInt(str);
			}

			for(; i < inputS.size(); i++){		//�L�[�̔z��̑傫���܂ŌJ��Ԃ��������
				Gamedata.armorPos.put(inputS.get(i),inputi.get(j));
				j++;
			}

			br.close();
			System.out.println("WeapArm�f�[�^�����[�h���܂���");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
	}
}
