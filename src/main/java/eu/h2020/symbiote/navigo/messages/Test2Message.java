package eu.h2020.symbiote.navigo.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

public class Test2Message {

    @JsonProperty("foo")
    private String foo;

    @JsonProperty("bar")
    private String bar;

    @JsonCreator
    public Test2Message(@JsonProperty("foo") String foo, @JsonProperty("bar") String bar){
	this.foo = foo;
	this.bar = bar;
    }


    @JsonProperty("foo")
    public String getFoo() {
        return foo;
    }
    
    @JsonProperty("bar")
    public String getBar() {
        return bar;
    }

    public String toString(){
        return "foo : " + foo + " bar: " + bar;
    }
}


