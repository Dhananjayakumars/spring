package com.xworkz.shop.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.shop.entity.ShopEntity;

public class ShopDaoImpl implements ShopDAO {
	public ShopDaoImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void saveAndInsert(ShopEntity shopEntity) {
		System.out.println("save shop invoked");
		Transaction transaction = null;
		try (Session session = factory.openSession();) {

			transaction = session.beginTransaction();
			session.save(shopEntity);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

}
