package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import util.PriceUpdateConsumer;

import entities.ProductConsumer;

public class ProgramConsumer {

	public static void main(String[] args) {

		

		List<ProductConsumer> list = new ArrayList<>();

		list.add(new ProductConsumer("Tv", 900.00));
		list.add(new ProductConsumer("Mouse", 50.00));
		list.add(new ProductConsumer("Tablet", 350.50));
		list.add(new ProductConsumer("HD Case", 80.90));

		double factor = 1.1;
		
		
		/*LAMBDA inline
		list.forEach(p ->p.setPrice(p.getPrice()*factor));
		list.forEach(System.out::println);*/
		
		
		/*LAMBDA DECLARADA
		Consumer<ProgramConsumer> cons = p -> {
			p.setPrice(p.getPrice()*factor);
		};
		list.forEach(cons);
		list.forEach(System.out::println);*/

		/* IMPLEMENTAÇÃO DA INTERFACE
		 * Fizemos o Consumer e colocamos dentro do ForEach, ele executou e atualizou os preços.
		list.forEach(new PriceUpdateConsumer() );
		list.forEach(System.out::println);*/
		
				
		/*REFERÊNCIA DO MÉTODO ESTÁTICO
		list.forEach(ProductConsumer :: staticPriceUpdate);
		list.forEach(System.out::println);*/
		
		/*REFERÊNCIA PARA MÉTODO NÃO STATICO
		list.forEach(ProductConsumer :: noStaticPriceUpdate);
		list.forEach(System.out::println)
		 * */
		 
	}
	}


