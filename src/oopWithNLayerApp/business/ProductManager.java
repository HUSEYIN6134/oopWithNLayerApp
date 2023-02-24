package oopWithNLayerApp.business;

import java.util.List;


import oopWithNLayerApp.core.logging.logger;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private logger [] loggers;
	

	public ProductManager(ProductDao productDao , logger [] loggers) { 
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception { 
		//iş kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
			
		}
		
		productDao.add(product);
		
		for(logger logger : loggers) { //[db,file]
			logger.log(product.getName());
			
			 
		}
		
		
	}

}
