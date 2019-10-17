package com.ravindra.config;

import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ravindra.job.SampleJobDetail;

@Configuration
public class TriggerProducer {
	@Bean
    public Trigger sampleJobTrigger(@SampleJobDetail JobDetail jobDetail) {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder
                .simpleSchedule()
                .withIntervalInSeconds(2)
                .repeatForever();

        return TriggerBuilder
                .newTrigger()
                .forJob(jobDetail)
                .withSchedule(scheduleBuilder)
                .build();
    }
}