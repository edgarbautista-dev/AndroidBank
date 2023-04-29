package com.example.siuag.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.siuag.entity.User;

import java.util.List;

@Dao
public interface UserDAO {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE username LIKE :username")
    User findByUserName(String username);

    @Query("SELECT * FROM user WHERE name LIKE :name")
    User findByName(String name);

    @Query("SELECT * FROM user WHERE lastname LIKE :lastname")
    User findByLastname(String lastname);

    @Query("SELECT * FROM user WHERE id LIKE :id")
    User findById(String id);

    @Update
    void updateUsers(User... users);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}
