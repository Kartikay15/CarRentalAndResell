package com.hibernate.controller;

import org.hibernate.SessionFactory;

import jakarta.persistence.Persistence;

public class ProductController {
	public static void main(String args[]) {
		System.out.println("Works");
		// I need to reach to persistence.xml
		SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory("myecomapp");
		System.out.println(sessionFactory);
	}
}
