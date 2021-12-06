package com.example.myloginactivity.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class MyDao {
    private final MySQLiteHelper helper;

    public MyDao(Context context) {

        this.helper = new MySQLiteHelper(context);
    }
    public void add(String user_name, String user_password){
        SQLiteDatabase db = helper.getWritableDatabase();
        db.execSQL("insert into "+Constants.TABLE_NAME_USER+"(user_name,user_password) values(?,? )",
                new Object[]{user_name,user_password});}
}
