package com.dentech.library.GsonCobertors;

import com.dentech.library.GsonCobertors.cover.MessageCover;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class App {
	
	private int code;
	private String text;
	private Object data;
	
	public App(int code, String text, Object data) {
		this.code = code;
		this.text = text;
		this.data = data;
	}
	
	public Object cobertor() {
		String json1 = null, json2 = null;
		MessageCover messageCover = new MessageCover(this.code, this.text);
		json1 = new Gson().toJson(messageCover);
		json2 = new Gson().toJson(this.data!=null?this.data:true);
		return "[" + json1 + "," + json2 + "]";
	}
	
    public static void main( String[] args ){
    }
}
