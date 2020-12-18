package com.motivity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Update {

	public static void update() {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter 1.update all records 2.update particular record");
		  int ch=sc.nextInt();
		  Configuration cf=new Configuration();
		  cf.configure("configuration.xml");
		  SessionFactory sf=cf.buildSessionFactory();
		  Session se=sf.openSession();
		  if(ch==1) {
		   Transaction tx=se.beginTransaction();
		   System.out.println("enter the salary how much want to add");
		   Query qr=se.createQuery("update Manager m set sal=sal+:sal");
		   qr.setParameter("sal", sc.nextInt());
		   qr.executeUpdate();
		   tx.commit();
		   }
		  if(ch==2) {
		   Transaction tx=se.beginTransaction();
		  
		   Query qr=se.createQuery("update Manager m set salary=salary+:msalary where id=:mid");
		   qr.setParameter("msalary", sc.nextInt());
		   qr.setParameter("mid", sc.nextInt());
		   qr.executeUpdate();
		   tx.commit();
		  }
		 }


	}


