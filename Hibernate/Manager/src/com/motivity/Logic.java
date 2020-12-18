package com.motivity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {
public static void main(String[] args) {
	Configuration cg=new Configuration();
	cg.configure("confirguration.xml");
	SessionFactory sf=cg.buildSessionFactory();
	Session se=sf.openSession();
	Transaction tx=se.beginTransaction();
	Manager m=new Manager();
	tx.commit();
	Scanner sc=new Scanner(System.in);

	System.out.println("1.Insert,2.Update,3.Delete,4.Display,5.Exit");
	for(int n=0;n<=5;) {
	System.out.println("Enter your  number 1 to 5");
	n=sc.nextInt();
	if(n==1)
		Insert.insert();
	else if(n==2)
		Update.update();
	else if(n==3)
		Delete.delete();
	else if(n==4)
		Display.dispaly();
		}
}
}


