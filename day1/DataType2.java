/*������ �ڷ���*/
class DataType2{

  public static void main(String[] args) {
    /*
    ���� : char 2byte ������
    ���� : �Ǽ� , ����
    - �Ǽ� : float(4) < double(8)
    - ���� : byte(1) < short(2) < int(4) < long(8)
    ���� : boolean (1)
    */
    byte b = 127; //�� byte ������ 256(2��8����) ���� ����� ���ڸ� ���� �� �մ�.
					  //-2��8-1���� < 0 <2��8-1���� -1

	//�ڹٿ����� ��� �Ǽ��� Ư���� ǥ�ø� ���� ������ �����尪�� double �� ����
	//���� float �ڷ����� ����ϰ� �ʹٸ�, �Ҽ������� f�� ǥ���Ѵ�.
	float x=0.96f; //�Ҽ����̹Ƿ� �Ǽ��̴�.

    System.out.println(x);

	//����
	boolean k=true;

	//���� �ڷ��� ����) ���ڿ��ϴ�
	char	m='Y'; //ö�� �ϳ����� ���� �� �ִ�. ''
	System.out.println(m);
  }

}