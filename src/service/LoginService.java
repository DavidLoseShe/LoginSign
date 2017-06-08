package service;

import Dao.LoginDao;

/**
 * Created by d on 2017/5/17.
 */
public class LoginService {
    public boolean LoginService(String susername,String spassword){
        LoginDao loginDao = new LoginDao();
       return  loginDao.CheckLogin(susername,spassword);
    }
}
