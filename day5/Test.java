class  Test{

	public static void main(String[] args) {
		/*�ڹٽ�ũ��Ʈ ó��, �ڹٵ� �迭�� ���̸� �������� �ø��� �����
			ũ�⸦ ���������� ó���� �� ������?
			��) �ڹٿ��� �迭�� ũ�� ������ �Ұ�
			�ذ�å) �÷��� �����ӿ�ũ ���̺귯������ js ���� �پ���
			          �ڷᱸ���� ����
            �ڹٿ��� �÷��� �����ӿ�ũ�� ��Ÿ ���̺귯���� �̿��Ϸ���
			api document�� ���� ������� �˾ƾ��Ѵ�.
		*/

		//���� �츮 ���丣���� String.class ������ �������� �ʴ����,
		//java.lang �̶�� ���丮�� �����ϴ� String.class��
		//�ڵ����� ��ġ�� ���� �������� Ŭ������ �νĵǾ��� �ִ�.
		//���: String.class�� ������ �ִ�
		String str = "korea , fighting";
    	char c = str.charAt(6);
		System.out.println(c);

		String[] result =str.split(",");  //��ǥ�� �������� ���ڿ� �迭�� ��ȯ����
		System.out.println("�и���Ų ��� �迭�� ���̴� "+reuslt.length);
		System.out.println("0��° ����"+result[0].trim());
		System.out.println("1��° ����"+result[1].trim());
		//���� ���丮�� Dog ���� ������ �����Ƿ�, ����X
		Dog d = new Dog("�Ʒ���",6);

		//cat c = new Cat(); ���� ���丮�� Cat �� �������� ����
	}
}
