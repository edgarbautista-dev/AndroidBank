package com.example.siuag.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.siuag.entity.Project;

import java.util.List;

@Dao
public interface ProjectDAO {

    @Query("SELECT * FROM project")
    List<Project> getAll();

    @Query("SELECT * FROM project WHERE title LIKE :title")
    Project findByTitle(String title);

    @Query("SELECT * FROM project WHERE id LIKE :id")
    Project findById(String id);

    @Update
    void updateProject(Project... projects);

    @Insert
    void insertAll(Project... projects);

    @Delete
    void delete(Project projects);
}
