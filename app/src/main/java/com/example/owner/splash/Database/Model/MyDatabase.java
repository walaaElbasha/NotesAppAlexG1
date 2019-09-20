package com.example.owner.splash.Database.Model;

import android.content.Context;

import com.example.owner.splash.Database.Model.DAOs.NotesDao;
import com.example.owner.splash.Database.Model.Model.Note;

import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {Note.class},version = 1,exportSchema = false)

public abstract class MyDatabase extends RoomDatabase {

    private static MyDatabase dataBase;
    public static final String DB_NAME="NotesDatabase";
    public abstract NotesDao notesDao();
    private MyDatabase() {
    }

    public static MyDatabase getInstance(Context context){
        if (dataBase==null) {
            dataBase = new RoomDatabase.Builder(context,MyDatabase.class,DB_NAME).fallbackToDestructiveMigration().build();



        }
        return dataBase;


    }
}
