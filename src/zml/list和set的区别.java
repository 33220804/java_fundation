package zml;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list��set������ {

	public static void main(String[] args) {
		 List list=new ArrayList();
	        list.add("a");
	        list.add("b");
	        list.add("a");
	        Set set=new HashSet();
	        set.add("a");
	        set.add("b");
	        set.add("a");
	        System.out.println(list.size()+","+set.size()); 
	}

}
/**
 * ���ۣ�
 * 		List������ظ���set���򲻿��ظ�
 * 
 */
