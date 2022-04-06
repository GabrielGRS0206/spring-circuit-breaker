package br.com.notifications.api.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.notifications.api.model.dto.NotificationResponseDto;
import br.com.notifications.api.model.vo.NotificationsVO;
import br.com.notifications.domain.model.Notification;

@Component
public class NotificationMapper {

	private static final String NOTIFICATIONS_RETRIEVED_SUCCESSFULLY = "Notifications retrieved successfully";
	private static final String NO_NOTIFICATION_TO_RETRIEVE = "No notification to retrieve";
	
	private List<NotificationsVO> jsonToList(String notification) {
		if(Strings.isNotEmpty(notification)) {
			@SuppressWarnings("rawtypes")
			TypeToken t = new TypeToken<List<NotificationsVO>>() {};
			return new Gson().fromJson(notification, t.getType());
		}

		return null;
	}

	public List<NotificationResponseDto> toDto(List<Notification> list) {
		
		List<NotificationResponseDto> listNotifications = new ArrayList<>();
		
		for(Notification notification : list) {
			
			var response = new NotificationResponseDto();
			response.setId(notification.getId());
			response.setNotifications(jsonToList(notification.getNotification()));
			
			if(!CollectionUtils.isEmpty(response.getNotifications())) {
				response.setMessage(NOTIFICATIONS_RETRIEVED_SUCCESSFULLY);
			} else {
				response.setMessage(NO_NOTIFICATION_TO_RETRIEVE);
			}
			listNotifications.add(response);
		}

		return listNotifications;
	}
}
