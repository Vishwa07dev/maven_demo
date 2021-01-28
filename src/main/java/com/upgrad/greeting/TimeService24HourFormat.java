package com.upgrad.greeting;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;


@Component("timeService24HourFormat")
public class TimeService24HourFormat implements TimeService {
  @Override
  public int getCurrentTime() {
    return LocalDateTime.now().getHour();
  }
}
