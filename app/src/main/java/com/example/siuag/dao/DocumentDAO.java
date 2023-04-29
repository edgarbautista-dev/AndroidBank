package com.example.siuag.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.siuag.entity.Document;

import java.util.List;

@Dao
public interface DocumentDAO {

    @Query("SELECT * FROM document")
    List<Document> getAll();

    @Query("SELECT * FROM document WHERE name LIKE :name")
    Document findByName(String name);

    @Query("SELECT * FROM document WHERE id LIKE :id")
    Document findById(String id);

    @Update
    void updateDocuments(Document... documents);

    @Insert
    long insertDocument(Document document);
    @Insert
    void insertAll(Document... documents);

    @Delete
    void delete(Document document);
}
