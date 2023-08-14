package cn.edu.guet.householdserver.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName teacher
 */
@TableName(value ="teacher")
public class Teacher implements Serializable {
    /**
     * 
     */
    @TableId(value = "teacherId")
    private String teacherid;

    /**
     * 
     */
    @TableField(value = "departmentid")
    private String departmentid;

    /**
     * 
     */
    @TableField(value = "teacherName")
    private String teachername;

    /**
     * 
     */
    @TableField(value = "password")
    private String password;

    /**
     * 
     */
    @TableField(value = "studentNum")
    private Integer studentnum;

    /**
     * 
     */
    @TableField(value = "surplusNum")
    private Integer surplusnum;

    /**
     * 
     */
    @TableField(value = "title")
    private String title;

    /**
     * 
     */
    @TableField(value = "content")
    private String content;

    /**
     * 
     */
    @TableField(value = "status")
    private String status;

    /**
     * 
     */
    @TableField(value = "info")
    private String info;

    /**
     * 
     */
    @TableField(value = "phone")
    private String phone;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getTeacherid() {
        return teacherid;
    }

    /**
     * 
     */
    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    /**
     * 
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * 
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * 
     */
    public String getTeachername() {
        return teachername;
    }

    /**
     * 
     */
    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    /**
     * 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     */
    public Integer getStudentnum() {
        return studentnum;
    }

    /**
     * 
     */
    public void setStudentnum(Integer studentnum) {
        this.studentnum = studentnum;
    }

    /**
     * 
     */
    public Integer getSurplusnum() {
        return surplusnum;
    }

    /**
     * 
     */
    public void setSurplusnum(Integer surplusnum) {
        this.surplusnum = surplusnum;
    }

    /**
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     */
    public String getInfo() {
        return info;
    }

    /**
     * 
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Teacher other = (Teacher) that;
        return (this.getTeacherid() == null ? other.getTeacherid() == null : this.getTeacherid().equals(other.getTeacherid()))
            && (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()))
            && (this.getTeachername() == null ? other.getTeachername() == null : this.getTeachername().equals(other.getTeachername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getStudentnum() == null ? other.getStudentnum() == null : this.getStudentnum().equals(other.getStudentnum()))
            && (this.getSurplusnum() == null ? other.getSurplusnum() == null : this.getSurplusnum().equals(other.getSurplusnum()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeacherid() == null) ? 0 : getTeacherid().hashCode());
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        result = prime * result + ((getTeachername() == null) ? 0 : getTeachername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getStudentnum() == null) ? 0 : getStudentnum().hashCode());
        result = prime * result + ((getSurplusnum() == null) ? 0 : getSurplusnum().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teacherid=").append(teacherid);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", teachername=").append(teachername);
        sb.append(", password=").append(password);
        sb.append(", studentnum=").append(studentnum);
        sb.append(", surplusnum=").append(surplusnum);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", status=").append(status);
        sb.append(", info=").append(info);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}