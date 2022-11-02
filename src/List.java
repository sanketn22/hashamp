import java.util.HashMap;
import java.util.Map;
import laptops.*;
import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Laptop ideaPad = new Laptop("Lenovo", "Ideadpad", 52490);
		ideaPad.setIsStorageSSD(true);
		ideaPad.setOs("Windows 10");
		ideaPad.setScreenSize(16);
		ideaPad.setStorageCapacity(320);
		
		Laptop macBookAir = new Laptop("Apple", "Macbook Air",64692);
		macBookAir.setIsStorageSSD(true);
		macBookAir.setOs("Mac OS");
		macBookAir.setScreenSize(16);
		macBookAir.setStorageCapacity(500);
		
		Laptop macBookPro = new Laptop("Apple", "Macbook Pro", 130000);
		macBookPro.setIsStorageSSD(true);
		macBookPro.setOs("Mac OS");
		macBookPro.setScreenSize(16);
		macBookPro.setStorageCapacity(500);
		
		Laptop vivoBook15 = new Laptop("Asus", "VivoBook 15", 38990);
		vivoBook15.setIsStorageSSD(false);
		vivoBook15.setOs("Chrome OS");
		vivoBook15.setScreenSize(12);
		vivoBook15.setStorageCapacity(420);
		
		
		Map<String, Laptop> lapList = new HashMap<>();
		lapList.put("Lenovo Ideadpad", ideaPad);
		lapList.put("Apple Macbook Air", macBookAir);
		lapList.put("Apple Macbook Pro", macBookPro);
		lapList.put("Asus VivoBook 15", vivoBook15);
		
		

		LaptopDB list = new LaptopDB(lapList);	

		ArrayList<Laptop> allLaptops = list.allLaptops();
		
		ArrayList<Laptop> byBrand = list.byBrand("Apple");
		
		ArrayList<Laptop> byMinStorage = list.byMinStorage(500);
		
		ArrayList<Laptop> byPrice = list.byPrice(false, 50000);
		
		ArrayList<Laptop> byScreenSize = list.byScreenSize(14);
		
		
		ArrayList<Laptop> byOS = list.byOS("Mac OS");
		ArrayList<Laptop> bySSD = list.isStorageSSD(false);
		
		
		
		
		for (int i = 0; i<bySSD.size(); i++) {
			Laptop a = bySSD.get(i); 
			System.out.println(a.getBrandName()+" "+a.getModelName()+" "+a.getIsStorageSSD());
		}
	}
}
