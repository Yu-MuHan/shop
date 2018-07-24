package yjb.dbUtil;

import yjb.Dao.UserDao;
import yjb.bean.User;

public class Test {
public static void main(String[] args) {
	User u=new User(
			"456", 
			"zs",
			"123", 
			"zs", 
			"", 
			"123",
			"2012-03-21",
			"nan", 
			1, 
			"sdfdf");
	UserDao ud=new UserDao();
	try {
		ud.add(u);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
}
}
