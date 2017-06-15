package com.nag.batch.nagspringbatch;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by jyotipoddar on 6/15/2017.
 */
public class StringItemWriter implements ItemWriter<Integer> {
    @Override
    public void write(List<? extends Integer> items) throws Exception {
        items.forEach(System.out::println);
    }
}
