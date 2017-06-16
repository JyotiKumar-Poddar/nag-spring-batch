package com.nag.batch.nagspringbatch.stringtonumberjob;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * Created by jyotipoddar on 6/15/2017.
 */
public class StringItemReader implements ItemReader<String> {

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        return PopulateString.getStringFromStack();
    }
}
