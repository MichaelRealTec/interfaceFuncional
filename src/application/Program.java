package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
public class Program {

	public static void main(String[] args) {
		// Predicate / Function / Consumer <=> Expressão Lambda <=> Interface funcional
		//Predicate
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		// remover desta lista todos que tem o preço maior ou igual a 100
		list.removeIf(pred);
		//list.removeIf(Product::nonStaticProductPredicate);
		//list.removeIf(Product::staticProductPredicate);
		//list.removeIf(new ProductPredicate());
		// list.removeIf(p -> p.getPrice() >= 100);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
