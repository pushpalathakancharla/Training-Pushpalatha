package com.motivity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Delete {

	public static void delete() {
Scanner sc=new Scanner(System.in);
System.out.println("enter 1.delete single record 2.delete all records");
int ch=sc.nextInt();
Configuration cg=new Configuration();
cg.configure("confirguration.xml");
SessionFactory sf=cg.buildSessionFactory();
Session se=sf.openSession();
if(ch==1) {
	Transaction tx=se.beginTransaction();
	System.out.println("enter your partcular name");
	Query q=se.createQuery("delete from manager where name=:name");
	q.executeUpdate();
	tx.commit();
}
if(ch==2) {
	Transaction tx=se.beginTransaction();
	Query q=se.createQuery("delete from manager");
	q.executeUpdate();
	tx.commit();
}
	
}

	}


