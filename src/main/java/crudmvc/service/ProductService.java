package crudmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import crudmvc.dao.ProductDao;
import crudmvc.model.Product;
import java.util.*;

@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;
	
	public void createProduct(Product prod) {
		productDao.insert(prod);
	}
	
	public List<Product> getAllProducts() {
		return productDao.getAll();
	}
	
	public Product getAProduct(int pid) {
		return productDao.getSingle(pid);
	}
	
	public void deleteProduct(int pid) {
		productDao.delProd(pid);
	}
	
	public void updateProduct(Product prod) {
		productDao.update(prod);
	}
	
}
