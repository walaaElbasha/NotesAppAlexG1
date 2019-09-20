package com.example.owner.splash.Database.Model.DAOs;

import com.example.owner.splash.Database.Model.Model.Note;

import java.util.List;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

public interface NotesDao {
    @Insert
    void addNote (Note note);
    @Update
    void updateNote(Note note);
    @Delete
    void deleteNote(Note note);
    @Query("delete from Note where id=:id")
    void deleteNote(int id);
    @Query("select * from Note where title=:title ")
    List<Note> searchtNoteBytitle(String title);
    @Query("select * from Note where title=:title")
    List<Note>getAllNotes();




}
