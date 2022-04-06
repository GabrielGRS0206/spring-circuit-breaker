package br.com.notifications.domain.repository.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import br.com.notifications.domain.enums.StatusNotification;
import br.com.notifications.domain.model.Notification;
import br.com.notifications.domain.repository.NotificationsRepositotyQueries;

public class NotificationRepositoryImpl implements NotificationsRepositotyQueries {

	@Autowired
	public JdbcTemplate template;
	
	private final Logger LOGGER = LoggerFactory.getLogger(NotificationRepositoryImpl.class);
	
	@Override
	public List<Notification> findByIdNotificationsOpen(Long id) {
		//TODO refatorar
		try {
			String sql = " SELECT c.* from notification c"
					+ " WHERE c.client_id = "+id+" "
					+ " AND c.status = '"+StatusNotification.OPEN.getValue()+"' ";
			
			return template.query(sql,
					(rs, rowNum) -> 
			new Notification(rs.getLong("id"),
							rs.getLong("client_id"), 
							rs.getString("status"),
							rs.getString("notification")));
		} catch (Exception e) {
			LOGGER.error("Error search", e.getCause(), e.getMessage());
		} finally {
			LOGGER.info("Search notifications ok");
		}
		return null;
	}
}
