package com.guli.edu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guli.edu.entity.Teacher;
import com.guli.edu.mapper.TeacherMapper;
import com.guli.edu.query.TeacherQuery;
import com.guli.edu.service.TeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.Serializable;

/**
 * <p>
 * 讲师 服务实现类
 * </p>
 *
 * @author Zhang
 * @since 2019-02-25
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {



    @Override
    public void pageQuery(Page<Teacher> pageParam, TeacherQuery teacherQuery) {

        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("sort");

        if(teacherQuery == null){
            baseMapper.selectPage(pageParam,queryWrapper);
            return;
        }

        String name = teacherQuery.getName();
        Integer level = teacherQuery.getLevel();
        String begin = teacherQuery.getBegin();
        String end = teacherQuery.getEnd();

        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("name",name);
        }

        if(!StringUtils.isEmpty(level)){
            queryWrapper.eq("level",level);
        }

        if(!StringUtils.isEmpty(begin)){
            queryWrapper.gt("gmt_create",begin);
        }

        if(!StringUtils.isEmpty(end)){
            queryWrapper.le("gmt_create",end);
        }

        baseMapper.selectPage(pageParam,queryWrapper);
    }

    @Override
    public boolean removeById(Serializable id) {
        Integer result = baseMapper.deleteById(id);
        return null != result && result > 0;
    }
}
