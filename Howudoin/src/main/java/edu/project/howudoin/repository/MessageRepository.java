package edu.project.howudoin.repository;
import edu.project.howudoin.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, Integer> {

}