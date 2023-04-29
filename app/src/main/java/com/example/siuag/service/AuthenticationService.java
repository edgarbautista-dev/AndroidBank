package com.example.siuag.service;

import android.content.Context;

import androidx.room.util.StringUtil;

import com.example.siuag.dao.UserDAO;
import com.example.siuag.entity.User;
import com.example.siuag.repository.SIUAGDatabase;
import com.example.siuag.util.StringUtils;

public class AuthenticationService {

    public static boolean isValidUser(Context context, String username, String password){
        SIUAGDatabase database = SIUAGDatabase.getInstance(context);
        User user = database.userDAO().findByUserName(username);

        return !StringUtils.isEmpty(password) && !StringUtils.isEmpty(user) && user.getPassword().equals(password);
    }

}
