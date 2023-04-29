package com.example.siuag.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Blob;

@Entity(tableName = "document")
public class Document {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "file")
    private byte[] file;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @ColumnInfo(name = "userid")
    private int userID;
}
