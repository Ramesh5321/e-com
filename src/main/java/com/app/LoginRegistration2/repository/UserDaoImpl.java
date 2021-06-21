package com.app.LoginRegistration2.repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.LoginRegistration2.entity.User;

public class UserDaoImpl {
    @Autowired
    private EntityManager em;

    public User save(User user) {
        Session session = em.unwrap(Session.class);
        session.save(user);
        return user;
    }


}
