package com.app;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee e1=new Employee(101, "Rohit", "CSE");
		Employee e2=new Employee(102, "Raj", "Developer");
		Employee e3=new Employee(103, "Mohit", "IT");
		Employee e4=new Employee(104, "John", "SDE");
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		//printing data of employee with id=101 after retrieve
		Employee e=(Employee) session.get(Employee.class, 101);
		System.out.println(e);
		
		//updating data of employee like department in this
		e1.setEmpDept("Testing");
		
		//deleting data of employee with name=Raj
		session.delete("Raj", e2);
		
		//printing list of employee
		Query query=session.createQuery("from com.app.model.Employee order by emp_id");
		List<Employee> empList=query.list();
		for(Employee i:empList) {
			System.out.println(i);
		}
		
		
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
