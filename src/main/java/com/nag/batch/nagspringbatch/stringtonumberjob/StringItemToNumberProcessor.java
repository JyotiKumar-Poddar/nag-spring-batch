package com.nag.batch.nagspringbatch.stringtonumberjob;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by jyotipoddar on 6/15/2017.
 */
public class StringItemToNumberProcessor implements ItemProcessor<String,Integer>{
    @Override
    public Integer process(String item) throws Exception {
        return Integer.parseInt(item);
    }
}
