
public class Buy {
	
	//����
	private int price;
	// ���� ����
	private int purchasingQuantity;
	
	public int getPurchasingQuantity() {
		return purchasingQuantity;
	}

	public void setPurchasingQuantity(int purchasingQuantity) {
		this.purchasingQuantity = purchasingQuantity;
	}

	public int getprice() {
		return price;
	}
	
	public Buy() {
		price = 0;
		purchasingQuantity= 0;
	}
	
	public void setPrice(int newPrice) {
		if(newPrice > 0)
			price = newPrice;
	}

}
