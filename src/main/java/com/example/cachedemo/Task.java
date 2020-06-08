package com.example.cachedemo;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author 陈震 【1525822@qq.com】
 * @Date 2020-06-03 23:22
 */
@Component
@Slf4j
public class Task {

  private AtomicInteger ai = new AtomicInteger();

  @Scheduled(cron = "0/2 * * * * ?")
  @SchedulerLock(name = "testSchedule", lockAtLeastFor = "1s")
  public void testjob() {
//    log.info("Now =====> {}", ai.incrementAndGet());
  }
}
