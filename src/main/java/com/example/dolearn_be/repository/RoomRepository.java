package com.example.dolearn_be.repository;

import com.example.dolearn_be.entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RoomRepository extends MongoRepository<Room, String> {
    List<Room> findAllByUserid(String userid);
}