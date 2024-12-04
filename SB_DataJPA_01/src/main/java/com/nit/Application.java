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
		
		Product product = new Product(111,"Desktop",50000.0, 5);
		
		System.out.println("=========Records deleted =========");
	}

}
