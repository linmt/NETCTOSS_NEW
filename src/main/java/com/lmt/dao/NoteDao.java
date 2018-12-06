package com.lmt.dao;

import com.lmt.annotation.MybatisDao;

import java.util.List;
import java.util.Map;

/**
 * Created by 张洲徽 on 2018/12/6.
 */
@MybatisDao
public interface NoteDao {
    /*
    public int batchDelete(String[] ids);
    //动态更新
    public int dynamicUpdate(Note note);
    //组合查询
    public List<Note> findNotes(NoteBean note);
    //public int updateBookId(
    //	Map<String, Object> params);
    //public int recycle(String id);
    //public int update(Note note);
    public void save(Note note);
    public Note findById(String id);
    */
    //public List<Note> findByBookId(String bookId);
    public List<Map> findByBookId(String bookId);
}