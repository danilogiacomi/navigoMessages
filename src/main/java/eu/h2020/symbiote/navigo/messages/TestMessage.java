package eu.h2020.symbiote.navigo.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

public class TestMessage {

    @JsonProperty
    private String yachtID;

    @JsonProperty
    private String portID;

    @JsonCreator
    public TestMessage(@JsonProperty("yacthID") String yId, @JsonProperty("portID") String pId){
	this.yachtID = yId;
	this.portID = pId;
    }

}


