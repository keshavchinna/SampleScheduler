package com.ehc.service;

import com.ehc.task.NotifierTask;
import com.ehc.task.schedulerTask;

public class SchedulerServiceImpl implements SchedulerServiceI {

  private schedulerTask schedulerTask;
  private NotifierTask notifierTask;


  public void executeScheduleTask() {
    getSchedulerTask().executeFirst();
  }


  public void executeNotificationTask() {
    getNotifierTask().execute();
  }


  public schedulerTask getSchedulerTask() {
    return schedulerTask;
  }


  public void setSchedulerTask(schedulerTask schedulerTask) {
    this.schedulerTask = schedulerTask;
  }


  public NotifierTask getNotifierTask() {
    return notifierTask;
  }


  public void setNotifierTask(NotifierTask notifierTask) {
    this.notifierTask = notifierTask;
  }

}
