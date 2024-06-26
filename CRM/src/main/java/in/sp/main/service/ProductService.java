package in.sp.main.service;

import java.util.List;

import in.sp.main.entity.Product;
import in.sp.main.entity.SaleCourse;

public interface ProductService 
{
	public boolean addProductService(Product product);
	public List<Product>getAllProductService();
	public Product getProductDetailsService(String coursename);
	public List<String>getAllCourseNameService();
	public Product getSelectedCourseDetailsService(String course);
	public boolean addSaleCourseDetailsService(SaleCourse saleCourse);
	public List<Object[]>getPurchasedCourseCountService();
}
