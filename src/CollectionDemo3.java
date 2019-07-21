

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/**
 * ���ϲ���
 * @author adminitartor
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c");
		c1.add("c++");
		
		Collection c2 = new ArrayList();
		c2.add("android");
		c2.add("ios");
	
		/*
		 * boolean addAll(Collection c)
		 * �����Ϻ󣬵�ǰ����Ԫ�ط����ı��򷵻�true
		 */
		c1.addAll(c2);
		System.out.println("c1:"+c1);
		
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("ios");
//		c3.add("php");
		/*
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("ȫ����:"+contains);
		
		
		/*
		 * boolean removeAll(Collection c)
		 * ɾ����ǰ������������ϵĹ���Ԫ��
		 */
		c1.removeAll(c3);
		System.out.println("c1:"+c1);
		
		
	}
}







