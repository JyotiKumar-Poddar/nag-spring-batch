package com.nag.batch.nagspringbatch;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jyotipoddar on 6/18/2017.
 */

@Component
@ConfigurationProperties(prefix="foo")
public class AppConfigProperties {

    private String remoteAddress;
    private String testName;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Override
    public String toString() {
        return "AppConfigProperties{" +
                "remoteAddress='" + remoteAddress + '\'' +
                ", testName='" + testName + '\'' +
                '}';
    }
}
