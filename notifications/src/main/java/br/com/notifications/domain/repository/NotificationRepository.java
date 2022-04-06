package br.com.notifications.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.notifications.domain.model.Notification;

public interface NotificationRepository extends MongoRepository<Notification, String>{

}
