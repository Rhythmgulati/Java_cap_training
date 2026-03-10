package com.jpql_product;


import java.util.List;

import com.sun.org.apache.xpath.internal.operations.And;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class ProductMain { 
	// TODO Auto-generated constructor stub
	public static void main(String []args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	EntityManager em = emf.createEntityManager();
//	
//	TypedQuery<String> p = em.createQuery("select p.name from Product p ",String.class);
//	List<String> li = p.getResultList();
//	
//	for(String a:li) {
//		System.out.println(a);
//	}
//	System.out.println("Hello");
//	
//	TypedQuery<Object[]> pi = em.createQuery("select p.name from Product p ",Object[].class);
//	List<Object[]> lib = pi.getResultList();
//	
//	lib.forEach(n->System.out.println(n[0]));
//	System.out.println("Hello");
//	
	
//	
//	UPDATE
//	em.getTransaction().begin();
//    Query Q = em.createQuery("update Product p set p.quantity=200 where p.id=101");
//	int row= Q.executeUpdate();
//	System.out.println(row+"updated");

//	em.getTransaction().begin();
//	Query query=em.createNativeQuery("")
	
	
//	
//	CriteriaBuilder cb = em.getCriteriaBuilder();
//	CriteriaQuery<Product> cq = cb.createQuery(Product.class);
//	Root<Product> r = cq.from(Product.class);
//	Predicate con1=cb.lessThan(r.get("quantity"), 500);
//	Predicate con2=cb.like(r.get("name"), "%%");
	
//	cq.select(r).where(cb.and(con1,con2)).orderBy(cb.asc(r.get("name")));
//	List<Product> li = em.createQuery(cq).getResultList();
//	li.forEach(n->System.out.println(n));
//	}
	}
