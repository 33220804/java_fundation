package zml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {
	
	public static void main(String[] args) {
		Connection connect = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			// URL="jdbc:mysql://127.0.0.1:3306/imooc?useUnicode=true&amp;characterEncoding=utf-8";
			connect =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","123456");
			String sql ="select id ,username from user where username=? " ;
			preparedStatement = connect.prepareStatement(sql);
			preparedStatement.setString(1, "ÕÅÈý");
			resultset = preparedStatement.executeQuery();
			while(resultset.next()){
				System.out.println("id:"+resultset.getString("id")+"username:"+resultset.getString("username"));
			}
			System.out.println("========end============");
		}catch(Exception  e){
			e.printStackTrace();
		}
	}


}
