package cn.edu.guet.householdserver.service;

import cn.edu.guet.householdserver.bean.Teacher;


import java.util.List;


/**
* @author 罗云之
* @description 针对表【teacher】的数据库操作Service
* @createDate 2023-08-12 09:12:55
*/
public interface TeacherService{
List<Teacher> selectTeacherById(String teacher);
}
