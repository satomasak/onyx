import java.io.*;


class Onx{		//main���\�b�h
	public static void main(String[] args) {
		try{
			
		/*�Q�[���J�n�����@�Z�[�u�f�[�^�̓ǂݍ��݁A�X�e�[�^�X����*/
			
			int i;	//while�̏I�������ł����邽�߁A�J��Ԃ������̊O���ŕϐ�int��錾
			
			do{
				System.out.println("�Z�[�u�f�[�^��ǂݍ��ݑ�������X�^�[�g����:1\n"+
						"�V�����Q�[�����n�߂�F2\n"+
						"��������͂��Ă�������\n");

				BufferedReader br =							//�W������
					new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				i = Integer.parseInt(str);						//�O���錾��i�ɑ��

			//1�����͂��ꂽ���̏���
				if( i == 1){					
					Loaddata ldd = new Loaddata();					//�f�[�^�̃��[�h�@Loaddata�N���X�̃C���X�^���X���A�ȉ����\�b�h�����s				
					ldd.loadPlayerState();
					ldd.loadFlagState();
					ldd.loadPlayerState2();
					ldd.loadPatyState();
					ldd.loadOth();
					ldd.loadItem();
					ldd.loadWeaponAndArmor();

					String str1;	//while�̏I�������ł����邽�߁A�J��Ԃ������̊O���ŕϐ�str��錾
				
					do{			//���͏����~�X�Ή��B���͒l���������ɂȂ�܂ŌJ��Ԃ��������s��
						System.out.println("\n");
						System.out.println("�f�[�^���m�F���܂����HY/N");
						str1 = br.readLine();
				
						if("Y".equals(str1) ^ "y".equals(str1)){	//�r���I�_���a�@Y�ł����ł��^�ɂȂ�@A.equals(B)�@A,B�̒l�͌݊��\
							DataMeth od = new DataMeth();		//DataMeth�N���X�̃C���X�^���X��
							od.outState();				//�X�e�[�^�X�ꗗ�\�������̃��\�b�h���Ăяo��
						}

						else if(str1.equals("N") ^ str1.equals("n")){	//�r���I�_���a�@N�ł�n�ł��^�ɂȂ�
							System.out.println("�Q�[�����J�n���܂�");
						}
						else {
							System.out.println("Y��N����͂��Ă�������");
						}
					
					}while(!("Y".equals(str1) ^ "y".equals(str1))&!(str1.equals("N") ^ str1.equals("n")));�@//y�AY�An�AN�̂��Âꂩ�����͂��ꂽ��J��Ԃ��I��
�@				
				}

			//2�����͂��ꂽ���̏���
				else if(i == 2){	//�V�K�Q�[���B�L�����N�^�[�̏����l������
					System.out.println("�X�e�[�^�X�̏����l���P�`6�̗����Ō��肵�܂�");	
					StartValue sv = new StartValue();
					sv.startPoint();
				}

			//1��2�ȊO�����͂��ꂽ���̏���
				else System.out.println("1��2����͂��Ă�������");
				System.out.println("\n");
			}while(!(i==1)&!(i==2));	//i���P���Q�łȂ����肭��Ԃ�

		/*�Q�[���J�n���������܂�*/

		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}
			
	}
	
}


