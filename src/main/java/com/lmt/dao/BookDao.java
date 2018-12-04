package com.lmt.dao;

/**
 * Created by 张洲徽 on 2018/12/4.
 */

import com.lmt.annotation.MybatisDao;
import com.lmt.entity.NoteBook;

import java.util.List;
@MybatisDao
public interface BookDao {
    public void save(NoteBook book);
    public List<NoteBook> findByUserId(String userId);
}
