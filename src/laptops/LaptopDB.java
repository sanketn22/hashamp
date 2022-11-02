package laptops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LaptopDB {
	
	protected Map<String, Laptop> map; 
	
	public LaptopDB(Map list){
		this.map = list;		
	}
	
	public ArrayList<Laptop> allLaptops() {
		ArrayList<Laptop> all = new ArrayList(){
			 {
				 for(Map.Entry m : map.entrySet()){
					 add(m.getValue());
					 }
			 }
			};
		 	return all; 
	}
	
	public ArrayList<Laptop> byBrand(String b) {
		 ArrayList<Laptop> brand = new ArrayList(){
			 {
				 for(Map.Entry m : map.entrySet()){
					 Laptop a= (Laptop) m.getValue();
					 
					 if(b.equals(a.brandName))
					 {						
						 add(m.getValue());
					 }
				 }
			 	}
		 };
		 	return brand; 
		}
	
	public ArrayList<Laptop> byPrice(boolean p, Integer q){
		
		if(p == true) {
		ArrayList<Laptop> priceLow = new ArrayList() {
			{
				for(Map.Entry m: map.entrySet()) {
					Laptop a = (Laptop) m.getValue();
					if(a.getSellingPrice()<=q) {
						
						add(m.getValue());
					}
				}
			}
		};
		return priceLow;
		}
		else {
		ArrayList<Laptop> priceHigh = new ArrayList() {
			{
				for(Map.Entry m :map.entrySet()){
					Laptop a = (Laptop) m.getValue();
					if(a.getSellingPrice()>q) {
						add(m.getValue());						
					}						
				}
			}
		};
		return priceHigh;
	}
		
	}
	
	public ArrayList<Laptop> byScreenSize(Integer w){
		ArrayList<Laptop> screen = new ArrayList() {
			{
				for(Map.Entry m :map.entrySet()){
					Laptop a = (Laptop) m.getValue();
					if(a.getScreenSize()==w) {
						add(m.getValue());						
					}
						
				}
			}
		};
		return screen;
	}
	
	public ArrayList<Laptop> byMinStorage(Integer y){
		ArrayList<Laptop> storage = new ArrayList() {
			{
				for(Map.Entry m :map.entrySet()){
					Laptop a = (Laptop) m.getValue();
					if(a.getStorageCapacity()>=y) {
						add(m.getValue());						
					}
						
				}
			}
		};
		return storage;
	}

	public ArrayList<Laptop> isStorageSSD(boolean u){
		ArrayList<Laptop> ssd = new ArrayList() {
			{
				for(Map.Entry m :map.entrySet()){
					Laptop a = (Laptop) m.getValue();
					if(a.getIsStorageSSD()==u) {
						add(m.getValue());						
					}
						
				}
			}
		};
		return ssd;
	}

	public ArrayList<Laptop> byOS(String o){
		ArrayList<Laptop> os = new ArrayList() {
			{
				for(Map.Entry m :map.entrySet()){
					Laptop a = (Laptop) m.getValue();
					if(o.equals(a.os)) {
						add(m.getValue());						
					}
						
				}
			}
		};
		return os;
	}
}

	

