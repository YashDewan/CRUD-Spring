package crudmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import crudmvc.model.Product;
import java.util.*;
import javax.transaction.Transactional;

@Repository
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insert(Product prod) {
		this.hibernateTemplate.saveOrUpdate(prod);
	}
	
	public List<Product> getAll() {
		List<Product> lst =  this.hibernateTemplate.loadAll(Product.class);
		return lst;
	}

	public Product getSingle(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}
	
	@Transactional
	public void delProd(int pid) {
		Product p = this.hibernateTemplate.get(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	
	@Transactional
	public void update(Product prod) {
		this.hibernateTemplate.update(prod);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
