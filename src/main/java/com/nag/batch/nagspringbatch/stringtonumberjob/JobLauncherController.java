package com.nag.batch.nagspringbatch.stringtonumberjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Restful End end point to  launch the job
 * Created by jyotipoddar on 6/19/2017.
 * http://localhost:8080/jobLauncher link to launch the job
 */
@RestController
public class JobLauncherController {

    private static final Logger LOG = LoggerFactory.getLogger(JobLauncherController.class);
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private List<Job> jobs;

    @RequestMapping("/jobLauncher")
    public String handle() throws Exception {

        LOG.info("Spring batch job from the controller");
        Map<String, JobParameter> parametersMap;

        for (Job job : jobs) {
            parametersMap = new HashMap<>();
            parametersMap.put("creation_time", new JobParameter(new Date()));
            JobParameters jobParameters = new JobParameters(parametersMap);
            jobLauncher.run(job, jobParameters);
        }

        return "Welcome to spring batch job execution controller, You can check execution status on console";
    }
}
