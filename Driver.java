
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Invoice newCustomer = new Customer("Jorge") // this was created, but Invoice Line
		//did not have access to Invoice.
		InvoiceLine newLine = new InvoiceLine( 4500,"Galaxy 7",700, 2);
		
		InvoiceLine newLine2 = new InvoiceLine( 500, "Iphone 7 Plus", 778.00, 4);
		
		
		System.out.println(newLine.toString());
		
		System.out.println();
		
		System.out.println(newLine2.toString());
		
	}

}
