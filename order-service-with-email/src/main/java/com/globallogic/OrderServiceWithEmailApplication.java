package com.globallogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.entity.Customer;
import com.globallogic.entity.Order;
import com.globallogic.entity.Product;
import com.globallogic.repository.OrderRepository;

@SpringBootApplication
public class OrderServiceWithEmailApplication implements CommandLineRunner {

	@SuppressWarnings("unused")
	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceWithEmailApplication.class, args);
	}

	/**
	 * To load some intial data into my Order MongoDB
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {

		Product product = new Product();
		product.setProductName("Iphone 13 (Black, 256GB)");
		product.setProductPrice(new Double(66999));

		Customer customer = new Customer();
		customer.setEmailId("kirangskumar98@gmail.com");
		customer.setName("Kiran Kumar G S");

		Order order = new Order();
		order.setId(new Long(1));
		order.setProduct(product);
		order.setCustomer(customer);

	// System.out.println("Inserted order : " + orderRepository.save(order));

	}

}
