package com.example.cachedemo;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 陈震 【1525822@qq.com】
 * @Date 2020-05-25 16:27
 */
@RestController
@Slf4j
public class Controller {

  @Autowired
  CacheService cacheService;


  @RequestMapping(value = "/nocache", method = RequestMethod.GET)
  public Item GetItemInfoNoCache(@RequestParam @NonNull String bookID) {
    return cacheService.getBookInfoNoCache(bookID);

  }

  @RequestMapping(value = "/cache", method = RequestMethod.GET)
  public Item GetItemInfoFromCache(@RequestParam @NonNull String bookID) {
    return cacheService.getBookInfo(bookID);

  }

}
