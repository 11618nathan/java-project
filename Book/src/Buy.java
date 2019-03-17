
public class Buy {
	
	//가격
	private int price;
	// 구매 수량
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
