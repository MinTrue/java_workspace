/*���¸� ǥ���Ѵ�.
	�ڹ�Ŭ������ ��������� �� �����ʹ� ��� ��ȣ����̴�
	���� �ڹٿ����� ��������� �޼��忡 ���� ���������ڸ� �����Ͽ�,
	�������� ����ó�� �����Ѵ�

	public         <          protected                                 <          default                   <private
	(��������)          (��Ӱ���+���� ���丮�� ��ü������ ���ٰ���)     (���� ���丮(��Ű��)������)      (������ ���� �� �����θ�)
*/
class Account {
	String back= "��������"; //�����
	private int balance=50000000; //�ܰ�
	private String account_num="123456789"; //���¹�ȣ
	String master="ȫ�浿"; // ���� ��

	//private ���� ������ ���Ƴ�����, ������ ����ó������ �Ұ����ϰ� �ȴ�.
	//�ذ�å) �޼��带 ���� ���������� ������ �� �ְ� ������
	//		private ������ ������ �а� �� �� �ֵ���  �����Ǵ� �޼��� ���� ������ ������ getter�� �ϸ�
	//		           ������ ������ �� �ֵ��� �����Ǵ� �޼��� ���� ���� setter�� �Ѵ�.
	//�޼���� �ܺο��� ������ �� �� �־�� �ϹǷ�, public ���� Ǯ������

	//���: ��ü���� ���� Ŭ������ �߿� �������� private ���������, �̿� ���� ���ٹ����
	//		  public �޼��带 ���� ����� �����ϴ� �޼��� ���� ����� ĸ��ȭ,����ȭ(=encapsulation)
	public int getBalance(){ //��� �޼��� getter read����
		return balance;
	}
    public void setBalance(int balance){ //setter wirte
		//�Ű������� ����������� ��������, ��������տ� this�� ������ش�.
		//this��? Ŭ�����κ��� ź���� �ν��Ͻ��� �ڱ� �ڽ��� ����Ű�� ���۷��� ����
		this.balance=balance;
	}

	//account_num �� ���� getter/setter
	public String getAccount_num(){
		return account_num;
	}

	public void setAccount_num(String account_num){	
		this.account_num=account_ num;
	}
}
