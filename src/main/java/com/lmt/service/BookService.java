package com.lmt.service;

import com.lmt.entity.NoteResult;

/**
 * Created by 张洲徽 on 2018/12/4.
 */
public interface BookService {
    public NoteResult addBook(String userId, String bookName);
    public NoteResult loadUserBooks(String userId);
}
