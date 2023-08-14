package cn.edu.guet.householdserver.Controller;

import cn.edu.guet.householdserver.common.ResponseData;
import cn.edu.guet.householdserver.service.TeacherService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗云之
 */
@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("/select")
    public ResponseData selectAllTeacherById(String teacherId){
        return ResponseData.ok(teacherService.selectTeacherById(teacherId));

    }

}
