package com.example.cachedemo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 陈震 【1525822@qq.com】
 * @Date 2020-05-25 16:29
 */

@Data
public class Item implements Serializable {

  String isbn;

  String name;

  String auth;

  String id;

  long prize;
}









//  drop table t_book_info;
//  create table t_book_info (id number(10), isbn varchar2(13), name varchar2(100), auth varchar2(100), prize number(10));
//  create sequence seq_item_id;
//
//  begin
//  for i in 1 .. 100 * 10000 loop
//
//  insert into t_book_info values (seq_item_id.nextval, to_char(trunc(dbms_random.value * 9)) || '-' || lpad(to_char(dbms_random.value * 1000000000), 9, '0'), dbms_random.string('p', 100), dbms_random.string('p', 100), trunc(dbms_random.value * 1000000));
//
//    if mod(i, 1000) = 0 then
//          commit;
//  end if;
//
//  end loop;
//  commit;
//  end;
///