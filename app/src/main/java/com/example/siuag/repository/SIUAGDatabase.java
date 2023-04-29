package com.example.siuag.repository;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.siuag.dao.DocumentDAO;
import com.example.siuag.dao.ProjectDAO;
import com.example.siuag.dao.UserDAO;
import com.example.siuag.entity.User;

/*
* Como usar:
*             SIUAGDatabase db = SIUAGDatabase.getInstance(getApplicationContext());
            UserDAO userDAO =  db.userDAO();

            userDAO.insertAll(userDAO);
* */
@Database(entities = {User.class}, version = 1)
public abstract class SIUAGDatabase extends RoomDatabase {

    private static final String DB_NAME = "siuag_db";
    private static final String DB_URL = "database/siuag_db.db";
    private static SIUAGDatabase instance;

    public static synchronized SIUAGDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            SIUAGDatabase.class, DB_NAME).createFromAsset(DB_URL)
                    .fallbackToDestructiveMigration().allowMainThreadQueries().build();
        }

        return instance;
    }

    public abstract UserDAO userDAO();

    public abstract ProjectDAO projectDAO();

    public abstract DocumentDAO documentDAO();

}
