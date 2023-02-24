package oopWithNLayerApp;

import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.core.logging.DatabaseLogger;
import oopWithNLayerApp.core.logging.FileLogger;
import oopWithNLayerApp.core.logging.logger;
import oopWithNLayerApp.dataAccess.HibernateProductDao;
import oopWithNLayerApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone Xr",10000);
		logger[] loggers = {new DatabaseLogger() , new FileLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
