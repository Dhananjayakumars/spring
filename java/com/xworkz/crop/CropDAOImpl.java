package com.xworkz.crop;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CropDAOImpl implements CropDAO {

	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	public CropDAOImpl() {
		
	}

	@Override
	public Long saveCrop(CropEntity cropEntity) {
		System.out.println("savecrop invoked");
		Transaction transaction = null;
		try  {
//			Configuration con=new Configuration();
//			con.configure();
//			SessionFactory sessionFactory=con.buildSessionFactory();
			Session session = factory.openSession();
			
			transaction = session.beginTransaction();
			session.save(cropEntity);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return null;

	}

}
