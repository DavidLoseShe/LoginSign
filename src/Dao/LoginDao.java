package Dao;

import entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.Main;

import java.util.List;

/**
 * Created by d on 2017/5/17.
 */
public class LoginDao {

   public boolean CheckLogin(String susername,String spassword){

       String hql = "from StudentEntity where susername=?1 and spassword=?2";
      Session session = Main.getSession().getSession();
       Query query = session.createQuery(hql);
       //第1种方式
        query.setParameter(1, susername);
        query.setParameter(2, spassword);
       List<StudentEntity> list = query.list();
       for(StudentEntity studentEntity : list){
           return true;
       }
        return false;

    }
}
