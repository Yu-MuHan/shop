package yjb.service;

import yjb.Dao.UserDao;
import yjb.bean.User;

public class UserServiceImpl {
	//����dao��Ķ���
		UserDao usersDao = new UserDao();
		
		//�û�ע��
		public void userRegister(User users) {
			usersDao.register(users);//ע��
			//�������з��ͼ�������Ϣ
			SendJMail.sendMail(users.getEmail(), " ע��ɹ�����<a href='http://localhost:8080/shopping/UserServlet?method=userActive&code="+users.getCode()+"'>����</a>���¼");//email�������ߵ�����  emailMsg���������������
		}

		//�û�������ݼ����룬�����û�����

		public Users userActive(String code) {
			// TODO Auto-generated method stub
			return usersDao.userActive(code);
		}

		//�޸��û�����

		public void updateUsers(Users users) {
			usersDao.updateUsers(users);
		}
}
