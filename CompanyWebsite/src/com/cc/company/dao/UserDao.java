package com.cc.company.dao;

import com.cc.company.domain.PageBean;
import com.cc.company.domain.User;

public interface UserDao {

	public User getUserByUserName(User user);

	public boolean addUser(User user);

	public PageBean<User> findUserByPage(int pageCode, int pageSize);

	public User getUserById(User user);

	public User updateUser(User updateUser);

	public boolean deleteUser(User user);

	public PageBean<User> queryUser(User user, int pageCode, int pageSize);

	public User updateUserPwd(User user);

}
