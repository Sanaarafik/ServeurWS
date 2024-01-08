package requestpackage;
import javax.xml.ws.Endpoint;


public class SoapRequestPublisher {
	
	    public static void main(String[] args) {
	        Endpoint.publish("http://localhost:8000/requestservice", new RequestServiceImpl());
	        System.out.println("Service published at http://localhost:8000/requestservice");
	    }
	}

