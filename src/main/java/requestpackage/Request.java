package requestpackage;

public class Request {
	private Long id;

   
    private Long demandeurId;

   
    private Long benevoleId;

  
    private Long validatorId; 

    
  
    private RequestStatus status; 

    public enum RequestStatus {
        EN_ATTENTE, VALIDEE, REALISEE, REFUSEE;
    }
    	
    	public Request() {
            this.status = RequestStatus.EN_ATTENTE; // Set the initial status to EN_ATTENTE
        }

        // Getters and setters for id, demandeurId, benevoleId, and validatorId

        public RequestStatus getStatus() {
            return status;
        }

        public void setStatus(RequestStatus status) {
            this.status = status;
        }
        public Long getDemandeurId() {
            return demandeurId;
        }
        public Long getValidatorId() {
            return validatorId;
        }

        public static void processRequest(Request request) {
            if (request.demandeurId != null && request.validatorId != null) {
                request.status = RequestStatus.VALIDEE; // Request is accepted
            } else {
                request.status = RequestStatus.REFUSEE; // Request is refused
            }
        }


}
    
