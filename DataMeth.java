import java.io.*;

class DataMeth{
	//�X�e�[�^�X�ꗗ�\������ Gamedata�N���X�̃f�[�^����͒l�ɂ���ĕ\������@�\
	public void outState() {
		try{			//��O����
			int b = 0;
			while(b != 7){			//���͒l��7�̎��I���B1����6�Ȃ�Έȉ���case�̏������s��
				System.out.println("�����m�F���܂����H\n 1/���݂̏ꏊ���m�F\n 2/���Ȃ��̃X�e�[�^�X���m�F\n 3/�p�[�e�B�����o�[�̃X�e�[�^�X���m�F\n 4/�������m�F\n 5/���t���m�F\n 6/�����A�C�e�����m�F����\n 7/�I������\n �ԍ�����͂��Ă�������");
					BufferedReader br =
						new BufferedReader(new InputStreamReader(System.in));
					String str = br.readLine();
					b = Integer.parseInt(str);
					
					if(1>b | b >7) {
							System.out.println("1�`7�̐�������͂��Ă�������");
						continue;
					}
					Output otp = new Output();//Output�N���X�̃C���X�^���X��
					switch(b){
						case 1://���݂̊K�w��\��
							otp.mapOutput();
							break;					
						case 2://�v���C���[�̃X�e�[�^�X�Ƒ�������h���\��
							otp.playerOutput();
							break;
						case 3://�p�[�e�B�����o�[�̃X�e�[�^�X�Ƒ�������h���\��
							otp.partyOutput();
							break;
						case 4://�������\��
							otp.moneyOutput();
							break;
						case 5://���t�\��
							otp.dateOutput();
							break;
						case 6://�����A�C�e���A����h���\��
							otp.itemOutput();
							break;
						}				
					
				}
				System.out.println("�X�e�[�^�X�m�F���I�����܂�");
				System.out.println("\n");
			
		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
	}
}