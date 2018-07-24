package yjb.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class DbUtil {
private static String driver;
private static String url;
private static String user;
private static String pwd;

private static Connection con;
static {
	//加载配置文件 不加载了 直接写死
	url="jdbc:oracle:thin:@47.94.87.37:1521:orcl";
	user="lanqiao";
	pwd="lanqiao";
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
/**
 * 返回连接
 * @return
 */
public static Connection getCon() {
	try {
		if(con!=null&&!con.isClosed()) {
			return con;
		}else {
			con=DriverManager.getConnection(url,user,pwd);
			System.out.println("成功连接到数据库："+new Date().toString());
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
/**
 * 关闭连接
 */
public static void  close() {
	try {
		if(con!=null&&!con.isClosed()) {	
			con.close();
		}else {
			//空空如也
			con=getCon();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static boolean common(String sql,Object...objects) {
	try {
		if(con!=null&&!con.isClosed()) {			
		}else {
			//空空如也
			con=getCon();
		}
		PreparedStatement ps=con.prepareStatement(sql);
		for (int i = 0; i < objects.length; i++) {
			ps.setObject(i+1, objects[i]);
		}
		ps.executeUpdate();
		ps.close();
		close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	return true;
}
}
