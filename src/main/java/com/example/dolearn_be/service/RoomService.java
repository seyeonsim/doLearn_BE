package com.example.dolearn_be.service;

import com.example.dolearn_be.dto.RoomDto;
import com.example.dolearn_be.entity.Room;
import com.example.dolearn_be.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    RoomRepository roomRepository;

    public List<RoomDto> findAllByUserid(String userid) {
        List<Room> rooms = roomRepository.findAllByUserid(userid);
        List<RoomDto> result = new ArrayList<>();
        for (Room room: rooms) {
            RoomDto roomDto = RoomDto.builder()
                    .id(room.getId())
                    .userid(room.getUserid())
                    .ai(room.getAi())
                    .createdAt(room.getCreatedAt())
                    .build();
            result.add(roomDto);
        }
        return result;
    }

    public Room newRoom(Room room) {
        return roomRepository.insert(room);
    }

}
