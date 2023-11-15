package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;

		/*PREDICADO COM EXPRESS�QO LAMBDA.
		Predicate<Product> pred = p -> p.getPrice () >=min;
		list.removeIf(pred);*/
		
		/*PREDICADO COM EXPRESS�QO LAMBDA inline.
		
		list.removeIf(p -> p.getPrice () >=min);*/
		
		/*MetodoStatic -Reference Metod
		list.removeIf(Product :: staticProductPredicate);*/
		
		/*MetodoNoStatic -Reference Metod
		 list.removeIf(Product :: nostaticProductPredicate)*/
		//list.removeIf(p -> p.getPrice() >= min); Lambda

		for (Product p : list) {
			System.out.println(p);
		}
	}
}