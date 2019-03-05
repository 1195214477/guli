package com.guli.edu.service;

import com.guli.edu.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.edu.form.CourseInfoForm;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author Zhang
 * @since 2019-02-25
 */
public interface CourseService extends IService<Course> {
        boolean getCountBySubjectId(String subjectId);
        String saveCourseInfo(CourseInfoForm courseInfoForm);
}
