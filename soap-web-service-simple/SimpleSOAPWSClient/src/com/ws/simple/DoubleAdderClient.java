/**
 * Simple client to demonstrate soap web service consumption 
 */
package com.ws.simple;

public class DoubleAdderClient {

	/**
	 * Simple client to demonstrate soap web service consumption: adds 2 double arguments
	 * @param args String array
	 */
	public static void main(String[] args) {
		
		System.out.println("Simple client to demonstrate soap web service consumption: adds 2 double arguments i.e. \"3.2\" \"2.3\"");
		
		if (args.length == 2) 
		{
			double x = Double.parseDouble(args[0]);
			double y = Double.parseDouble(args[1]);
		
			try{
				DoubleAdderServiceLocator factory = new DoubleAdderServiceLocator();
				
				DoubleAdder proxy = factory.getDoubleAdder();
				
				double result = proxy.add(x, y);
				
				System.out.println("Result of calling web service: " + result);
				
			}
			catch (Exception e){
				System.out.println("Exception: " + e.toString());
			}
		}
		else
		{
			System.out.println("No command line parameters specified");
		}

	}

}
