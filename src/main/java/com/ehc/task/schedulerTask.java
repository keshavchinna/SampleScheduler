package com.ehc.task;

import org.apache.log4j.Logger;

import java.util.Date;


public class schedulerTask {

  private static Logger log = Logger.getLogger(schedulerTask.class);

  public void executeFirst() {
    log.debug(new Date() + ": FirstTask runs successfully...");
  }

}
