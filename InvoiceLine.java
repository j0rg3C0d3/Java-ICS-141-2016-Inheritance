//Records an items  sold and the quantity
public class InvoiceLine {
	private Item itemSold;
	private int quantity = 0;
	//private Invoice customerName;
		
	//added  Invoice CustoerName and included CustomerName in Custructorl.
	public InvoiceLine( int itemNum,String itemDesc, double itemPrice, int quantity){
		itemSold = new Item(itemNum, itemDesc, itemPrice);
		//this.customerName = new Invoice(customerName);
		this.quantity = quantity;
	}
	
	public void setItemSold(Item newItem){
		this.itemSold = newItem;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public Item getItemSold(){
		return (this.itemSold);
	}
	
	public int getQuantity(){
		return (this.quantity);
	}
	
	public double getLineTotal(){
		double total = 0.0;
		if(this.quantity != 0.0){
			total =  (quantity*this.itemSold.getItemPrice());
		}
		return total;
	}
	
	public String toString(){
		String outputStr = "";
		outputStr = outputStr + "Customer Name: " + "\n"
				+ this.itemSold.toString() + "\n"
				+ "Quantity: " + this.quantity;
		return outputStr;
	}
	

}