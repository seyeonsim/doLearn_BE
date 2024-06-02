package com.example.dolearn_be.repository;


import com.example.dolearn_be.dto.MessageDto;
import com.example.dolearn_be.entity.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, String> {

    List<MessageDto> findByRoomid(String roomid);
    List<MessageDto> findByRoomidAndGrammarValidIsFalse(String roomid);



}
