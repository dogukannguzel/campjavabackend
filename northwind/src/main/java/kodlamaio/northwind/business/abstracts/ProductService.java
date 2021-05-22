package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

import javax.xml.crypto.Data;
import java.util.List;

public interface ProductService {
   DataResult<List<Product>> getAll();
   Result add(Product product);
  
}
