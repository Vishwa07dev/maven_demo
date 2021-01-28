package com.upgrad.greeting;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;


@Component("timeService12HourFormat")
public class TimeService12HourFormat implements TimeService {

  public int getCurrentTime() {

    int hour = LocalDateTime.now().getHour();
    return hour >12 ? hour-12 :hour ;
  }
}
