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
    	//TODO  父类没有无参的构造函数，所以子类需要在自己的构造函数中显式调用父类的构造函
    	super(id);  
        empID = id;
    }
    
}
public class 父类无默认构造函数_子类需要显式调用 {
	public static void main(String[] args) {
		Employee e = new Employee("123");
        System.out.println(e.empID);
	}
}
