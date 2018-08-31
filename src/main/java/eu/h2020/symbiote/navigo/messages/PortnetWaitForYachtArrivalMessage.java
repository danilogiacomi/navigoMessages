package eu.h2020.symbiote.navigo.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

public class PortnetWaitForYachtArrivalMessage {

    @JsonProperty("yachtID")
    private String yachtID;

    @JsonProperty("callbackUrl")
    private String callbackUrl;

    @JsonCreator
    public PortnetWaitForYachtArrivalMessage(@JsonProperty("yachtID") String yId, @JsonProperty("callbackUrl") String cUrl){
        this.yachtID = yId;
        this.callbackUrl = cUrl;
    
    }

    @JsonProperty("yachtID")
    public String getYachtID() {
        return yachtID;
    }
    
    @JsonProperty("callbackUrl")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public String toString(){
        return "Yacht : " + yachtID ;
    }
}


