package com.prep.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		
		List<Product> produList = new ArrayList<>();
		produList.add(new Product(1, "HP", 45999));
		produList.add(new Product(2, "Dell",69999));
		produList.add(new Product(3, "Lenovo", 45999));
		produList.add(new Product(4, "ACER", 45999));
		produList.add(new Product(5, "Apple", 95999));
		System.out.println(produList);
		List<Product> prods = new ArrayList<>();
		
		prods = produList.stream().filter(n -> n.price > 50000).collect(Collectors.toList());
		System.out.println(prods);
		System.out.println();
		 produList.stream()
		 					.filter(n -> n.price > 50000)//filter
		 					.forEach(n ->System.out.println(n.price));//iteration
		 System.out.println();
		 produList.stream().filter(n -> n.price > 50000).forEach(System.out::println);
		 
		 

	}

}


class Product{
	
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
}
