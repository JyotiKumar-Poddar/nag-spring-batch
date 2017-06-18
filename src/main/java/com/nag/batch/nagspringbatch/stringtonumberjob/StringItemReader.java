package com.nag.batch.nagspringbatch.stringtonumberjob;

import com.nag.batch.nagspringbatch.AppConfigProperties;
import com.nag.batch.nagspringbatch.JobCompletionNotificationListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jyotipoddar on 6/15/2017.
 */
public class StringItemReader implements ItemReader<String> {
    private static final Logger log = LoggerFactory.getLogger(StringItemReader.class);

    @Autowired
    private AppConfigProperties appConfigProperties;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        log.info("Loding ...confing from yml file ");
        log.info(appConfigProperties.toString());
        return PopulateString.getStringFromStack();
    }
}
