package com.yhr.postedservice.jenkins.service;

/**
 * Created by YHR on 2017/11/26.
 */
public interface JenkinsService {

    void createJob();

    void updateJob();

    void deleteJob();

    boolean buildJob(boolean isParam, String param);
}
