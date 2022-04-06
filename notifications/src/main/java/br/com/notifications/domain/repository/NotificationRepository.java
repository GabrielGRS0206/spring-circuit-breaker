package br.com.notifications.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.notifications.domain.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>, NotificationsRepositotyQueries{

}
