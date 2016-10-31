public class Invoice {
	private String customerName = "";
	private int numItems = 2;
	private InvoiceLine Line1;
	private InvoiceLine Line2;
	
	public Invoice(String customerName){
		this.customerName = customerName;
	}
	
	public void setCustomerName(String cusName){
		this.customerName = cusName;
	}
	
	public String getCustomerName(){
		return(this.customerName);
	}
	//fixed issue
	public void addLine(String cName, int itemNumber, String itemDesc, 
			double itemPrice, int quanity){
		if(Line1 == null)
		{
			Line1 = new InvoiceLine(itemNumber,itemDesc,itemPrice,quanity);
		}
		else if(Line2 == null)
		{
			Line2 = new InvoiceLine(itemNumber,itemDesc,itemPrice,quanity);

		}
		else
		{
			System.out.println("ERROR!!!");
		}	
	}
	
	public double getInvoiceTotal(){
			double total = 0.0;	
			if(Line1 != null){
				total = (this.Line1.getLineTotal());
			}
			if(Line2 != null){
				total += total + this.Line2.getLineTotal(); //fixed issue
			}
			return total;
	}

	public String toString(){
		String outputStrg = "";
		outputStrg  += this.getCustomerName();
		outputStrg += this.getInvoiceTotal();
		return outputStrg;
	}
}