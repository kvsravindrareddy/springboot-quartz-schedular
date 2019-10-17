package com.ravindra.config;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ravindra.job.SampleJob;
import com.ravindra.job.SampleJobDetail;

@Configuration
public class JobProducer {
	@Bean
    @SampleJobDetail
    public JobDetail sampleJobDetail() {
        return JobBuilder
                .newJob(SampleJob.class)
                .storeDurably()
                .build();
    }
}