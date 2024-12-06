package com.nit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Array;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.entity.Employee;
import com.nit.entity.Product;
import com.nit.repository.EmployeeRepository;
import com.nit.repository.ProductRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmployeeRepository repository = run.getBean(EmployeeRepository.class);

		System.out.println("Implemented Class :: " + repository.getClass().getName());

		/*
		 * Employee emp = new Employee();
		 * 
		 * 
		 * emp.setEmpId(112); emp.setEmpName("JRK"); emp.setEmpMobile(90007889);
		 * emp.setEmpSal(750000.0);
		 * 
		 * repository.save(emp);
		 * 
		 * Employee e1 = new Employee(113,"Roman",99389842,67890.0); Employee e2 = new
		 * Employee(114,"Venky",77774444,77440.0); Employee e3 = new
		 * Employee(115,"Naresh",1236542,50000.0);
		 * 
		 * List<Employee> emps = new ArrayList<>();
		 * emps.add(e1);emps.add(e2);emps.add(e3);
		 * 
		 * repository.saveAll(emps);
		 * 
		 * 
		 * 
		 * // System.out.println("Total records are :"+repository.count());
		 * 
		 * 
		 * // System.out.println("Person is present or not with the id :"+
		 * repository.existsById(111));
		 * 
		 * 
		 * 
		 * Optional<Employee> byId = repository.findById(111); if(byId.isPresent()) {
		 * System.out.println("Record is available ..."); } else {
		 * System.out.println("Record is not available..."); }
		 * 
		 * 
		 * 
		 * // Iterable<Employee> all = repository.findAll(); //all.forEach(emps
		 * ->System.out.println(emps));
		 * 
		 * 
		 * List<Serializable> empIds = new ArrayList<>(); empIds.add(111);
		 * empIds.add(112); empIds.add(113); empIds.add(123);
		 * 
		 * 
		 * Iterable<Employee> allById = repository.findAllById(empIds);
		 * allById.forEach(emps ->System.out.println(emps));
		 * 
		 * 
		 * 
		 * 
		 * repository.deleteById(101); System.out.println(" record :: Deleted ");
		 * 
		 * 
		 * 
		 * 
		 * List<Serializable> empIdss = new ArrayList<>(); empIdss.add(111);
		 * empIdss.add(112); empIdss.add(113);
		 * 
		 * repository.deleteAllById(empIdss);
		 * 
		 * 
		 * 
		 * 
		 * //repository.deleteAll();
		 * 
		 */
		
		
		ProductRepo pr = run.getBean(ProductRepo.class);
		/*
		 * Product product = new Product(111,"Desktop",50000.0, 5); //pr.save(product);
		 * 
		 * List<Product> list = new ArrayList<>();
		 * 
		 * Product p1 = new Product(112,"Redmi Mobile",20000.0,10); Product p2 = new
		 * Product(113,"Apple Mobile",67000.0,4); Product p3 = new Product
		 * (114,"Boat Watch",1200.0,4); list.add(p1);list.add(p2);list.add(p3);
		 * Iterable<Product> saveAll = pr.saveAll(list);
		 */
		
		
		//pr.findAll();
		//System.out.println(pr.findAll());
		 
		/*
		 * List<Serializable> pids = new ArrayList<>();
		 * pids.add(111);pids.add(112);pids.add(113);pids.add(116); Iterable<Product>
		 * allById = pr.findAllById(pids); allById.forEach(pid
		 * ->System.out.println(pid));
		 */
		
		//System.out.println(pr.findById(111));
		/*
		 * boolean existsById = pr.existsById(111); if(existsById) {
		 * System.out.println("Product is existed ..."); } else {
		 * System.out.println("Product not available..."); }
		 */
		
		//  System.out.println(pr.count());
		
		//pr.deleteById(111);
		
		/*
		 * List<Serializable> list = new ArrayList<>();
		 * list.add(112);list.add(113);list.add(333);
		 * 
		 * pr.deleteAllById(list);
		 */
		
		//pr.deleteAll();
		  System.out.println("=========Records deleted =========");
		 
	}

}
