package com.example.studentapp_backend3.dao;

import com.example.studentapp_backend3.model.Students;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDao extends CrudRepository<Students,Integer> {
    @Query(value = "SELECT `id`, `name`, `rollno`, `admno`, `college` FROM `students` WHERE `rollno`=:rollno",nativeQuery = true)
    List<Students> Searchstu(@Param("rollno")Integer rollno);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `students` WHERE `id` =:id",nativeQuery = true)
    void deleteStu(@Param("id")Integer id);
}
