package com.lmt.service;

import com.lmt.entity.NoteResult;

/**
 * Created by 张洲徽 on 2018/12/6.
 */
public interface NoteService {
    public NoteResult loadBookNotes(String bookId);
    public NoteResult addNote(String bookId,String userId,String noteTitle);
    public NoteResult loadNoteDetail(String id);
    /*
    public NoteResult searchNotes(SearchNoteParams params);
    public NoteResult moveNote(String noteId,String bookId);
    public NoteResult loadShare(String shareId);
    public NoteResult searchShare(String keyword);
    public NoteResult shareNote(String noteId);
    public NoteResult updateNote(String noteTitle,String noteBody,String noteId);
    */
}
