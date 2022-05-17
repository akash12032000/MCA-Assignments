package com.mca.student.Service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mca.student.Bean.Guest;

@Service
public class GuestServiceImp implements GuestServiceInterface {


	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void SaveUser(Guest guest) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(guest);
		tx.commit();
		session.close();
	}

}
