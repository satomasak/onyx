import java.io.*;
import java.util.HashMap;	//HashMap�p�C���|�[�g
import java.util.Map;		//HashMap�p�C���|�[�g
import java.util.LinkedHashMap;	//LinkedHashMap�p�C���|�[

class Savedata{

	public void savePlayerState(){			//savePlayerState���\�b�h�@playerState��data_PS.txt�ɕۑ�
		try{
			
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_PS.txt")));		//�v���C���[���̕ۑ� data_PS.txt�ɏ�������
		
				for (Map.Entry<String, Integer> entry : Gamedata.playerState.entrySet()) {		//HushMap��get���� playerState�̒l�����ׂď����o��
						pw.println(entry.getValue());
				}
			pw.close(); //�ȏ�Adata_PS.txt�ɓ��͂��ꂽ�f�[�^
			System.out.println("PS�f�[�^�̃Z�[�u���I���܂���");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
	}

	public void saveFlagState(){			//saveFlagState���\�b�h�@flagState��data_FS.txt�ɕۑ�
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_FS.txt")));		//�v���C���[���̕ۑ� data_FS.txt�ɏ�������	

				for (Map.Entry<String, Integer> entry : Gamedata.flagState.entrySet()) {		//HushMap��get���� flagState�̒l�����ׂď����o��
						pw.println(entry.getValue());
				}
			pw.close(); //�ȏ�Adata_FS.txt�ɓ��͂��ꂽ�f�[�^
			System.out.println("FS�f�[�^�̃Z�[�u���I���܂���");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		
		}
	}

	public void savePlayerState2(){			//savePlayerState2���\�b�h�@playerState2��data_PS2.txt�ɕۑ�
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_PS2.txt")));		//�v���C���[���̕ۑ� data_PS2.txt�ɏ�������


				for (int[] array :Gamedata.playerState2) {						//�񎟌��z��̃t�@�C���o�͏��� �������z��̊g��for�����g��playerState2�̒l�����ׂď����o��
					for(int element :array ){
						pw.println(element);
					}
				}
			pw.close(); //�ȏ�Adata_PF.txt�ɓ��͂��ꂽ�f�[�^
			System.out.println("PS2�f�[�^�̃Z�[�u���I���܂���");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		
		}
	}

	public void savePatyState(){			//savePatyState���\�b�h�@�p�[�e�B�����o�[�̃f�[�^����data_PT.txt�ɕۑ�
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_PT.txt")));		//�p�[�e�B�����o�[���̕ۑ��@data_PT.txt�ɏ�������
		
				for (Map.Entry<String, Integer> entry : Gamedata.fighterBState.entrySet()) {		//HushMap��get���� B��m�pfighterBState�̒l�����ׂď����o��
						pw.println(entry.getValue());
				}
			
				for (Map.Entry<String, Integer> entry : Gamedata.magiState.entrySet()) {		//HushMap��get���� ���p�t�pmagiState�̒l�����ׂď����o��
							pw.println(entry.getValue());
				}

				for (Map.Entry<String, Integer> entry : Gamedata.fighterDState.entrySet()) {		//HushMap��get���� D��m�pfighterDState�̒l�����ׂď����o��
						pw.println(entry.getValue());
				}
		
			pw.close(); //�ȏ�Adata_PTYF.txt�ɓ��͂��ꂽ�f�[�^
			System.out.println("PT�f�[�^�̃Z�[�u���I���܂���");

		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		
		}
	}
	
	public void saveOth(){			//saveOth���\�b�h�@���̑��̃f�[�^����data_OTH.txt�ɕۑ�
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_OTH.txt")));		//���̑����̕ۑ��@data_OTH.txt�ɏ�������

				pw.println(Gamedata.mapDataLv);		//���݊K�w�̃f�[�^�o��
				pw.println(Gamedata.mapDataPara);	//�p���O���t�ԍ��̃f�[�^�o��
		
				for(int p :Gamedata.partyMember) pw.println(p);		//�p�[�e�B�����o�[���ʗp�ꎟ���z��̃f�[�^�o�́@�g��for��

			pw.close(); //�ȏ�Adata_OTH.txt�ɓ��͂��ꂽ�f�[�^/s
			System.out.println("OTH�f�[�^�̃Z�[�u���I���܂���");

		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		
		}
	}
	
	public void saveItrm(){			//saveItrm���\�b�h�@���̑��̃f�[�^����data_Itrm.txt�ɕۑ�
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_Itrm.txt")));		//���̑����̕ۑ��@data_OTH.txt�ɏ�������
			
				for (String str : Gamedata.myItem.keySet()) {		//HushMap��get���� �A�C�e���pmyItem��key�l�����ׂď����o��
						pw.println(str);
				}
				pw.println("�I");//�L�[�l�̍ŏI����̂��߂̏�������
			
				for (int num : Gamedata.myItem.values()) {		//HushMap��get���� �A�C�e���pmyItem��value�l�����ׂď����o��
						pw.println(num);
				}
				pw.println(99);//�L�[�l�̍ŏI����̂��߂̏�������
			
			pw.close();
			System.out.println("Item�f�[�^�̃Z�[�u���I���܂���");

		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		
		}
	}

	public void saveWeaponAndArmor() {			//��������A��������E�����h��A�����h��̃Z�[�u
		try{
			PrintWriter pw = new PrintWriter
				(new BufferedWriter(new FileWriter("data_WeapArm.txt")));		//���̑����̕ۑ��@data_WeapArm.txt�ɏ�������
			
			pw.println(Gamedata.playerWeapon);		//��������̃f�[�^�o��
			pw.println(Gamedata.bWeapon);
			pw.println(Gamedata.cWeapon);
			pw.println(Gamedata.dWeapon);
		
			pw.println(Gamedata.playerArmor);		//�����h��̃f�[�^�o��
			pw.println(Gamedata.bArmor);
			pw.println(Gamedata.cArmor);
			pw.println(Gamedata.dArmor);

			for (String str : Gamedata.weaponPos.keySet()) {		//HushMap��get���� ��������pweaponPos��key�l�����ׂď����o��
				pw.println(str);
			}
			pw.println("�I");//�L�[�l�̍ŏI����̂��߂̏�������
			
			for (int num : Gamedata.weaponPos.values()) {		//HushMap��get���� ��������pweaponPos��value�l�����ׂď����o��
				pw.println(num);
			}
			pw.println(99);//�L�[�l�̍ŏI����̂��߂̏�������

			for (String str : Gamedata.armorPos.keySet()) {		//HushMap��get���� �����h��parmorPos��key�l�����ׂď����o��
				pw.println(str);
			}
			pw.println("�I");//�L�[�l�̍ŏI����̂��߂̏�������
			
			for (int num : Gamedata.armorPos.values()) {		//HushMap��get���� �����h��parmorPos��value�l�����ׂď����o��
				pw.println(num);
			}
			pw.println(99);//�L�[�l�̍ŏI����̂��߂̏�������
			
			pw.close();
			System.out.println("WeapArm�f�[�^�̃Z�[�u���I���܂���");

		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
	}

}
