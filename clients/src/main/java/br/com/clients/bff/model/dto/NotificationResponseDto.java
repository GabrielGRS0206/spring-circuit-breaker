package br.com.clients.bff.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.clients.bff.model.vo.NotificationVO;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class NotificationResponseDto {
	
	private Long id;
	private String message;
	private List<NotificationVO> notifications;
}
