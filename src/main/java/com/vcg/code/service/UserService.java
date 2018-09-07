package com.vcg.code.service ;

import com.vcg.code.dao.BaseService;
import com.vcg.code.model.User;
import com.vcg.code.model.query.UserExample;

public interface UserService extends BaseService<User,UserExample,Integer>{

	public User login(User user);

}