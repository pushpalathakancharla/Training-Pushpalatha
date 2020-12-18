package com.motivity;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Display {

	public static void dispaly() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1.display all record 2.diplay particluar records");
		int ch=sc.nextInt();
		Configuration cg=new Configuration();
		cg.configure("confirguration.xml");
		SessionFactory sf=cg.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		if(ch==1) {
			   Query qr=se.createQuery("from manager m");
			   List<Manager> list=qr.list();
			   Iterator it=list.iterator();
			   while(it.hasNext()) {
			    Manager m=(Manager) it.next();
			    System.out.println(m.getId()+" "+m.getName()+" "+m.getSalary());
			   }
			  }
			  if(ch==2) {
			   System.out.println("dispaly particular record");
			   Query qr=se.createQuery("from manager m where name=:mname");
			   qr.setParameter("mname",sc.nextInt());
			   List<Manager> list=qr.list();
			   Iterator it=list.iterator();
			   while(it.hasNext()) {
			    Manager m=(Manager) it.next();
			    System.out.println(m.getId()+" "+m.getName()+" "+m.getSalary());
			   }
			  }
			 }

	}


