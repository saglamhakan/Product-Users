package business.abstracts;

import core.utilities.results.DataResult;
import core.utilities.results.Result;
import entities.concretes.Product;
import entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
   DataResult<List<Product>> getAll();

   DataResult<List<Product>> getAllSorted();

   DataResult<List<Product>> getAll(int pageNo, int pageSize);
   Result add(Product product);

   DataResult<Product> getByProductName(String productName);

   DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);

   DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

   DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

   DataResult<List<Product>> getByProductNameStartsWith(String productName);

   DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

   DataResult<List<Product>> getByProductNameContains(String productName);

   DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();

}
