package io.daniellavoie.confluent.cdc.sqlserver;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	private final Payload payload;
	private final Field schema;

	@JsonCreator
	public Event(@JsonProperty("payload") Payload payload, @JsonProperty("schema") Field schema) {
		this.payload = payload;
		this.schema = schema;
	}

	public Payload getPayload() {
		return payload;
	}

	public Field getSchema() {
		return schema;
	}
}
