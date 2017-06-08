package util;

import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class BaseDAO<T> {

	private Session getSession(){
		return Main.getSession();
	}



	public void create(T object){    //插入数据
	Session session = getSession().getSession(); //开启一个hibernate会话
	
	try{
		session.beginTransaction(); //开启事务
		session.persist(object); //将对象保存进数据库
		session.getTransaction().commit();//提交事务
	}catch(Exception e){
		System.out.println(e.toString());
		session.getTransaction().rollback();//如果有异常抛出，则回滚事务
	}
	finally{
		session.close();  // 关闭hibernate会话
	}
	
	}
	
	
	
	public void update(T object){    //插入数据
		Session session = getSession().getSession(); //开启一个hibernate会话
		
		try{
			session.beginTransaction(); //开启事务
			session.update(object); //更新object对应的数据行
			session.getTransaction().commit();//提交事务
		}catch(Exception e){
			System.out.println(e.toString());
			session.getTransaction().rollback();//如果有异常抛出，则回滚事务
			
		}
		finally{
			session.close(); // 关闭hibernate会话
		}
		
		}
	
	
	public void delete(T object){    //插入数据
		Session session = getSession().getSession(); //开启一个hibernate会话
		
		try{
			session.beginTransaction(); //开启事务
			session.delete(object); //删除object对应的数据行
			session.getTransaction().commit();//提交事务
			session.flush(); //
		
		}catch(Exception e){
			System.out.println(e.toString());
			session.getTransaction().rollback();//如果有异常抛出，则回滚事务
		}
		finally{
			session.close(); // 关闭hibernate会话
		}
		
		}
	
	@SuppressWarnings("unchecked")
	public T  find(Class <? extends T> Clazz, Serializable id ){    //根据id查找Entity Bean
		Session session = getSession().getSession(); //开启一个hibernate会话
		
		try{
			session.beginTransaction(); //开启事务
			return (T) session.get(Clazz, id); //根据id查询实体类对象
		}
		finally{
			session.getTransaction().commit();//提交事务
			session.close(); // 关闭hibernate会话
		}
	}
		
		@SuppressWarnings("unchecked")
		public List< T >  find(String hql) {    //查找多个Entity Bean
			Session session = getSession().getSession(); //开启一个hibernate会话

			try {
				session.beginTransaction(); //开启事务
				return session.createQuery(hql).list(); //查询hql结果，返回list对象
			} finally {
				session.getTransaction().commit();//提交事务
				session.close(); // 关闭hibernate会话
			}
		}


}
