package com.apiinfra.infra.mensages;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MessageResponseDTO {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
