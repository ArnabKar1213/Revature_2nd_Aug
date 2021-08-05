package pack;

import java.lang.*;
import java.util.*;


public class Product implements Comparable<Product>{
	int id;
	String name;
	int cost;
	float rating;
	int quantity;

	public Product(int id,String name,int cost,float rating,int quantity) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.rating=rating;
		this.quantity=quantity;
		
	}
	public int compareTo(Product p){
		if(id==p.id) 
			return 0;
		else if (id>p.id)
			return 1;
		else
			return -1;
		
		}
	public String toString() {
		return "Id: " + id + " Name: "+ name + " Cost: "+ cost + " Rating: " + rating + "  Quantity: " + quantity;
	}
	
	/*public int hashCode() {
		return Objects.hash(id);
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product p = (Product) obj;
		return id == p.id;
	}*/
	public boolean equals(Object obj) {
		Product p = (Product) obj;

		return (this.id == p.id);
	}
}