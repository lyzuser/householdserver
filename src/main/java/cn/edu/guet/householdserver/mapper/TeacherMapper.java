package cn.edu.guet.householdserver.mapper;

import cn.edu.guet.householdserver.bean.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 罗云之
* @description 针对表【teacher】的数据库操作Mapper
* @createDate 2023-08-12 09:12:55
* @Entity cn.edu.guet.householdserver.bean.Teacher
*/
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
 List<Teacher> selectAllByTeacherId();
}




