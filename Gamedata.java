//��{�ɂȂ�Q�[���f�[�^�B�Q�[�����̓������ɏ풓���A���̃N���X����p�ɂɎQ�Ƃ��ꂽ��f�[�^������������ꂽ�肷�邽�߁Astatic�̏C���q��t���Ă���

import java.util.HashMap;	//HashMap�p�C���|�[�g
import java.util.Map;		//HashMap�p�C���|�[�g
import java.util.LinkedHashMap;	//LinkedHashMap�p�C���|�[�g

class Gamedata{
	//�v���C���[�̃X�e�[�^�X�Ǘ��p�@LinkedHashMap
	static Map<String,Integer> playerState = new LinkedHashMap<>();		//�\�����Ԃ��ς��Ȃ��悤��LinkedHashMap���g�p�Bstatic�C�j�V�����C�U���g����������
	static{
		playerState.put("����̓|�C���g�@",0);playerState.put("����|�C���g�@�@",0);playerState.put("�U���́@�@�@�@�@",0);
		playerState.put("���h��̓|�C���g",0);playerState.put("�h��|�C���g�@�@",0);playerState.put("�h��́@�@�@�@�@",0);
		playerState.put("���̗̓|�C���g�@",0);playerState.put("�̗̓|�C���g�@�@",2);
	}
	
	//�t���O�Ǘ��p�@LinkedHashMap
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

	//�v���C���[�̃X�e�[�^�X�Ǘ��p�@�񎟌��z��
	static int[][] playerState2 ={
		{0,0,0,0},				//playerState[2]:�o���l�Ǘ��p�BA�`D��4�v�f
		{1},					//playerState[3]:���t�Ǘ��p�B20����
		{0}					//playerState[4]:�������Ǘ��p�B���ݖ����v�f�P
	};

	
	//B��m�i�����j�̃X�e�[�^�X�Ǘ��p�@LinkedHashMap
	static Map<String,Integer> fighterBState = new LinkedHashMap<>();		
	static{
		fighterBState.put("����̓|�C���g�@",0);fighterBState.put("����|�C���g�@�@",0);fighterBState.put("�U���́@�@�@�@�@",0);
		fighterBState.put("���h��̓|�C���g",0);fighterBState.put("�h��|�C���g�@�@",0);fighterBState.put("�h��́@�@�@�@�@",0);
		fighterBState.put("���̗̓|�C���g�@",0);fighterBState.put("�̗̓|�C���g�@�@",2);
	}
	
	//���p�t�̃X�e�[�^�X�Ǘ��p�@LinkedHashMap
	static Map<String,Integer> magiState = new LinkedHashMap<>();
	static{
		magiState.put("���h��̓|�C���g",0);magiState.put("�h��|�C���g�@�@",0);magiState.put("�h��́@�@�@�@�@",0);
		magiState.put("���̗̓|�C���g�@",0);magiState.put("�̗̓|�C���g�@�@",2);
	}
	
	//D��m�p�X�e�[�^�X�@LinkedHashMap
	static Map<String,Integer> fighterDState = new LinkedHashMap<>();
	static{
		fighterDState.put("����̓|�C���g�@",0);fighterDState.put("����|�C���g�@�@",0);fighterDState.put("�U���́@�@�@�@�@",0);
		fighterDState.put("���h��̓|�C���g",0);fighterDState.put("�h��|�C���g�@�@",0);fighterDState.put("�h��́@�@�@�@�@",0);
		fighterDState.put("���̗̓|�C���g�@",0);fighterDState.put("�̗̓|�C���g�@�@",2);
	}
	
	
	//���߂͈ȉ��̂悤�ȎO�����z��ōl���Ă������A�X�e�[�^�X�̕W���o�͂Ɏ�Ԃ�������̂�HashMap�ɕύX
	//static short[][][] playerState1 ={
	//	{	{0,0,0,0},							//��̓|�C���g(����̓|�C���g:0/����:1/����|�C���g:2/�U����:3)
	//		{0,0,0,0},							//�h��̓|�C���g(���h��̓|�C���g:0/�h��:1/�h��|�C���g:2/�h���:3) 
	//		{0,0}								//���̗̓|�C���g:0/�̗�:1
	//	},			
	//	{	{0,0,0,0,0,0,0},					//playerState[1]:�t���O�Ǘ��p�BplayerState[1][�s�FA�`J��10�s][��:�P�`�V��7��]
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

	//���ݒn�f�[�^
	static int mapDataLv =0;
	static int mapDataPara =0;						//���݊K�w�F�P�A�p���O���t:2
	
	//�p�[�e�B���ʗp�@�ꎟ���z��
	static int[] partyMember = {0,0,0};				//�p�[�e�B�����o�[�m�F�p �����A���p�t�A����m�̏��@������:0�@����:1
	
	//�����A�C�e���f�[�^�@LinkedHashMap
	static Map<String,Integer> myItem = new LinkedHashMap<>();
	

	//��������
	static String playerWeapon = "�Ȃ�";
	static String bWeapon = "�Ȃ�";
	static String cWeapon = "�Ȃ�";
	static String dWeapon = "�Ȃ�";

	//��������
	static Map<String,Integer> weaponPos = new LinkedHashMap<>();


	//�����h��
	static String playerArmor = "�Ȃ�";
	static String bArmor = "�Ȃ�";
	static String cArmor = "�Ȃ�";
	static String dArmor = "�Ȃ�";

	//�����h��
	static Map<String,Integer> armorPos = new LinkedHashMap<>();

}