package eu.h2020.symbiote.navigo.messages;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TestMessage {

    @JsonProperty
    private String yachtID;

    @JsonProperty
    private String portID;

    @JsonCreator
    public TestMessage(String yId, String pId){
	this.yachtID = yId;
	this.portID = pId;
    }

}


