package requestpackage;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RequestService {
    @WebMethod
    Request addRequest(Request request);
}