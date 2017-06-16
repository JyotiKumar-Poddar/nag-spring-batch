package com.nag.batch.nagspringbatch.stringtonumberjob;

import com.nag.batch.nagspringbatch.stringtonumberjob.listner.CustomJobExecutionListener;
import com.nag.batch.nagspringbatch.stringtonumberjob.listner.CustomStepListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jyotipoddar on 6/16/2017.
 */
@Configuration
@EnableBatchProcessing
public class StringToNumberBatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public StringItemReader stringItemReader() {
        PopulateString.populateString();
        return new StringItemReader();
    }

    @Bean
    public StringItemToNumberProcessor stringItemToNumberProcessor() {
        return new StringItemToNumberProcessor();
    }

    @Bean
    public StringItemWriter stringItemWriter() {
        return new StringItemWriter();
    }

    // Step listener
    @Bean
    public CustomStepListener customStepListener() {
        return new CustomStepListener();
    }


    //job listner

    @Bean
    public CustomJobExecutionListener customJobExecutionListener(){
        return new CustomJobExecutionListener();
    }

    @Bean
    public Job stringToNumber(final CustomJobExecutionListener customJobExecutionListener) {
        return jobBuilderFactory.get("stringToNumber")

                .incrementer(new RunIdIncrementer())
                .listener(customJobExecutionListener)
                .flow(step2())
                .end()
                .build();
    }

    @Bean
    public Step step2() {
        return stepBuilderFactory.get("stringToNumber")
                .listener((customStepListener()))
                .<String, Integer>chunk(1)
                .reader(stringItemReader())
                .processor(stringItemToNumberProcessor())
                .writer(stringItemWriter())
                .build();
    }


}
