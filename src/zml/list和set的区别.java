package zml;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list和set的区别 {

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
 * 结论：
 * 		List有序可重复，set有序不可重复
 * 
 */
