package db;

import java.sql.DriverManager; //java SE�� rt.jar�� ����ִ� �̹� �츮�� ������ �ִ�.
import java.sql.SQLException;  //java SE�� rt.jar�� ����ִ� �̹� �츮�� ������ �ִ�.
import java.sql.Connection; //java SE�� rt.jar�� ����ִ� �̹� �츮�� ������ �ִ�.

public class OracleTest {
	public static void main(String[] args) {
		/*����Ŭ �� �ƴ϶�, ��� DBMS�� �����ϰ� �ʹٸ�, �ش� DBMS �翡��
			�����ϴ� ����̺긦 �̿��ؾ� �Ѵ�
		*/
		
		try{
			//�帮�̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Class�� ���� ������ ���� Ŭ������ Class Ŭ������ �ϴµ�,
			//�� Ŭ������ static �� Ŭ���� �޼��� �߿��� forName() �޼��带 �̿��ϸ�,
			//����Ŭ ������ ���õ� ����̹� Ŭ������ jvm�� �޸� ������ Load ��ų �� �ִ�.
			//�� �̷��� �ؾ� �ϳ�? ���� ��Ű�� �� Ŭ������ javaSE�� �⺻���� ž��� jar�� 
			//�ƴ϶�, ��� �츮�� ��ϵ� �ܺ� ���̺귯���̱� ����
			System.out.println("����̹� �ε� ����");

			//batman/1245 ���� ����
			String url="jdbc:oracle:thin:@localhost:1521:XE"; 
			//jdbc:(����orcle.mysql):thin:@localhost:1521:XE
			String id="batman";
			String pass="1234";
			
			Connection con=null; //���� ���� �� , �� ���� ������ ���� ��ü�̴�.
			//���� ���� �� ��ü�� null �̶�� ���ӿ� ������ �Ŵ�!!

			con = DriverManager.getConnection(url, id, pass); //DriverManager ����Ʈ ������Ѵ�.
																				//���� �õ��� ���� ���ɼ��� �־ ���� ó�� ����
			if(con !=null){
				System.out.println("���� ����!!");
			}



		}catch(ClassNotFoundException e){
			//�ش� ����� ���� ����ȭ �Ǿ�, ������ �߻��Ѵٸ�, jvm �� ����
			//���� ��ü�� ClassNotFoundException �� �ν��Ͻ��� �����Ǿ�,
			// catch���� �Ű����� e�� ���޵ȴ�
			System.out.println("����̹��� Ȯ���� �ּ���");
		}catch(SQLException e){
			System.out.println("���ӿ� ������ �߻��߳׿�.");
		}

	}
}
