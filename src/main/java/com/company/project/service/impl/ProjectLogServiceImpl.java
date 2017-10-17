package com.company.project.service.impl;

import com.company.project.dao.ProjectLogMapper;
import com.company.project.model.ProjectLog;
import com.company.project.service.ProjectLogService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/10/17.
 */
@Service
@Transactional
public class ProjectLogServiceImpl extends AbstractService<ProjectLog> implements ProjectLogService {
    @Resource
    private ProjectLogMapper projectLogMapper;

}
