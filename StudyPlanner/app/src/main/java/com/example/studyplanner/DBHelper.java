package com.example.studyplanner;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "eventdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table eventdetails(title TEXT primary key, description TEXT, date TEXT, time TEXT, eventname TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVersion, int newVersion) {
        DB.execSQL("drop Table if exists eventdetails");
    }

    public Boolean insertevent(String title, String description, String date, String time, String eventname) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", title);
        contentValues.put("description", description);
        contentValues.put("date", date);
        contentValues.put("time", time);
        contentValues.put("eventname", eventname);
        long result = DB.insert("eventdetails", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    Cursor readalldata(){
        String query = "SELECT * FROM "+ "eventdetails";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if(db != null){
            cursor=db.rawQuery(query,null);
        }
        return cursor;
    }
}