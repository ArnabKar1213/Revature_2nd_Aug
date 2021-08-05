package pack;
 
import java.util.*;
import java.lang.*;

public class ProductRatingComparator implements Comparator <Product> {

	public ProductRatingComparator() {
		// TODO Auto-generated constructor stub
	}
	public int compare(Product p1,Product p2) {
		Float f1=p1.rating;
		Float f2=p2.rating;
		return f1.compareTo(f2);
	}
}
