package zml;
enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}

 
public class ö�ٳ�ʼ�� {
	 public static void main(String[]args)
	    {
	        System.out.println(AccountType.FIXED);
	        System.out.println("=================");
	        System.out.println(AccountType.FIXED);
	    }
}
