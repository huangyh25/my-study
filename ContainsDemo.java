package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �����ṩ������
 * boolean contains(Object o)
 * �жϵ�ǰ�����Ƿ��������Ԫ��
 * 
 * @author adminitartor
 *
 */
public class ContainsDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		System.out.println(c);		
		Point p = new Point(1, 2);
		/*
		 * contains���ж���׼�ǿ������Ķ���p�Ƿ���
		 * ��������Ԫ�ش���equals�Ƚ�Ϊtrue�ģ�����
		 * ����Ϊ����������Ϊ��������
		 * ����Ԫ��equals���������⼯���жϰ����Ľ��
		 */
		boolean contains = c.contains(p);
		System.out.println("����:"+contains);
		
		
	}
}











