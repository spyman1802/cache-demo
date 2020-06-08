package com.example.cachedemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.stream.IntStream;

/**
 * @Author 陈震 【1525822@qq.com】
 * @Date 2020-05-25 16:40
 */
@Service
@Slf4j
public class CacheService {

  @Autowired
  DAO dao;

  private Vector<String> cache = new Vector<String>();

  @Cacheable(value = "book", key = "#bookID", unless = "#result == null")
  public Item getBookInfo(String bookID) {
//    log.info("cache");
    return dao.getBoolInfo(bookID);
  }

  public Item getBookInfoNoCache(String bookID) {
//    log.info("No cache");
    return dao.getBoolInfo(bookID);
  }

}
