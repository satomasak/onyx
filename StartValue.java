import java.util.Random;//�����pimport

class StartValue{

	public void startPoint(){	//�߂�lint �̃X�e�[�^�X�����l���胁�\�b�h
		System.out.println("�T�C�R������U��A����̓|�C���g�̏����l�����肵�܂�");
		int r = new Random().nextInt(6);	//�����łU��ނ̐��l������
		int dais1 = r+1;				//�{�P�łP�`6�̐��l�ɕϊ�
		Gamedata.playerState.put("����̓|�C���g�@", dais1);//playerState�̒l��ύX

		System.out.println("�T�C�R���̒l��"+dais1+"�ł�");
		System.out.println("����̓|�C���g�̏����l��"+dais1+"�ł�");
		System.out.println("");
		
		
		System.out.println("�T�C�R������U��A���h��|�C���g�̏����l�����肵�܂�");
		r = new Random().nextInt(6);	//�����łU��ނ̐��l������
		int dais2 = r+1;				//�{�P�łP�`6�̐��l�ɕϊ�
		Gamedata.playerState.put("���h��̓|�C���g", dais2);//playerState�̒l��ύX
		System.out.println("�T�C�R���̒l��"+dais2+"�ł�");
		System.out.println("���h��|�C���g�̏����l��"+dais2+"�ł�");
		System.out.println("");
		

		System.out.println("���̗̓|�C���g�̏����l�́A15���猴��̓|�C���g�ƌ��h��̓|�C���g���������l���Q�{�������l�ł�");
		int vaital = (15-dais1-dais2)*2;		//���̗͂̌v�Z
		Gamedata.playerState.put("���̗̓|�C���g�@", vaital);//playerState�̒l��ύX
		System.out.println("���̗̓|�C���g�̏����l��"+vaital+"�ɂȂ�܂�");
		System.out.println("");
		
	}
	

}
