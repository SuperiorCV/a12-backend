package com.example.sexam.repository;

import com.example.sexam.entity.screenshot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScreenshotRepository extends JpaRepository<screenshot, String> {
    @Query("select  sc from screenshot sc where sc.eid=?1 and sc.studentUsername=?2")
    List<screenshot> findAllScreenShotByEidAndStudentUsername(String eid, String studentUsername);
}
