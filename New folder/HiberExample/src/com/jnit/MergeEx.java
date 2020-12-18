	package com.jnit;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class MergeEx {
		public static void main(String[] args) {
			Configuration cf=new Configuration();
			cf.configure("confirguration.xml");
			SessionFactory sf=cf.buildSessionFactory();
			Session se=sf.openSession();
			Student rahul=new Student();
			rahul.setId(1026);
			rahul.setMarks(202);
			rahul.setName("pushpa latha");
			Transaction tx=se.beginTransaction();
			se.merge(rahul);
			System.out.println();
			System.out.println(rahul.getId());
			tx.commit();
		}

}
