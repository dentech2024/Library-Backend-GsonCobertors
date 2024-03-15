package com.dentech.library.GsonCobertors.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MessageInfoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty(required = true)
	private String text;
	
	@JsonProperty(required = true)
	private int code;

}
