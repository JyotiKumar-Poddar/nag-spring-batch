package com.nag.batch.nagspringbatch.stringtonumberjob.listner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * Created by jyotipoddar on 6/16/2017.
 */
public class CustomJobExecutionListener implements JobExecutionListener {
    private static final Logger LOG = LoggerFactory.getLogger(CustomJobExecutionListener.class);
    @Override
    public void beforeJob(JobExecution jobExecution) {
        LOG.info("CustomJobExecutionListener start time"+jobExecution.getCreateTime());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        LOG.info("CustomJobExecutionListener end time "+jobExecution.getEndTime());
    }
}
