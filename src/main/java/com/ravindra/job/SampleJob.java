package com.ravindra.job;

import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SampleJob extends QuartzJobBean{
	@Override
    protected void executeInternal(JobExecutionContext context) {
        System.out.println("SampleJob invoked!");
    }
}