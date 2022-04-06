package br.com.notifications.api.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.notifications.api.model.vo.NotificationsVO;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class NotificationResponseDto {
	
	private Long id;
	private String message;
	private List<NotificationsVO> notifications;
}
