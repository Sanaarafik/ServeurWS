package userpackage;

import javax.jws.WebService;

import java.util.ArrayList;
import java.util.List;


@WebService(endpointInterface = "userpackage.UserService")
public class UserServiceImpl implements UserService {
    private List<User> users = new ArrayList<>();
    
    @Override
    public List<User> getDemandeurs() {
        List<User> demandeurs = new ArrayList<>();
        for (User user : users) {
            if (user.getUserType() == User.UserType.DEMANDEUR) {
                demandeurs.add(user);
            }
        }
        return demandeurs;
    }

    @Override
    public List<User> getBenevoles() {
        List<User> benevoles = new ArrayList<>();
        for (User user : users) {
            if (user.getUserType() == User.UserType.BENEVOLE) {
                benevoles.add(user);
            }
        }
        return benevoles;
    }

    @Override
    public List<User> getValidators() {
        List<User> validators = new ArrayList<>();
        for (User user : users) {
            if (user.getUserType() == User.UserType.VALIDATEUR) {
                validators.add(user);
            }
        }
        return validators;
    }

    @Override
    public String addUser(User user) {
        users.add(user);
        return "User added: " + user.getName();
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    public String addBenevole(User user) {
        user.setUserType(User.UserType.BENEVOLE);
        addUser(user);
        return "Benevole added: " + user.getName();
    }

    public String addValidator(User user) {
        user.setUserType(User.UserType.VALIDATEUR);
        addUser(user);
        return "Validator added: " + user.getName();
    }

    public String addDemandeur(User user) {
        user.setUserType(User.UserType.DEMANDEUR);
        addUser(user);
        return "Demandeur added: " + user.getName();
    }
}