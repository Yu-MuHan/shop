package yjb.service;

import yjb.Dao.UserDao;
import yjb.bean.User;

public class UserServiceImpl {
	//创建dao层的对象
		UserDao usersDao = new UserDao();
		
		//用户注册
		public void userRegister(User users) {
			usersDao.register(users);//注册
			//往邮箱中发送激活码信息
			SendJMail.sendMail(users.getEmail(), " 注册成功，请<a href='http://localhost:8080/shopping/UserServlet?method=userActive&code="+users.getCode()+"'>激活</a>后登录");//email：接收者的邮箱  emailMsg：发送邮箱的内容
		}

		//用户激活：传递激活码，返回用户对象

		public Users userActive(String code) {
			// TODO Auto-generated method stub
			return usersDao.userActive(code);
		}

		//修改用户对象

		public void updateUsers(Users users) {
			usersDao.updateUsers(users);
		}
}
