import java.util.Map;

class Output {			//�\���@�\
	public void mapOutput() {		//���݂̊K�w��\��
 		System.out.println("\n");
		switch(Gamedata.mapDataLv){		//Gamedata�N���X��mapData�Q��
			case 0:System.out.println("���Ȃ��͌��݁A�E�g���X�ɂ��܂�\n");break;
			case 1:System.out.println("���Ȃ��͌��݁A���x��1�̃_���W�����ɂ��܂�\n");break;
			case 2:System.out.println("���Ȃ��͌��݁A���x��2�̃_���W�����ɂ��܂�\n");break;
			case 3:System.out.println("���Ȃ��͌��݁A���x��3�̃_���W�����ɂ��܂�\n");break;
			case 4:System.out.println("���Ȃ��͌��݁A���x��4�̃_���W�����ɂ��܂�\n");break;
			case 5:System.out.println("���Ȃ��͌��݁A���x��5�̃_���W�����ɂ��܂�\n");break;
		}
		System.out.println("\n");
 	}

	
	public void playerOutput() {		//�v���C���[�̃X�e�[�^�X�Ƒ�������h���\��
		System.out.println("\n");
		System.out.println("���Ȃ��̌��݂̃X�e�[�^�X");		//Gamedata�N���X��playerState�Q��
		
		for (Map.Entry<String, Integer> entry : Gamedata.playerState.entrySet()) {		//HushMap��get����
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
							
		System.out.println("���Ȃ����������Ă��镐���\t"+Gamedata.playerWeapon);
		System.out.println("���Ȃ����������Ă���h���\t"+Gamedata.playerArmor);
		System.out.println("\n");
	}
	
	
	public void partyOutput() {		//�p�[�e�B�����o�[�̃X�e�[�^�X�Ƒ�������h���\��
		System.out.println("\n");
		if(Gamedata.partyMember[0]==0){		//Gamedata�N���X��partyMember���g�������Ԕ���
			System.out.println("���Ȃ��ɂ́A�܂����Ԃ����܂���\n");
			System.out.println("\n");
		}				
							
		else if(Gamedata.partyMember[2]==1){		//3�l���Ԃ�����
			System.out.println("�p�[�e�B�����o�[�̃X�e�[�^�X\n");
			System.out.println("�����̃X�e�[�^�X");
			for (Map.Entry<String, Integer> entry : Gamedata.fighterBState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("�������������Ă��镐���,"+Gamedata.bWeapon);
			System.out.println("�������������Ă���h���,"+Gamedata.bArmor);
			System.out.println("\n");
		
			System.out.println("���p�t�̃X�e�[�^�X");
			for (Map.Entry<String, Integer> entry : Gamedata.magiState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("���p�t���������Ă��镐���,"+Gamedata.cWeapon);
			System.out.println("���p�t���������Ă���h���,"+Gamedata.cArmor);
			System.out.println("\n");
		
			System.out.println("�^���~�X�̃X�e�[�^�X");
			for (Map.Entry<String, Integer> entry : Gamedata.fighterDState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("�^���~�X���������Ă��镐���,"+Gamedata.dWeapon);
			System.out.println("�^���~�X���������Ă���h���,"+Gamedata.dArmor);
			System.out.println("\n");
		}
		else if(Gamedata.partyMember[1]==1){		//2�l���Ԃ�����
			System.out.println("�p�[�e�B�����o�[�̃X�e�[�^�X\n");
			System.out.println("�����̃X�e�[�^�X");
			for (Map.Entry<String, Integer> entry : Gamedata.fighterBState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("�������������Ă��镐���,"+Gamedata.bWeapon);
			System.out.println("�������������Ă���h���,"+Gamedata.bArmor);
			System.out.println("\n");
		
			System.out.println("���p�t�̃X�e�[�^�X");
			for (Map.Entry<String, Integer> entry : Gamedata.magiState.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("���p�t���������Ă��镐���,"+Gamedata.cWeapon);
			System.out.println("���p�t���������Ă���h���,"+Gamedata.cArmor);
					System.out.println("\n");
			}
		else if(Gamedata.partyMember[0]==1){		//��l���Ԃ�����
			System.out.println("�����̃X�e�[�^�X");
			for (Map.Entry<String, Integer> entry : Gamedata.fighterBState.entrySet()) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("�������������Ă��镐���,"+Gamedata.bWeapon);
			System.out.println("�������������Ă���h���,"+Gamedata.bArmor);
			System.out.println("\n");
		}
	}
	
	
	public void moneyOutput() {		//�������\��
		System.out.println("\n");
		System.out.println("���݂�"+Gamedata.playerState2[2][0]+"���A���L���Ă��܂�\n");		//���ݖ���
		System.out.println("\n");
	}

	
	public void dateOutput() {		//���t�\��
		System.out.println("\n");
		System.out.println("�����̓��t��10��"+Gamedata.playerState2[1][0]+"���ł�\n");			//���t�\��
		System.out.println("\n");
	}
	
	
	public void itemOutput() {			//�����A�C�e���A����h���\��
		System.out.println("\n");
		System.out.println("���Ȃ��̏����A�C�e��");		//Gamedata�N���X��myItem�Q��
		for (Map.Entry<String, Integer> entry : Gamedata.myItem.entrySet()) {		//HushMap��get����
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("\n");
		System.out.println("�N���������Ă��Ȃ���������");		//Gamedata�N���X��myItem�Q��
		for (Map.Entry<String, Integer> entry : Gamedata.weaponPos.entrySet()) {		//HushMap��get����
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("\n");
		System.out.println("�N���������Ă��Ȃ������h��");		//Gamedata�N���X��myItem�Q��
		for (Map.Entry<String, Integer> entry : Gamedata.armorPos.entrySet()) {		//HushMap��get����
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("\n");
	}
}