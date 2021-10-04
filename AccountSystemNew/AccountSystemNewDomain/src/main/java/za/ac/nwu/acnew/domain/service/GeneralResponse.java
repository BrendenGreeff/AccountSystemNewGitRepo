package za.ac.nwu.acnew.domain.service;

public class GeneralResponse<S> {

    private final boolean successful;
    //private final transient S payload;
    private String payload;



    public GeneralResponse(boolean successful, S payload)
    {
        this.successful = true;
        this.payload = "No Types Found";

    }
    public boolean getSuccessful() {

        return successful;
    }
    public String getPayload() {

        return payload;
    }

}
