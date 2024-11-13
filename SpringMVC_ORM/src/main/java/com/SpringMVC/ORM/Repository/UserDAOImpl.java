package com.SpringMVC.ORM.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SpringMVC.ORM.Model.User;

@Repository
public class UserDAOImpl {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		return (int) hibernateTemplate.save(user);
	}

}
