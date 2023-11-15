package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import entities.ProductFunction;

public class ProgramFunction {

	public static void main(String[] args) {

		List<ProductFunction> list = new ArrayList<>();

		list.add(new ProductFunction("Tv", 900.00));
		list.add(new ProductFunction("Mouse", 50.00));
		list.add(new ProductFunction("Tablet", 350.50));
		list.add(new ProductFunction("HD Case", 80.90));

		
		/*Implementa��o da Interface
		 List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		 names.forEach(System.out::println);*/
		
		/*Refer�ncia com m�todo Static 
		 List<String> names = list.stream().map(ProductFunction ::staticUpperCaseName).collect(Collectors.toList());
	     names.forEach(System.out::println)
		 */
		
		/*Refer�ncia com m�todo N�o Static 
		 List<String> names = list.stream().map(ProductFunction :: nonStaticUpperCaseName).collect(Collectors.toList());
		 names.forEach(System.out::println)
		 */
		
		/*EXPRESS�O LAMBDA DECLARADA
		Function<ProductFunction, String> func = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(func).collect(Collectors.toList());*/

		/*EXPRESS�O LAMBDA INLINE
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());*/
		
		
	}
}