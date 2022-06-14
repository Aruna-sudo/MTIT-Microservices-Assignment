package com.mtit.product.persistance.repository;
import com.mtit.product.persistance.model.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, ObjectId>{
}
