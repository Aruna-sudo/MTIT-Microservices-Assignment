package com.mtit.delivery.persistance.repository;
import com.mtit.delivery.persistance.model.Delivery;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryRepository extends MongoRepository<Delivery, ObjectId> {}
