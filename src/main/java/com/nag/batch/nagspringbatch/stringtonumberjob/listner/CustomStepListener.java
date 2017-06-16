package com.nag.batch.nagspringbatch.stringtonumberjob.listner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

/**
 * Created by jyotipoddar on 6/16/2017.
 */
public class CustomStepListener implements StepExecutionListener {
    private static final Logger LOG = LoggerFactory.getLogger(CustomStepListener.class);
    @Override
    public void beforeStep(StepExecution stepExecution) {
        LOG.info("before step :-"+stepExecution.getStepName());
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        return stepExecution.getExitStatus();
    }
}
