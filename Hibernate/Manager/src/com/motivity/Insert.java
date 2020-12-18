package com.motivity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void insert(){
		Scanner sc=new Scanner(System.in);
String ch;
do {
	System.out.println("Enter manager datails(id,name,salary)");
	Configuration cg=new Configuration();
	cg.configure("confirguration.xml");
	SessionFactory sf=cg.buildSessionFactory();
	Session se=sf.openSession();
	Manager m=new Manager();
	Transaction tx=se.beginTransaction();
	m.setName(sc.next());
	m.setId(sc.nextInt());
	m.setSalary(sc.nextInt());
	se.save(m);
	tx.commit();
	System.out.println("Do you want continue(y/n)");
	ch=sc.next();
	
}while(ch.equals("y"));
	}


}

