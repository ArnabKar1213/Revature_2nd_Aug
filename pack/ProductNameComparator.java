package pack;
import java.util.*;
import java.lang.*;

public class ProductNameComparator implements Comparator<Product> {

	public ProductNameComparator() {
		// TODO Auto-generated constructor stub
	}
	public int compare(Product p1,Product p2) {
		return p1.name.compareTo(p2.name);
	}
}
