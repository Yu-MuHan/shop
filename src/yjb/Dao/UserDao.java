package yjb.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import yjb.bean.User;
import yjb.dbUtil.DbUtil;

/**
 * 实现对用户进行增删改查
 * @author Administrator
 *
 */
public class UserDao {
	//注册
	public boolean add(User user) throws Exception{
		String sql="insert into users values(?,?,?,?,?,?,to_date(?,'yyyy-mm-dd'),?,?,?)";
		boolean flage=false;
		flage=DbUtil.common(sql, 
				user.getUuid(),
				user.getUserName(),
				user.getPassWord(),
				user.getName(),
				user.getEmail(),
				user.getTelephone(),
				user.getBirthday(),
				user.getSex(),
				user.getState(),
				user.getCode()
				
				
				);
		return flage;
	}
	//登录查询
	public User query(String name) throws Exception{
		String sql="select *　from users where username=?";
		PreparedStatement ps= DbUtil.getCon().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		User u=null;
		if(rs.next()) {
			u=new User(
					rs.getString(1), 
					rs.getString(2), 
					rs.getString(3), 
					name, 
					rs.getString(5), 
					rs.getString(6),
					rs.getString(7),
					rs.getString(8), 
					rs.getInt(9),
					rs.getString(10));
		}
		return u;
	}
	/**
	 * 注册
	 * @param users
	 */
	public void register(User users) {
		// TODO Auto-generated method stub
		
	}
}
