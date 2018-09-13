package eu.h2020.symbiote.navigo.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

public class PortnetCheckSSPMessage {

    
    @JsonProperty("SSPID")
    private String SSPID;
    
    @JsonCreator
    public PortnetCheckSSPMessage(
            @JsonProperty("SSPID") String sId,
        ){
        this.yachtID = yId;
        this.callbackUrl = cUrl;
        this.SSPID = sId;
        this.pierID = pId;
    }

    @JsonProperty("SSPID")
    public String getSSPID() {
        return SSPID;
    }

    public String toString(){
        return "SSP : " + SSPID ;
    }
}


