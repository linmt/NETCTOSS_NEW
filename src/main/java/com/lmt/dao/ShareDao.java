package com.lmt.dao;

import com.lmt.annotation.MybatisDao;
import com.lmt.entity.Share;

import java.util.List;
import java.util.Map;

/**
 * Created by 热带雨林 on 2018/12/8.
 */
@MybatisDao
public interface ShareDao {
    public void save(Share share);
    public Share findByNoteId(String noteId);
    //public List<Share> findLikeTitle(String title);
    public List<Map> findLikeTitle(String title);
    public Share findById(String id);
}
