package eu.h2020.symbiote.navigo.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

public class PortnetWaitForYachtArrivalMessage {

    @JsonProperty("yachtID")
    private String yachtID;
    
    @JsonProperty("SSPID")
    private String SSPID;
    
    @JsonProperty("pierID")
    private String pierID;

    @JsonProperty("callbackUrl")
    private String callbackUrl;

    @JsonCreator
    public PortnetWaitForYachtArrivalMessage(
            @JsonProperty("yachtID") String yId, 
            @JsonProperty("callbackUrl") String cUrl,
            @JsonProperty("SSPID") String sId,
            @JsonProperty("pierID") String pId
        ){
        this.yachtID = yId;
        this.callbackUrl = cUrl;
        this.SSPID = sId;
        this.pierID = pId;
    }

    @JsonProperty("yachtID")
    public String getYachtID() {
        return yachtID;
    }
    
    @JsonProperty("SSPID")
    public String getSSPID() {
        return SSPID;
    }
    @JsonProperty("pierID")
    public String getPierID() {
        return pierID;
    }
    
    @JsonProperty("callbackUrl")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public String toString(){
        return "Yacht : " + yachtID ;
    }
}


