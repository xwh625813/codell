package com.org.codell.service.ums.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.org.codell.service.ums.UmsResourceService;
import com.org.dmg.mapper.UmsResourceMapper;
import com.org.dmg.model.UmsResource;
import com.org.dmg.model.UmsResourceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 后台资源管理Service实现类
 * Created by macro on 2020/2/2.
 */
@Service
public class UmsResourceServiceImpl implements UmsResourceService {
    @Autowired
    private UmsResourceMapper resourceMapper;

    @Override
    public List<UmsResource> listAll() {
        return resourceMapper.selectByExample(new UmsResourceExample());
    }
}
