import net.restfulwebservices.www.ServiceContracts._2008._01.*;
import net.restfulwebservices.www.DataContracts._2008._01.*;
import FaultContracts.GOTLServices._2008._01.DefaultFaultContract;

//Simple Client Example for
//http://www.restfulwebservices.net/wcf/CurrencyService.svc?wsdl

public class CurrencyServiceConsumer {

	public static void main(String[] args) {

		try
		{
			CurrencyServiceLocator factory = new CurrencyServiceLocator();
			
			ICurrencyService proxy = factory.getBasicHttpBinding_ICurrencyService();
			
			Currency result = proxy.getConversionRate(CurrencyCode.USD, CurrencyCode.RUB); 
			
			System.out.println("Conversion rate between " + 
			        CurrencyCode.USD + 
					" and " + CurrencyCode.RUB + 
					" is: " + result.getRate());
			
		}
		catch (Exception e)
		{
			System.out.println("Exception: " + e.toString());
		}
		
		
	}

}
