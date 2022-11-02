package laptops;

public class Laptop {
	protected String brandName, modelName;
	protected Integer sellingPrice;
	
	protected Integer screenSize, storageCapacity; 
	protected Boolean isStorageSSD; 
	protected String os; 
	
	public Laptop(String brand, String model, Integer price){
		this.brandName = brand; 
		this.modelName = model; 
		this.sellingPrice = price;
	}

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

	public Integer getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(Integer storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public Boolean getIsStorageSSD() {
		return isStorageSSD;
	}

	public void setIsStorageSSD(Boolean isStorageSSD) {
		this.isStorageSSD = isStorageSSD;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	
	
	

}
