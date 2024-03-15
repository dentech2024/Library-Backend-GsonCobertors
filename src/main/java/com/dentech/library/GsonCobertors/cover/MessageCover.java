package com.dentech.library.GsonCobertors.cover;

import java.io.Serializable;
import com.dentech.library.GsonCobertors.dto.MessageInfoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageCover implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MessageInfoDTO msg = new MessageInfoDTO();
	
	public MessageCover(int code, String text)
	{
		switch(code) {
			case 200:
				msg.setText(text!=null?text:"Transacción exitosa");
				break;
			case 500:
				msg.setText(text!=null?text:"Error en el servidor");
				break;
			case 409:
				msg.setText(text!=null?text:"Recurso incompleto");
				break;
			case 401:
				msg.setText(text);
				break;
			case 403:
				msg.setText(text!=null?text:"Acceso denegado");
				break;
			case 404:
				msg.setText(text!=null?text:"Recurso no existe");
				break;
			case 405:
				msg.setText(text!=null?text:"Recurso ya existe");
				break;
			case 204:
				msg.setText(text!=null?text:"No existen registros");
				break;
			default:
				break;
		}
		msg.setCode(code);
	}

	@JsonProperty("Message")
	public MessageInfoDTO getMessage() {
		return msg;
	}

	public void setMessage(String message, int code) {
		msg.setText(message);
		msg.setCode(code);
	}


}
