package cn.edu.guet.householdserver.service.impl;

import cn.edu.guet.householdserver.bean.Teacher;
import cn.edu.guet.householdserver.service.TeacherService;
import cn.edu.guet.householdserver.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 罗云之
* @description 针对表【teacher】的数据库操作Service实现
* @createDate 2023-08-12 09:12:55
*/
@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> selectTeacherById(String teacher) {
        return teacherMapper.selectAllByTeacherId();
    }
}




