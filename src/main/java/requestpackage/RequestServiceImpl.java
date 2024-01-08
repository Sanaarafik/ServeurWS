package requestpackage;

import javax.jws.WebService;

@WebService(endpointInterface = "requestpackage.RequestService")
public class RequestServiceImpl implements RequestService {
	
	@Override
    public Request addRequest(Request request) {
        Long demandeurId = request.getDemandeurId();
        Long validatorId = request.getValidatorId();

        if (demandeurId != null && validatorId != null) {
            request.setStatus(Request.RequestStatus.VALIDEE);
        } else {
            request.setStatus(Request.RequestStatus.REFUSEE);
        }

        // Return the modified Request object
        return request;
    }
}