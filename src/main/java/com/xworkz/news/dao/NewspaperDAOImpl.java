package com.xworkz.news.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.news.entity.NewspaperEntity;

@Component
public class NewspaperDAOImpl implements NewspaperDAO {

	@Autowired
	private SessionFactory factory;

	public NewspaperDAOImpl() {
		super();
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	@Override
	public boolean saveNewspaper(NewspaperEntity newspaperEntity) {
		System.out.println("invoked saveNewspaper()");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.persist(newspaperEntity);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return true;
	}

}
