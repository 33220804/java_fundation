package zml;
class Person {
    String name = "No name";
    public Person(String nm) {
        name = nm;
    }
     
}
class Employee extends Person {
	String empID = "0000";
    public Employee(String id) {
    	//TODO  ����û���޲εĹ��캯��������������Ҫ���Լ��Ĺ��캯������ʽ���ø���Ĺ��캯
    	super(id);  
        empID = id;
    }
    
}
public class ������Ĭ�Ϲ��캯��_������Ҫ��ʽ���� {
	public static void main(String[] args) {
		Employee e = new Employee("123");
        System.out.println(e.empID);
	}
}
