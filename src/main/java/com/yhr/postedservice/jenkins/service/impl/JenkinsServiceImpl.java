package com.yhr.postedservice.jenkins.service.impl;

import com.yhr.postedservice.jenkins.service.JenkinsService;
import org.springframework.stereotype.Service;

/**
 * Created by YHR on 2017/11/26.
 */

@Service
public class JenkinsServiceImpl implements JenkinsService {


    @Override
    public void createJob() {

    }

    @Override
    public void updateJob() {

    }

    @Override
    public void deleteJob() {

    }

    @Override
    public boolean buildJob(boolean isParam, String param) {
        return false;
    }
}
