package com.example.cachedemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author 陈震 【1525822@qq.com】
 * @Date 2020-05-25 16:36
 */
@Mapper
@Repository
public interface DAO {

  @Select("select id, auth, name, isbn, prize from t_book_info where isbn = #{bookID}")
  Item getBoolInfo(String bookID);

}
