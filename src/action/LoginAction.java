package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.StudentEntity;
import service.LoginService;

/**
 * Created by d on 2017/5/17.
 */
public class LoginAction extends ActionSupport{
    StudentEntity studentEntity = new StudentEntity();
    LoginService loginService = new LoginService();

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public String Login(){

        if (loginService.LoginService(studentEntity.getSusername(),studentEntity.getSpassword())){
            return "success";
        }
        else  return  "false";

    }
}
