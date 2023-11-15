package util;

import java.util.function.Function;

import entities.Product;
import entities.ProductFunction;

public class UpperCaseNameFunction implements Function<ProductFunction, String> {

	@Override
	public String apply(ProductFunction p) {
		return p.getName().toUpperCase();
	}
}
