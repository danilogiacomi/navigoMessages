package eu.h2020.symbiote.navigo.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

public class ASCCheckYachtNeedsMessage {

    @JsonProperty("yachtID")
    private String yachtID;

    @JsonCreator
    public ASCCheckYachtNeedsMessage(@JsonProperty("yachtID") String yId){
	this.yachtID = yId;
    }


    @JsonProperty("yachtID")
    public String getYachtID() {
        return yachtID;
    }
    

    public String toString(){
        return "Yacht : " + yachtID ;
    }
}


