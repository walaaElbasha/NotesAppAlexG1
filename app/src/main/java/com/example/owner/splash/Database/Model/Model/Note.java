package com.example.owner.splash.Database.Model.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Note {
    @PrimaryKey(autoGenerate = true)
    int id;


    @ColumnInfo
    String title;
    @ColumnInfo
    String content;
    @ColumnInfo
    String dateTime;


    @Ignore
    String metadata;

    public Note() {
    }

    @Ignore
    public Note(String title, String content, String dateTime) {
        this.title = title;
        this.content = content;
        this.dateTime = dateTime;
    }

}
