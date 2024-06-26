package com.example.dolearn_be.repository;

import com.example.dolearn_be.entity.MissionEntity;
import com.example.dolearn_be.entity.User;
import com.example.dolearn_be.entity.UserMissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMissionRepository extends JpaRepository<UserMissionEntity, Integer> {
    List<UserMissionEntity> findByUserIdAndMissionId_Course(User user, String course);
    List<UserMissionEntity> findByUserIdAndCompleteAndLearn(User user, boolean complete, boolean learn);
    List<UserMissionEntity> findByUserIdAndLearnAndMissionId_Course(User user, boolean learn, String course);
    UserMissionEntity findByUserIdAndMissionIdAndLearn(User user, MissionEntity mission, boolean learn);
    List<UserMissionEntity> findByUserIdAndMissionId_MissionIdIn(User user, List<String> missions);

    List<UserMissionEntity> findByMissionId_MissionIdIn(List<String> missionIds);

}
