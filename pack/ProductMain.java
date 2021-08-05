package pack;
import java.lang.*;
import java.util.*;

public class ProductMain {

	public ProductMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> l =new ArrayList<>();
		l.add(new Product(1967,"Product4",1242,4.34f,1));
		l.add(new Product(1435,"Product1",1246,4.34f,5));
		l.add(new Product(1175,"Product7",1246,4.5f,5));
		l.add(new Product(1635,"Product2",1566,2.70f,8));
		l.add(new Product(1588,"Product6",1228,3.67f,3));
		l.add(new Product(1878,"Product3",1747,3.62f,9));
		l.add(new Product(1967,"Product4",1242,4.34f,1));
		l.add(new Product(1233,"Product5",1241,4.0f,2));
		l.add(new Product(1635,"Product2",1566,2.70f,8));
		
		Collections.sort(l);
		System.out.println("Sorting based on id");
		print(l);
		System.out.println("=======================================================================");
		Collections.sort(l,new ProductNameComparator());
		System.out.println("Sorting based on name");
		print(l);
		System.out.println("=======================================================================");
		Collections.sort(l,new ProductRatingComparator());
		System.out.println("Sorting based on rating");
		print(l);
		System.out.println("=======================================================================");
		Set<Product> s = new HashSet<>();
		s.add(new Product(1967,"Product4",1242,4.34f,1));
		s.add(new Product(1435,"Product1",1246,4.34f,5));
		s.add(new Product(1175,"Product7",1246,4.5f,5));
		s.add(new Product(1635,"Product2",1566,2.70f,8));
		s.add(new Product(1588,"Product6",1228,3.67f,3));
		s.add(new Product(1878,"Product3",1747,3.62f,9));
		s.add(new Product(1967,"Product4",1242,4.34f,1));
		s.add(new Product(1233,"Product5",1241,4.0f,2));
		s.add(new Product(1635,"Product2",1566,2.70f,8));
		System.out.println("Deleting duplicates by implementing Set Interface");
		printSet(s);
	}
	public static void print(List<Product> l1) {
		for(Product p1: l1)
			System.out.println(p1);
	}
	public static void printSet(Set<Product> s1) {
		for(Product p1: s1)
			System.out.println(p1);
	}
}
