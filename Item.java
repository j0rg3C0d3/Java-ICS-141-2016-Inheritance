public class Item {
	private int itemNum = 0;
	private String itemDescription = "";
	private double itemPrice = 0.0;
	
	public Item(int itemNum,String itemDesc, double itemPrice){
		this.itemNum = itemNum;
		this.itemDescription = itemDesc;
		this.itemPrice = itemPrice;
	}
	
	public void setItemNumber(int itemNumber){
		this.itemNum = itemNumber;
	}
	
	public void setItemDescription(String itemDescription){
		this.itemDescription = itemDescription;
	}

	public void setItemPrice(double itemPrice){
		this.itemPrice = itemPrice;
	}
	
	public int getItemNumber(){
		return (this.itemNum);
	}
	
	public String getItemDescription(){
		return (this.itemDescription);
	}
	
	public double getItemPrice(){
		return(this.itemPrice);
	}
	
	public String toString(){
		String outputStr = "";
		outputStr = outputStr + 
				"Item Number: " + this.getItemNumber() + 
				"\n" + "Item Description: " 
				+ this.itemDescription + "\n"
				+"Item Price:$ "+ this.itemPrice;
		return outputStr;
	}
}
