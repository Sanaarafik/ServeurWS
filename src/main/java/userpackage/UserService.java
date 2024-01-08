package userpackage;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import javax.jws.WebMethod;

@WebService
public interface UserService {
    @WebMethod
    String addUser(User user);
    
    @WebMethod
    List<User> getAllUsers();

    @WebMethod
    String addBenevole(User user);

    @WebMethod
    List<User> getBenevoles();

    @WebMethod
    String addValidator(User user);

    @WebMethod
    List<User> getValidators();

    @WebMethod
    String addDemandeur(User user);

    @WebMethod
    List<User> getDemandeurs();
}