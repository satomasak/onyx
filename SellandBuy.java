import java.io.*;

class SellandBuy {
	private void sell(){
		try{
			System.out.println("����A�C�e����I��ł�������");
			System.out.println("1:�������̕���\n 2:�������̖h��\n 3:�����̃K�[�S�C��\n 4:���R�m�̔�����\n 5:������\n 6:�u���b�N�I�j�L�X\n 7:����̂���߂�\n");

			String str;
			int num;
			Output opt = new Output(); //Output�N���X�̃C���X�^���X��
			
			
			BufferedReader br =	
					new BufferedReader(new InputStreamReader(System.in));
			do{
				str = br.readLine();
				num = Integer.parseInt(str);

				if(num<1 | num>5){
					System.out.println("��������������͂��Ă�������");
					continue;
				}
				else{
					switch (num){

						//��������������̕\��
						case 1:
						opt.weaponOutput();	
						System.out.println("���p���镐��̖��O����͂��Ă�������");
						
						str = br.readLine();	//���͒l��str�ɑ�����A
						int myhave = Gamedata.weaponPos.get(str);	//str�̃L�[�l��������o����value�l��ϐ��ɑ��

						System.out.println("��������"+mayhave);
						
						System.out.println("��������܂����H");
						str = br.readLine();
						int calc = Integer.parseInt(str);

						//���p�v�Z
						if(mayhave < calc){	//���͒l�����ۂ̏��������������ꍇ�̓G���[
							System.out.println("�������Ă������葽���������͂���Ă��܂�");
							continue;
						}
						else if(calc < 1){	//�P�����̐��������͂���Ă���ꍇ�̓G���[
							System.out.println("�P�ȏ�̐�������͂��Ă�������");
							continue;
						}
						else {
							Gamedata.playerState2[2][0] += calc * 2;	//����P��������݂Q���Ŕ��p�@�������ɒǉ�
							myhave -= calc;					//��������̐������炷

							if(myhave == 0) {				//��������0�ɂȂ�����L�[���폜
								Gamedata.weaponPos.remove(str);
								System.out.println(calc*2+"���Ŕ���܂����B��������"+Gamedata.playerState2[2][0]+"�ɂȂ�܂���");
								System.out.println(str+"�̌���0�ł�");
								System.out.println("\n");
							}
							else {
								Gamedata.weaponPos(str) = myhave;	//��������0�ȊO�Ȃ�value�l��ύX
								System.out.println(calc*2+"���Ŕ���܂����B��������"+Gamedata.playerState2[2][0]+"�ɂȂ�܂���");
								System.out.println(str+"�̌���"+myhave+"�ł�");
								System.out.println("\n");
							}

						}
						break;
					
						//�����������h��̕\��
						case 2:
						opt.armorPos();	
						System.out.println("���p����h��̖��O����͂��Ă�������");
						
						str = br.readLine();	//���͒l��str�ɑ�����A
						int myhave = Gamedata.armorPos.get(str);	//str�̃L�[�l��������o����value�l��ϐ��ɑ��

						System.out.println("��������"+mayhave);
						
						System.out.println("��������܂����H");
						str = br.readLine();
						int calc = Integer.parseInt(str);

						//���p�v�Z
							
						if(mayhave < calc){	//���͒l�����ۂ̏��������������ꍇ�̓G���[
							System.out.println("�������Ă������葽���������͂���Ă��܂�");
							continue;
						}
						else if(calc < 1){	//�P�����̐��������͂���Ă���ꍇ�̓G���[
							System.out.println("�P�ȏ�̐�������͂��Ă�������");
							continue;
						}
						else {
							Gamedata.playerState2[2][0] += calc * 2;	//����P��������݂Q���Ŕ��p�@�������ɒǉ�
							myhave -= calc;					//��������̐������炷

							if(myhave == 0) {				//��������0�ɂȂ�����L�[���폜
								Gamedata.armorPos.remove(str);
								System.out.println(calc*2+"���Ŕ���܂����B��������"+Gamedata.playerState2[2][0]+"�ɂȂ�܂���");
								System.out.println(str+"�̌���0�ł�");
								System.out.println("\n");
							}
							else {
								Gamedata.armorPos(str) = myhave;	//��������0�ȊO�Ȃ�value�l��ύX
								System.out.println(calc*2+"���Ŕ���܂����B��������"+Gamedata.playerState2[2][0]+"�ɂȂ�܂���");
								System.out.println(str+"�̌���"+myhave+"�ł�");
								System.out.println("\n");
							}

						}
						break;
 
						//�����������h��̕\��
						case 3:
							 
						break; 
							
 						//�����������h��̕\��
						case 4:
							 
						break; 
							
						//�����������h��̕\��
						case 5:
							 
						break; 
							
						//�����������h��̕\��
						case 6:
							 
						break; 
				}



			}while(num !== 7);	//7�����͂��ꂽ��I��

		}
		catch(IOException e){
			System.out.println("���o�̓G���[���N���܂���");
		}

	}

}
